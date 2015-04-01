package simpleLib;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * A User is a generic user of the library management system which consists of a name and an integer ID number. A User can either a student or faculty member. The former has a maximum of 6 Loans, the latter 12.
 * <!-- end-UML-doc -->
 * @author C
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class User {
	
	User(int id, String n){
		userId = id;
		name = n;
	}
	
	public final int STUDENT_MAX_LOANS = 6;
	public final int FACULTY_MAX_LOANS = 12;
	protected int maxLoans;
	//Users users;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int userId;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String name;
	
	protected ArrayList<Loan> loans;	//Holds all of the loans that a user has borrowed
	
	//getter and setter methods

	public ArrayList<Loan> getLoans(){
		return loans;
	}
	
	public String getName(){
		return name;
	}
	
	public int getUserId(){
		return userId;
	}
	
	public int getMaxLoans(){
		return maxLoans;
	}
	
	public void setMaxLoans(int m){
		this.maxLoans = m;
	}
	
	public void printUser(){
		System.out.println("User ID: "+ this.getUserId());
		System.out.println("Name: "+ this.getName());
	}
	
	/**
	 * Determines if the user has borrowed the maximum item limit and returns true if it is, false if it is not.
	 * @return
	 */
	public boolean isAtMaxLoans(){
		return (this.getMaxLoans() <= this.loans.size());
	}
	
	/**
	 * Given a name and id, checks them against the current User object and returns true if they are the same.
	 * @param username
	 * @param id
	 * @return
	 */
	public boolean validateLogin(String username, int id){
		if((username.equals(this.name) && id == (this.userId))){
			return true;
			}
		else{
			System.out.println("Incorrect username or ID.");
			return false;
		}
	}
	

	
	/**
	 * Allows the user to checkout an item from the library. First a successful search of the item must be completed. 
	 * The user must not have the maximum number of allotted loans. 
	 * A new loan is created and added to both the user's loan list and the library's transaction record.
	 * The number of copies of the item is decremented by one.
	 * @param lib The library itself
	 */
	public void checkout(Library lib) {//check maxReserved(), isReserved() (if copies ==num reserved)
		// begin-user-code
		// TODO Auto-generated method stub
		if(lib.titleSearch() && !this.isAtMaxLoans() && !(lib.getFoundItem().isUnavailable())){
			// if the item was found in the items array, has more than one copy available,
			//and user not at max loans, else cannot checkout
			System.out.println("Checking out.\n");
			Loan loan = new Loan();		//create new loan
			loan.setLoanItem(lib.getFoundItem());
			loan.setLoanUser(this);
			Date d = new Date();
			loan.setIssueDate(d);	//need another method that calculates due date from item type. Here both issueDate and dueDate are set to the current time
			loan.setDueDate(d);
			loan.printTransaction();
			lib.getFoundItem().decrementCopies(); 		//update number of copies
			loans.add(loan); 		//add to list of user's loans
			lib.getTransactions().add(loan); //add to the list of transactions
		}
		// end-user-code
	}
	
	/**
	 * This creates a numbered list all of the user's borrowed items and prompts the user to make an integer selection from the list.
	 * The selected item is deleted from the library's transaction records and from the user's borrowed items. 
	 * The number of copies of the item is then incremented by one. 
	 * @param lib
	 */
	public void returnItem(Library lib){
		if(loans.isEmpty()){			//if the user has no loans
			System.out.println("You have nothing to return!");
			return;
		}
		else{
			this.displayAllLoans();
			System.out.println("Enter a selection from above: ");		//implement guard against illegal input here
			Scanner scan = new Scanner(System.in);//maybe this whole IO block should be its own method
			int choice = 0;
			boolean valid = true;
			do{
				choice = scan.nextInt();
				if(choice < 1 || choice > this.loans.size()){
					System.out.println("Invalid selection, try again: ");
					valid = false;
				}
			} while(!valid);
			//iterate through user's loans and return the one corresponding to the selection
			Loan ret = this.loans.get(choice - 1);
			lib.setFoundItem(ret.getLoanItem());
			lib.getFoundItem().incrementCopies();
			this.loans.remove(ret);
			lib.deleteTransaction(ret);
				
			}
		}
	
	/**
	 * Display a list of all of the items that the user has borrowed.
	 */
	public void displayAllLoans(){
		System.out.println("Here are the items you have borrowed:");
		int itemNo = 0;
		for(Loan l: this.loans){
			itemNo++;
			System.out.println(itemNo + ". ");
			System.out.println(l.getLoanItem());
			System.out.println("Issue date: " + l.getIssueDate());
			System.out.println("Due Date: " + l.getDueDate());
		}
	}


	@Override
	public String toString(){
		return "Name: " + this.name + " Id: "+ this.userId;
	}
}
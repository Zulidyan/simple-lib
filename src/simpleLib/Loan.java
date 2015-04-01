package simpleLib;
import java.util.Date;

/** 
 * <!-- begin-UML-doc -->
 * The Loan class contains details about a borrowed Item, including the borrower, Item information, issue date, and due date.
 * <!-- end-UML-doc -->
 * @author C
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Loan {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private User user; //contains the user associated with this particular loan
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private boolean isReserved;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date dueDate;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date issueDate; //the current date whenever a user borrows an item
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	//private Date endDate;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Item item; //the item that is borrowed
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int transactionId; //the id of this particular loan
	//private Faculty faculty;
	
	//getter and setter methods
	public int getTransactionId(){
		return transactionId;
	}
	
	public void setTransactionId(int tr){
		this.transactionId = tr;
	}
	
	public Item getLoanItem(){
		return item;
	}
	
	public void setLoanItem(Item i){
		this.item = i;
	}
	
	public User getLoanUser(){
		return user;
	}
	
	public void setLoanUser(User u){
		this.user = u;
	}
	
	public Date getIssueDate(){
		return issueDate;
	}
	
	public Date getDueDate(){
		return dueDate;
	}
	
	public void setIssueDate(Date d){
		this.issueDate = d;
	}
	
	public void setDueDate(Date d){
		this.dueDate = d;
	}
	


	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
//	public void addLoan(User u){
//		u.loans.add(l);
//	}
	
	public void printTransaction(){
		System.out.println("----Transaction Details----");
		System.out.println("Transaction ID: "+ this.getTransactionId());
		System.out.println("Name: "+ user.getName());
		System.out.println("User ID: "+ user.getUserId());
		System.out.println("Title: "+ item.getTitle());
		System.out.println("Author: "+ item.getAuthor());
		System.out.println("Item ID: "+ item.getItemId());
		System.out.println("Issue Date: "+ this.getIssueDate());
		System.out.println("Due Date: "+ this.getDueDate() + "\n");
	}
	

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void reserve() {
		// begin-user-code
		// TODO Auto-generated method stub
		
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void extend() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}
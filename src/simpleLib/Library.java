package simpleLib;
/**
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.util.HashSet;
/** 
 * <!-- begin-UML-doc -->
 * The Library holds ArrayLists containing all of the Users, Items, and transactions(Loans).
 * <!-- end-UML-doc -->
 * @author C
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Library {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	
	/**
	 * Singleton constructor for Library class
	 */
	private Library(){
		transactions = new ArrayList<Loan>();
		users = new ArrayList<User>();
		items = new HashSet<Item>();
	}
	
	private static Library lib = new Library();
	
	/**
	 * 
	 * @return The singleton instance of Library
	 */
	public static Library getInstance(){
		return lib;
	}
	
	/** 
	 * The ArrayList containing all of the Users in the library.
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private ArrayList<User> users;
	
	/** 
	 * The ArrayList containing all of the Items in the library.
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private HashSet<Item> items;
	
	/** 
	 * The ArrayList containing all of the loan transactions in the library.
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private List<Loan> transactions;
	
	private Item foundItem;
	
	
	/**
	 * Get the item that was a result of a successful item search.
	 * @return The found Item
	 */
	public Item getFoundItem(){
		return foundItem;
	}
	
	/**
	 * Get the ArrayList that holds all of the Library's users
	 * @return User ArrayList
	 */
	public ArrayList<User> getUsers(){
		return users;
	}
	
	/**
	 * Get the ArrayList that holds all of the Library's items
	 * @return Item ArrayList
	 * @return
	 */
	public HashSet<Item> getItems(){
		return items;
	}
	
	/**
	 * Get the ArrayList that holds all of the Library's transactions that have taken place.
	 * @return Loan ArrayList
	 */
	public List<Loan> getTransactions(){
		return transactions;
	}
	
	/**
	 * Removes a transaction from the ArrayList of the Library's transactions.
	 * @param loan The particular Loan to be removed.
	 */
	public void deleteTransaction(Loan loan){
		transactions.remove(loan);
	}
	
	/**
	 * Prints all of the transactions in the ArrayList of the Library's transactions.
	 */
	public void printAllTransactions(){
		for(Loan l: this.transactions){
			l.printTransaction();
		}
	}
	
	/**
	 * Prints all of the users in the library
	 */
	public void printAllUsers(){
		for(User u: this.users){
			u.printUser();
		}
	}
	
	/**
	 * Search the ArrayList of the Library's users for a particular user by user ID and return it if found.
	 * @param id The User ID to be searched
	 * @return The User if it was found, null if it was not
	 */
	public User userSearch(int id){
		for(User u: this.users){
			if(u.getUserId() == id) return u;
		}
		return null;	//not found
	}
	
	/**
	 * Search the ArrayList of the Library's users for a particular user by user name and return it if found.
	 * @param name The User name to be searched
	 * @return The User if it was found, null if it was not
	 */
	public User userSearch(String name){
		for(User u: this.users){
			if(u.getName() == name) return u;
		}
		return null;	//not found
	}
	
	/**
	 * Given the type of User, name and ID, add it to the ArrayList of the Library's users
	 * @param name The name of the User
	 * @param id The ID of the User
	 * @param type The type of User. 1 if a new Faculty member is desired, 2 if a new Student member is desired
	 */
	public void addUser(String name, int id, int type){
		switch(type){
		case 1: //add new faculty
			User faculty = new Faculty(id, name);
			users.add(faculty);
			break;
		case 2: //add new student
			User student = new Student(id, name);
			users.add(student);
		}
	}
	
	public void removeUser(String name){
		try{
			User user = userSearch(name);
			//System.out.println(user.getName());
			if(user != null){
				users.remove(user);
				System.out.println("User removed.");
			}
			else
				System.out.println("User not found.");
			}
		catch(NullPointerException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Add a new Book to the ArrayList that contains the Library's item list.
	 * @param id The id for the new Book
	 * @param title The title for the new Book
	 * @param author The author of the new Book
	 * @param pubDate The publication date of the new Book
	 * @param pub The publisher of the new Book
	 * @param copies The number of copies of the new Book
	 * @param isbn The ISBN of the new Book
	 * @param pages The number of pages in the new Book
	 */
	public void addBook(int id, String title, String author, Date pubDate, String pub, int copies, String isbn, int pages){
		Item item = new Book(id, title, author, pubDate, pub, copies, isbn, pages);
		items.add(item);
	}
	
	/**
	 * Add a new Journal to the ArrayList that contains the Library's item list.
	 * @param id The id for the new Journal
	 * @param title The title for the new Journal
	 * @param author The author of the new Journal
	 * @param pubDate The publication date of the new Journal
	 * @param pub The publisher of the new Journal
	 * @param copies The number of copies of the new Journal
	 * @param volume The volume number of the new Journal
	 * @param issue The issue number of the new Journal
	 */
	public void addJournal(int id, String title, String author, Date pubDate, String pub, int copies, int volume, int issue){
		Item item = new Journal(id, title, author, pubDate, pub, copies, volume, issue);
		items.add(item);
	}
	
	/**
	 * Search the Library item array for an item by the title of the item.
	 * @return true if the item was found, false if it was not.
	 */
	public boolean titleSearch(){
		System.out.println("Enter the title: ");
		Scanner scan = new Scanner(System.in);
		String term = scan.nextLine();
		for(Item i: items){
			if(term.contains(i.getTitle())){
				System.out.println("Item found.\n");
				setFoundItem(i);
				return true;
			}
		}
		System.out.println("Item not found.");
		return false;
	}
	
	/**
	 * Search the Library item array for an item by author name.
	 * @return true if item was found, false if it was not.
	 */
//	public boolean authorSearch(){
//		System.out.println("Enter the author name: ");
//		Scanner scan = new Scanner(System.in);
//		String term = scan.nextLine();
//		for(Item i: this.items){
//			if(term.contains(i.getAuthor())){
//				System.out.println("Item found!");
//				setFoundItem(i);
//				return true;
//			}
//		}
//		System.out.println("Item not found.");
//		return false;
//	}
	
	public void setFoundItem(Item i){
		this.foundItem = i;
	}
	

}
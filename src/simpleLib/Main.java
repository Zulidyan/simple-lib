/**
 * Library management system
 * CS 4354 Spring 2015
 * By Christian Brading
 * 
 * A simple management system that emulates a typical library and can account for both students and faculty.
 */
package simpleLib;
import java.util.*;


/**
 * The Main class is the main driver class for running the library management system.
 * @author C
 *
 */
public class Main {

	//old code before restructuring below
	
//	Library library; //static? Only want one instance
//	
//	Main(){
//		library = Library.getInstance();
//	}
//	
//	//this method needs to be fixed. returns null if the user was not found in the library user ArrayList
//	public User login(){
//		int id = -1;
//		String name = "";
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Enter your username: ");
//		name = keyboard.nextLine();
//		System.out.println("Enter your ID: ");
//		id = keyboard.nextInt();
////			this.validateLogin(name, id);
//		
//		User user = library.userSearch(id);
//		if(!user.validateLogin(name, id)){//add nullpointer exception and input mismatch exception here
//			return null;
//		}
//		else{
//			System.out.println("Successful login.");
//			return user;
//		}
//	}
//	
//	public void displayMenu(User user){
//		boolean finished = false;
//		Scanner scan = new Scanner(System.in);
//		do{
//		System.out.println("############################\n "
//				         + "  Welcome to my library!\n"
//				         + "############################\n");
//		System.out.println("Select from the following:\n");
//		System.out.println("1. Borrow an item");
//		System.out.println("2. Return an item");
//		System.out.println("3. List all transactions in library");
//		System.out.println("4. List all of your borrowed items");
//		System.out.println("5. Search for an item by title");
//		System.out.println("6. Search for an item by author");
//		System.out.println("7. Add a new user");
//		System.out.println("8. Add a new document");
//		System.out.println("9. Exit");
//		
//		int choice = 0;
//
//			try{
//			choice = scan.nextInt();
//			}
//			catch(InputMismatchException e){
//				System.out.println("Please enter a valid selection.\n");
//				scan.next();	//consume enter
//			}
//			
//			switch(choice){
//			
//			case 1:
//				user.checkout(library);
//				break;
//			case 2:
//				user.returnItem(library);
//				break;
//			case 3:
//				library.printAllTransactions();
//				break;
//			case 4:
//				user.displayAllLoans();
//				break;
//			case 5:
//				library.titleSearch();
//				break;
//			case 6:
//				library.authorSearch();
//				break;
//			case 7:
//				addUserIO();
//				break;
//			case 8:
//				addItemIO();
//				break;
//			case 9:
////				System.out.println("Log out? y/n");
////				String s = scan.nextLine();
////				if(s.equalsIgnoreCase("Y")){
//					System.out.println("Bye!");
//					finished = true;
////				}
////				else{
////				break;
////				}
//			}
//		}while(!finished);
//	}

//public void addUserIO(){
//	try{
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the type of the new user(1 for faculty, 2 for student): ");
//		int newUserType = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Enter the name of the new user: ");
//		String newName = scan.nextLine();
//		System.out.println("Enter the ID of the new user: ");
//		int newId = scan.nextInt();
//		library.addUser(newName, newId, newUserType);
//		System.out.println("The user "+ newName + " has been added.\n");
//	}
//	catch(InputMismatchException e){
//		e.printStackTrace();
//		System.out.println("The user was not added.\n");
//	}
//}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main m = new Main(); 
		Library library = Library.getInstance();
		
		//add some users
		library.getUsers().add(new Student(2, "Bob"));
		library.getUsers().add(new Student(8, "Dennis"));
		library.getUsers().add(new Faculty(25, "Chen"));
		library.getUsers().add(new Faculty(33, "Andy"));
		
		//add some items
		Date pub = new Date();
		library.getItems().add(new Book(1, "Learning Java the Hard Way", "Graham Mitchell", pub, "O'Reilly", 3, "012345678", 209));
		library.getItems().add(new Book(2, "Catch 22", "Joseph Heller", pub, "Publishing house", 3, "017574399", 512));
		library.getItems().add(new Journal(3, "Science Magazine", "AAAS", pub, "Science haus.", 4, 1, 3));
		library.getItems().add(new Journal(4, "Q", "K. Max", pub, "Science haus.", 5, 3, 9));
		
		
		//User user = m.login();
		
		//main menu start
		GeneralView general = new GeneralView();
		general.start();
	}


}

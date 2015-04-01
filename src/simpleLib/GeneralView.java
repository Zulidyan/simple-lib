package simpleLib;
import java.util.*;

/**
 * GeneralView defines the general view that will display the main menu. From there, a user may select from either a User view,
 * Librarian view, or Admin view depending on the user's type.
 * @author C
 *
 */
public class GeneralView extends ConsoleUserInterface{
	protected void printMenu(){
		System.out.println("\nLibrary Main Menu\n" + 
							"1. Switch to User View\n" +
						   	"2. Switch to Librarian View\n"+
							"3. Switch to Admin View\n" +
						   	"4. Exit program");
	}
	
	public void start(){
		int choice = 0;
		boolean exitProgram = false;
		do{
			printMenu();
			try{
				choice = scan.nextInt();
				scan.nextLine();
				switch(choice){
				case 1: switchToUserView(); break;
				case 2: switchToLibrarianView(); break;
				case 3: switchToAdminView(); break;
				case 4: exitProgram = true; break;
				default: System.err.println("Please select a number between 1-4");
				}
			}
				catch(InputMismatchException e){
					System.err.println("Input mismatch, please try again. " + e);
					scan.nextLine();
				}
		}while(!exitProgram);
	}
	
	public void switchToUserView(){
		UserView u = new UserView();
		u.start();
	}
	
	public void switchToLibrarianView(){
		LibrarianView l = new LibrarianView();
		l.start();
	}
	
	public void switchToAdminView(){
		AdminView a = new AdminView();
		a.start();
	}

}

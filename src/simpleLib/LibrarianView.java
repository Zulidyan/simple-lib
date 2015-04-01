package simpleLib;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibrarianView extends ConsoleUserInterface{
	protected void printMenu(){
		System.out.println("Librarian View \n" + 
						   "\n1. Add new document" +
						   "\n2. List all transactions " +
						   "\n3. Return");
	}
	
	public void start(){
		int choice = 0;
		boolean exit = false;
		do{
			printMenu();
			try{
				choice = scan.nextInt();
				scan.nextLine();
				switch(choice){
				case 1: addItemIO(); break;
				case 2: printAllTransactions(); break;
				case 3: exit = true; break;
				default: System.err.println("Please select a number between 1-3");
				}
			}
				catch(InputMismatchException e){
					System.err.println("Input mismatch, please try again. " + e);
					scan.nextLine();
				}
		}while(!exit);
	}
	
	public void addItemIO(){
		try{
			scan = new Scanner(System.in);
			System.out.println("Enter the item type(1 for Book, 2 for Journal):");
			boolean valid = false;
			int newItemType;
			do{
				newItemType = scan.nextInt();
				scan.nextLine();
				if(newItemType > 0 && newItemType <= 2){
					valid = true;
				}
				else{
					System.out.println("Not a valid selection. Enter again: ");
				}
			}while(!valid);
			System.out.println("Enter the ID: ");
			int newItemId = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the title: ");
			String newTitle = scan.nextLine();
			System.out.println("Enter the author name: ");
			String newAuthor = scan.nextLine();
			System.out.println("Enter the publisher: ");
			String newPub = scan.nextLine();
			System.out.println("Enter the number of copies: ");
			int newCopies = scan.nextInt();
			scan.nextLine();//consume newline
			Date newPubDate = new Date();
			//if book is selected
			if(newItemType == 1){
				System.out.println("Enter the ISBN: ");
				String isbn = scan.nextLine();
				System.out.println("Enter the number of pages: ");
				int pages = scan.nextInt();
				lib.addBook(newItemId, newTitle, newAuthor, newPubDate, newPub, newCopies, isbn, pages);
			}
			else if(newItemType == 2){
				System.out.println("Enter the volume #: ");
				int vol = scan.nextInt();
				System.out.println("Enter the issue #: ");
				int issue = scan.nextInt();
				lib.addJournal(newItemId, newTitle, newAuthor, newPubDate, newPub, newCopies, vol, issue);
			}
			System.out.println("The document has been added.\n");
		}
		catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("The document was not added.\n");
		}
	}
	
	public void printAllTransactions(){
		lib.printAllTransactions();
	}

}

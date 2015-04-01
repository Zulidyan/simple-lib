package simpleLib;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminView extends ConsoleUserInterface{
	protected void printMenu(){
		System.out.println("\n Admin Menu\n"
				+ "\n1. Add User "
				+ "\n2. Remove User "
				+ "\n3. List Users"
				+ "\n4. Return");
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
			case 1: addUserIO(); break;
			case 2: removeUserIO(); break;
			case 3: lib.printAllUsers(); break;
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
	
public void addUserIO(){
	try{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the type of the new user(1 for faculty, 2 for student): ");
		int newUserType = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the name of the new user: ");
		String newName = scan.nextLine();
		System.out.println("Enter the ID of the new user: ");
		int newId = scan.nextInt();
		lib.addUser(newName, newId, newUserType);
		System.out.println("The user "+ newName + " has been added.\n");
	}
	catch(InputMismatchException e){
		e.printStackTrace();
		System.out.println("The user was not added.\n");
	}
}

public void removeUserIO(){
	try{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the user to be removed: ");
		String name = scan.nextLine();
		lib.removeUser(name);
	}
	catch(InputMismatchException e){
		e.printStackTrace();
		System.out.println("The user was not removed.\n");
	}
}
	
}

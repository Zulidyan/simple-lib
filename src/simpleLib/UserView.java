package simpleLib;

import java.util.InputMismatchException;

public class UserView extends ConsoleUserInterface{
	//search, borrow, return
	protected void printMenu(){
		System.out.println("\nUser View" +
							"\n1. Search"+
							"\n2. Borrow"+
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
				case 1: 
					int search = searchChoice();
					SearchContext context = new SearchContext();
					if(search == 1){
						context.setSearchStrategy(new TitleSearch());
					}
					else if(search == 2){
						context.setSearchStrategy(new AuthorSearch());
					}
					context.doSearch();
					break;
				case 2: 
					User user = new Student(1, "Main"); 
					user.checkout(lib);
					break;
				case 3: exit = true; break;
				default: System.err.println("Please select a number between 1-4");
				}
			}
				catch(InputMismatchException e){
					System.err.println("Input mismatch, please try again. " + e);
					scan.nextLine();
				}
		}while(!exit);
	}
	
	public int searchChoice(){
		System.out.println("\n1. Search by Title"+
						"\n2. Search by Author");
		int choice = scan.nextInt();
		return choice;
	}

}

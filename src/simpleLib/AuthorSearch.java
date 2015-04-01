package simpleLib;

import java.util.Scanner;

//Author search algorithm
public class AuthorSearch implements SearchStrategy{
	public boolean search(){
		Library lib = Library.getInstance();
		System.out.println("Enter the author name: ");
		Scanner scan = new Scanner(System.in);
		String term = scan.nextLine();
		for(Item i: lib.getItems()){
			if(term.contains(i.getAuthor())){
				System.out.println("Item found!");
				lib.setFoundItem(i);
				return true;
			}
		}
		System.out.println("Item not found.");
		return false;
	}

}

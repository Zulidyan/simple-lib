package simpleLib;

import java.util.Scanner;

//Title search algorithm
public class TitleSearch implements SearchStrategy{
	
	public boolean search(){
		System.out.println("Enter the title: ");
		Scanner scan = new Scanner(System.in);
		String term = scan.nextLine();
		Library lib = Library.getInstance();
		for(Item i: lib.getItems()){
			if(term.contains(i.getTitle())){
				System.out.println("Item found.\n");
				lib.setFoundItem(i);
				return true;
			}
		}
		System.out.println("Item not found.");
		return false;
	}

}

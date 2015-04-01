package simpleLib;
import java.util.Scanner;

/**
 * ConsoleUserInterface defines the console interface and is a generic class that defines the views.
 * @author C
 *
 */
public abstract class ConsoleUserInterface {
	protected static Scanner scan = new Scanner(System.in);
	protected abstract void printMenu();
	public abstract void start();
	protected Library lib = Library.getInstance(); //singleton method

}

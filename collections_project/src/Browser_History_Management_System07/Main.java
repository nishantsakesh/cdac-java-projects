package browser_history;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		browsermanager manager=new browsermanager();
		Scanner s = new Scanner(System.in);
		int choice;
		
		 do {
	            System.out.println("\n1 Visit Page");
	            System.out.println("2 Go Back");
	            System.out.println("3 Go Forward");
	            System.out.println("4 Show Current Page");
	            System.out.println("5 Show History");
	            System.out.println("6 Exit");
	            System.out.print("Choose an option: ");
	            
	            choice = s.nextInt();

	            switch (choice) {
	                case 1 -> manager.visitpage(s);
	                case 2 -> manager.goback();
	                case 3 -> manager.goforward();
	                case 4 -> manager.showcurrentpage();
	                case 5 -> manager.showhistory();
	                case 6 -> System.out.println("Exiting browser...");
	                default -> System.out.println("Invalid choice! Try again.");
	            }
	        } while (choice != 6);
		 s.close();
	}
}

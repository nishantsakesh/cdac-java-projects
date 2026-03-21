//package studentCourseRegistrationSystem;
import java.util.*;

public class studentApp {
	public static void main(String[] args) {
		
		studentmanager sm = new studentmanager();
		Scanner s = new Scanner(System.in);
		boolean exit = false;
		
		while(!exit) {
			System.out.println("\n--- Student Registration System ---");
	        System.out.println("1. Add Student\n2. View All\n3. Search by Name");
	        System.out.println("4. Update Course\n5. Remove Student\n6. Total Fees\n7. Exit");
	        System.out.print("Enter choice: ");
	        int choice=s.nextInt();
	        
	        switch(choice) {
	        case 1 -> sm.addStudent();
            case 2 -> sm.viewStudents();
            case 3 -> sm.searchStudent();
            case 4 -> sm.updateCourse();
            case 5 -> sm.removeStudent();
            case 6 -> sm.calculateTotalFees();
            case 7 -> exit = true;
            default -> System.out.println("Invalid choice!");
	        }
		}
		
		System.out.println("System closed.");
	    s.close();
		
	}

}

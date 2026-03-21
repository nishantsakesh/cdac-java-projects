import java.util.*;

public class studentmanager implements StudentOperations{
	
	Scanner s = new Scanner(System.in);
	HashMap<Integer,student> studentmap = new HashMap<>();

	@Override
	public void addStudent() {
		
		System.out.println("Enter the name of the student: ");
		String name = s.next();
		System.out.println("Enter the name of the course: ");
		String course = s.next();
		System.out.println("Enter the fees: ");
		double fee = s.nextDouble();
		
		student stu = new student(0,name,course,fee);
		studentmap.put(stu.getstudentId(), stu);
		
		System.out.println("Student added successfully! ID: " + stu.getstudentId());
		
	}
	
	@Override
	public void viewStudents() {
		if(studentmap.isEmpty()) {
			System.out.println("No student found!");
		}else {
			for(student s: studentmap.values()) {
				System.out.println(s);
			}
		}
	}

	@Override
	public void searchStudent() {
		System.out.println("Enter the name of the student: ");
		String searchname = s.next();
		boolean found =false;
		
		for(student s : studentmap.values()) {
			if(s.getstudentName().equalsIgnoreCase(searchname)){
				System.out.println("Student found! "+ s);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Student with name '" + searchname + "' not found.");
		}
	}

	
	@Override
	public void updateCourse() {
		System.out.println("Enter Student ID to update: ");
	    int id = s.nextInt();
		
	    student stu = studentmap.get(id);
	    
	    if(stu !=null) {
	    	System.out.println("Current Details: " + stu);
	    	
	    	System.out.println("Enter new course name: ");
	    	String newcourse = s.next();
	    	stu.setcourseName(newcourse);
	    	
	    	System.out.println("Enter new Fees: ");
	    	double newfees = s.nextDouble();
	    	stu.setfees(newfees);
	    	
	    	System.out.println("Course updated successfully for ID: " + id);
	    	
	    }else {
	    	System.out.println("Error: Student with ID " + id + " not found.");
	    }
		
	}

	@Override
	public void removeStudent() {
		
		System.out.println("Enter Student ID to remove: ");
		int id = s.nextInt();
		
		if(studentmap.remove(id) !=null) {
			System.out.println("Student with ID " + id + " removed successfully.");
		}else {
			System.out.println("ID not found. No student removed.");
		}
	}
	

	@Override
	public void calculateTotalFees() {
		double totalrevenue=0;
		
		if (studentmap.isEmpty()) {
	        System.out.println("No students found. Total Fees: 0.0");
	        return;
	    }
		
		for (student stu : studentmap.values()) {
	        double originalFee = stu.getfees();
	        double discountedFee = originalFee;

	        // Apply highest applicable discount first
	        if (originalFee > 50000) {
	            discountedFee = originalFee * 0.85; // 15% discount
	        } else if (originalFee > 20000) {
	            discountedFee = originalFee * 0.90; // 10% discount
	        }

	        totalrevenue += discountedFee;
	        System.out.println("Student: " + stu.getstudentName() + 
	                           " | Original: " + originalFee + 
	                           " | After Discount: " + discountedFee);
	    }

	    System.out.println("-------------------------------------------");
	    System.out.println("Total Fees Collected (Net): " + totalrevenue);
	}
	
}
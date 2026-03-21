
import java.util.ArrayList;
import java.util.Scanner;

class Task {
	private int taskId;
	private String taskName;
	private String taskStatus;
	
	Task(int taskId,String taskName, String taskStatus){
		this.taskId= taskId;
		this.taskName= taskName;
		this.taskStatus = taskStatus;
	}
	
	public int getTaskId() {
		return taskId;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	void displayTask() {
		System.out.println("ID: " + taskId + " | Name: " + taskName + " | Status: " + taskStatus);
	}
}




class TaskManager{
	private ArrayList<Task> Tasks =	new ArrayList<>();
	
	public void addTask(Task task) {
		Tasks.add(task);
		System.out.println("Task added successfully.");
	}
	
	
	
	public void viewTasks() {
		if(Tasks.isEmpty()) {
			System.out.println("No tasks found.");
		}else {
			for (Task t: Tasks) {
				t.displayTask();
			}
		}
	}
	
	public void updateTaskStatus(int id, String newStatus){
		for (Task t : Tasks) {
			if(t.getTaskId()==id) {
				t.setTaskStatus(newStatus);
				System.out.println("Status updated.");
                return;
			}
		}
		System.out.println("Task ID not found.");
	}
	
	public void deleteTask(int id) {
		boolean removed = Tasks.removeIf(t -> t.getTaskId() == id);
		if (removed) {
			System.out.println("Task deleted.");
		}else {
			System.out.println("Task id not found.");
		}
	}
	
}



public class TaskSystem{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		TaskManager manager = new TaskManager();
		int choice;
		
		
		do {
			System.out.println("\n--- Task Menu ---");
            System.out.println("1. Add Task\n2. View Tasks\n3. Update Status\n4. Delete Task\n5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
            case 1:
                System.out.print("ID: "); int id = sc.nextInt();
                sc.nextLine();// clear buffer concept
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Status: "); String status = sc.nextLine();
                manager.addTask(new Task(id, name, status));
                break;
            case 2:
                manager.viewTasks();
                break;
            case 3:
                System.out.print("Task ID to update: "); int uId = sc.nextInt();
                sc.nextLine();
                System.out.print("New Status: "); String nStatus = sc.nextLine();
                manager.updateTaskStatus(uId, nStatus);
                break;
            case 4:
                System.out.print("Task ID to delete: "); int dId = sc.nextInt();
                manager.deleteTask(dId);
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid entry.");
        }
            
			
		}while(choice !=5);
		sc.close();
		
		
	}
}
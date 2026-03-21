import java.util.ArrayList;

public class task{
	private int taskId;
	private String taskName;
	private String taskStatus;
	
	task(int taskId,String taskName, String taskStatus){
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




class taskManager{
	private ArrayList<task> Tasks =	new ArrayList<>();
	
	public void addTask(task task) {
		Tasks.add(task);
		System.out.println("Task added successfully.");
	}
	
	
	
	public void viewTasks() {
		if(Tasks.isEmpty()) {
			System.out.println("No tasks found.");
		}else {
			for (task t: Tasks) {
				t.displayTask();
			}
		}
	}
	
	public void updateTaskStatus(int id, String newStatus){
		for (task t : Tasks) {
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
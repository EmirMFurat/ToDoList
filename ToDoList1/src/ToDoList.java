import java.util.ArrayList;

public class ToDoList {
	
	private ArrayList<Task> tasks;
	public ToDoList() {
		this.tasks =new ArrayList<>();
	}
	
	public void addTask(String taskName) {
		Task newTask =new Task (taskName);
		tasks.add(newTask);
		System.out.println("Task added: "+ taskName);
	}
	public void listTasks() {
		if (tasks.isEmpty()) {
		System.out.println("Task list is empty");
		return;
	}
		System.out.println("To Do List: ");
		for (int i=0;i<tasks.size();i++) {
			System.out.println((i+1)+". "+tasks.get(i));			
		}
	}
	
	public void compTask(int taskIndex) {
		if (taskIndex >=0 && taskIndex <tasks.size()) {
			tasks.get(taskIndex).setComp(true);
			System.out.println("Task is done: "+ tasks.get(taskIndex).getName());
		}
		else {
			System.out.println("Invalid task number!");
		}
		
	}
	
	public void deleteTask(int taskIndex) {
		if (taskIndex >=0 && taskIndex <tasks.size()) {
			System.out.println(tasks.get(taskIndex).getName()+"this task is deleted.");
			tasks.remove(taskIndex);
		}
		else {
			System.out.println("Invalid task number!");
		}
	}
	
	
	

	public static void main(String[] args) {
	

	}

}

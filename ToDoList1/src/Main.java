import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		ToDoList todolist= new ToDoList();
		
		while(true) {
			System.out.println("\n--- To Do List ---");
			System.out.println("1- Add Task ");
			System.out.println("2- Task List");
			System.out.println("3- Complete Task");
			System.out.println("4- Delete Task");
			System.out.println("5- Exit");
			System.out.print("--Make your choice!--");
			
			int choose= scanner.nextInt();
			scanner.nextLine();
			
			switch (choose) {
			case 1:
				System.out.println("Type your new Task: ");
				String newTask=scanner.nextLine();
				todolist.addTask(newTask);
				break;
			case 2:
				todolist.listTasks();
				break;
			case 3:
				todolist.listTasks();
				System.out.println("Enter the number of completed Task: ");
				int compIndex = scanner.nextInt()-1;
				todolist.compTask(compIndex);
				break;
				
			case 4: 
				todolist.listTasks();
				System.out.println("Enter the task number you want to delete: ");
				int deleteIndex= scanner.nextInt()-1;
				todolist.deleteTask(deleteIndex);
				break;
			case 5:
				 System.out.println("Exiting the application...");
				 return;
				 
			default:
				System.out.println("Invalid number! Choose number between 1-5.");
			}
			
			
			
			
		}
		
		
	}

}

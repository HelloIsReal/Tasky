import java.util.ArrayList;
import java.util.Scanner;

public class taskManager
{
    private ArrayList<Task> tasks = new ArrayList<Task>();


    public void newTask(){
        Scanner keyboard = new Scanner(System.in);
        
       
        System.out.println("Creating new task!");

        System.out.println("Name of new task?");
        String taskName = keyboard.nextLine();
        
        System.out.println("short description for task?");
        String taskDescription = keyboard.nextLine();

        System.out.println("task value? (1-5. 1 being least important, 5 being most important)");
        int taskValue = keyboard.nextInt();

        Task newTask = new Task(taskName, taskDescription, taskValue);
        tasks.add(newTask);
    }

    public void printTasks(){
        for(Task currentTask : tasks){
            System.out.println("Task name: "+currentTask.getTaskName()+", Task description: "+currentTask.getTaskDescription()+", Task Value: "+currentTask.getTaskValue());
        }
    }
}
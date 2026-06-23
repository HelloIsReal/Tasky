
/**
 * Write a description of class Main here.
 *
 * @author Tishar Sreekantam
 * @version 1
 */

public class Main
{
    // Next things to work on
    // Add options for the user to choose from. Create task, delete task,
    // View tasks, change task catagory, change task value.

    // Another extra thing to add is when a task is moved to the done catagory,
    // it should ask the user what they did to finish the task.

    // An extra extra thing to possibly add is GUI.
    private static taskManager tasky = new taskManager();
    public static void main(String[] args)
    {   
        tasky.newTask();
        tasky.newTask();
        tasky.printTasks();
    }

    
}
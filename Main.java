
/**
 * Write a description of class Main here.
 *
 * @author Tishar Sreekantam
 * @version 1
 */

public class Main
{
    private static taskManager tasky = new taskManager();
    public static void main(String[] args)
    {   
        tasky.newTask();
        tasky.newTask();
        tasky.printTasks();
    }

    
}
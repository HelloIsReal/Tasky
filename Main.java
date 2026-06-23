
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Main
{
    ArrayList<Task> tasks = new ArrayList<Task>();
    public static void main(String[] args)
    {
        System.out.println("Test!");
        Task newTask = new Task();
        newTask.newTask(1);
        System.out.println(newTask.getTaskValue());
    }
}

/**
 * Write a description of class Task here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task
{
    // Name of the task
    private String taskName="";

    // Short description of task
    private String taskDescription="";

    // How important this task is
    private int taskValue=0;

    // If it's in todo, doing, or completed (1,2,3);
    private int taskCatagory=1;

    

    public Task(){
        System.out.println("New Task Created!");
    }
    public void newTask(int taskValue){
        this.taskValue = taskValue;
    }
    public int getTaskValue(){
        return(this.taskValue);
    }
}
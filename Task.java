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

    

    public Task(String taskName, String taskDescription, int taskValue){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskValue = taskValue;
        
    }

    

    public String getTaskName(){
        return(this.taskName);
    }

    public String getTaskDescription(){
        return(this.taskDescription);
    }

    public int getTaskValue(){
        return(this.taskValue);
    }

    

    public void changeTaskCatagory(){
        // add code to change the catagory
    }
}
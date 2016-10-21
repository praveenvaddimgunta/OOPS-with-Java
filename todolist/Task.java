import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class Task
{
    private String taskname;
    private Date duedate; 
    private boolean done;
    
    public Task(String taskname) {
       this.taskname = taskname;
       this.done = false;  
    }

    public String getTaskName() {
       return taskname;
    }

    public String toString() {
        String str = taskname+"  "+" "+"--";
        str = str + duedate;
        return str;
    }

    public void setDueDate(String date) {
       SimpleDateFormat dates = new SimpleDateFormat ("dd/MM/yy hh:mm:ss");
       try {
            Date date2 = dates.parse(date);
            duedate=date2;
            
         }
       catch(Exception e) {
           System.out.println(e);
       }
    }

    public Date getDueDate() {
       return duedate;
    } 
    
    public void markAsDone() {
       done = true;
    }

    public boolean getMarkAsDone() {
       return done;
    }
}

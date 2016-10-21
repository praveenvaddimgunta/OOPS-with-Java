import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class TodoList {
     private String name;
     private Date date2;
     ArrayList<Task> array = new ArrayList<Task>();

   public TodoList(String name)  {
    this.name = name;
   }

   public void addTask(Task t) {
    array.add(t);
   }

   public void printAllTasks() {
    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i));
    }
    
   } 

   public Task[] findTask(String name) {
      ArrayList<Task> tasks = new ArrayList<Task>();
      for (int i = 0; i < array.size(); i++) {
       if((array.get(i).getTaskName()).contains(name)) {
        tasks.add(array.get(i));
      }
    }
    Task[] tasksArr = tasks.toArray(new Task[tasks.size()]);
       return tasksArr;
   }

   public Task[] getTask(String datetime) {
      ArrayList<Task> tasks = new ArrayList<Task>();
      SimpleDateFormat date1 = new SimpleDateFormat ("dd/MM/yy hh:mm:ss");
    
    try {
      date2 = date1.parse(datetime);
     }
     catch (Exception e) {
      System.out.println(e);
     }
    for (int i = 0; i<array.size(); i++) {
       if ((array.get(i).getDueDate()).compareTo(date2) == 0) {
        tasks.add(array.get(i));
       }
       }
       Task[] tasksArr = tasks.toArray(new Task[tasks.size()]);
       return tasksArr;
      }

    public Task[] getOverdueTasks() {
      	ArrayList<Task> overdue = new ArrayList<Task>();

      	SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
       	String s = GetCurrentDateTime();
       	try {
       		date2 = date1.parse(s);
      	}catch (Exception e) {
          	System.out.println(e);
      	}
       	for ( int i = 0; i < array.size(); i++) {
       		if ((array.get(i).getDueDate()).before(date2)&&array.get(i).getMarkAsDone()) {
           		overdue.add(array.get(i));
      		}
  		}
		Task[] overdueArr = overdue.toArray(new Task[overdue.size()]);
			return overdueArr;
  	}

    private String GetCurrentDateTime() {
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
      Date date = new Date();
      return (dateFormat.format(date));
    }
    
    public Task[] getPendingTasks() {
        ArrayList<Task> pending=new ArrayList<Task>();
        boolean temp;
        for (int i = 0; i < array.size(); i++) {
         temp = array.get(i).getMarkAsDone();
         if (!temp) {
            pending.add(array.get(i));
           }
        }
        Task[] pendingArr = pending.toArray(new Task[pending.size()]);
        return pendingArr;
    }
}
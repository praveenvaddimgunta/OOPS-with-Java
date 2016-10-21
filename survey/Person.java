import java.lang.*;
import java.util.*;
public class Person{
	int[] optionAns;
	String name;
	public Person(String name){
		optionAns = new int[11];
		this.name=name;
	}
	public int getoptionAns(int index){
		return this.optionAns[index];
	}
	public String getName(){
		return name;
	}
	public void setoptionAns(int index,int ans){
       this.optionAns[index]=ans;
	}
	public void setName(String name){
		this.name=name;
	}
}
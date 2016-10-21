import java.util.*;
public class EmployeeManagementSystem {
	private ArrayList<Employee> list;
	//private Employee[] list;

	public EmployeeManagementSystem(){
		list = new ArrayList<Employee>();
	}

	public void addToList(Employee e){
		list.add(e);
	}
	public void showList(){
		for (int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getEmpName());
		}		
	}
	public ArrayList<Employee> showEmp(String mName){
		Iterator<Employee> it = list.iterator();
		ArrayList<Employee> finalList = new ArrayList<Employee>();
		while(it.hasNext()){
			Employee temp = it.next();
			if(temp.getManager()==mName){
				System.out.println(temp.getEmpName());
				finalList.add(temp);
			}
		}
		return finalList;
	}
}
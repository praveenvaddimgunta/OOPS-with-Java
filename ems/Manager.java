import java.util.ArrayList;


public class Manager {
	private String userName;
	private int password;
	public String name;
	public int contactNo,allowance,numDays;
	Manager assignedManager;
	ArrayList<Employee> empList;
	Manager(String name,int contactNo,int numDays,int allowance){
		this.name = name;
		this.contactNo = contactNo;
		this.numDays = numDays;
		this.allowance = allowance;
		empList = new ArrayList();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}
	public int getNumDays() {
		return numDays;
	}
	public void setEmployee(Employee em) {
		empList.add(em);
	}
	public ArrayList<Employee> getEmployee(){
		return empList;
	}

}

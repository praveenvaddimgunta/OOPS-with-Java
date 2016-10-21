
public class Employee {
	private String userName;
	private int password;
	public String name;
	public int contactNo,numDays;
	public double salary;
	Manager assignedManager;
	Employee(String name,int contactNo,int numDays){
		this.name = name;
		this.contactNo = contactNo;
		this.numDays = numDays;
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
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}

}

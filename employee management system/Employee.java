import java.util.Date;
public class Employee{
	private String empName;
	private String empId;
	private String dateOfJoin;
	private int salary;
	private String manager;

	public Employee(String empName, String empId, String dateOfJoin, int salary, String manager) {
		this.empName = empName;
		this.empId = empId;
		this.dateOfJoin = dateOfJoin;
		this.salary = salary;
		this.manager = manager;
	}
	public Employee(String empName, String empId, String dateOfJoin, int salary) {
		this.empName = empName;
		this.empId = empId;
		this.dateOfJoin = dateOfJoin;
		this.salary = salary;
	}

	public String getEmpName(){
		return empName;
	}
	public void setEmpName(){
		this.empName = empName;
	}
	public String getEmpId(){
		return empId;
	}
	public void setEmpId(){
		this.empId = empId;
	}
	public String getDateOfJoin(){
		return dateOfJoin;
	}
	public void setDateOfJoin(){
		this.dateOfJoin = dateOfJoin;
	}
	public int getSalary(){
		return salary;
	}
	public void setSalary(){
		this.salary = salary;
	}
	public String getManager(){
		return manager;
	}
	public void setManager(){
		this.manager= manager;
	}
}
public class EmployeeManagementSystemTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("emp1", "E123", "09-02-2012", 55000, "emp4");
		Employee e2 = new Employee("emp2", "E124", "09-02-2013", 45000, "emp4");
		Employee e3 = new Employee("emp3", "E125", "09-02-2016", 35000, "emp7");
		Employee e4 = new Employee("emp4", "M123", "09-02-2009", 60000);
		Employee e5 = new Employee("emp5", "H123", "09-02-2010", 55000);
		Employee e6 = new Employee("emp6", "E126", "09-02-2008", 30000, "emp7");
		Employee e7 = new Employee("emp7", "M124", "09-02-2011", 55000);

		EmployeeManagementSystem list = new EmployeeManagementSystem();

		list.addToList(e1);
		list.addToList(e2);
		list.addToList(e3);
		list.addToList(e4);
		list.addToList(e5);
		list.addToList(e6);
		list.addToList(e7);

		list.showList();
		System.out.println(list.showEmp("emp4"));


	}
}
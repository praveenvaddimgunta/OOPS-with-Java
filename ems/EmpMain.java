import java.util.ArrayList;
import java.util.Scanner;


public class EmpMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//System.out.println("helo");
		Manager m1 = new Manager("Chinnu",904966741, 21,15);
		Manager m2 = new Manager("minnu",720708291, 21,10);
		Manager m3 = new Manager("annu",908594151, 21,12);
		Employee e = new Employee("bannu",908594151, 21);
		Employee e1 = new Employee("annu",908594151, 20);
		Employee e2 = new Employee("annu",908594151, 16);
		Employee e3 = new Employee("annu",908594151, 19);
		Employee e4 = new Employee("annu",908594151, 18);
		Employee e5 = new Employee("annu",908594151, 22);
		Employee e6 = new Employee("annu",908594151, 20);
		Employee e7 = new Employee("annu",908594151, 15);
		Employee e8 = new Employee("annu",908594151, 23);
		Employee e9 = new Employee("annu",908594151, 24);
		m1.setEmployee(e);
		m1.setEmployee(e1);
		m1.setEmployee(e2);
		m2.setEmployee(e3);
		m2.setEmployee(e4);
		m2.setEmployee(e5);
		m3.setEmployee(e6);
		m3.setEmployee(e7);
		m3.setEmployee(e8);
		m3.setEmployee(e9);
		Calculations cal = new Calculations();
		cal.setManager(m1);
		cal.setManager(m2);
		cal.setManager(m3);
		//output
		ArrayList<Employee> empl = m1.getEmployee();
//		ArrayList<Employee> empl2 = m2.getEmployee();
//		ArrayList<Employee> empl3 = m3.getEmployee();
//		Scanner sc = new Scanner(System.in);
//		sc.nextLine();
		for(int i = 0;i<empl.size();i++) {
			System.out.println(empl.get(i).getName() + "   " + empl.get(i).getSalary());
		}
		
	}
}

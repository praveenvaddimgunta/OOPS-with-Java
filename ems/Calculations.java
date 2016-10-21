
public class Calculations {
	Manager manager;
	Calculations(){
//		this.manager = manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
		payment();
	}
	
	public void payment () {
		for(int i =0;i<manager.getEmployee().size();i++){
			double basic = 500 * manager.getEmployee().get(i).getNumDays();
			double payment = basic + basic * manager.allowance;
			manager.getEmployee().get(i).setSalary(payment);
		}
	}
	
}

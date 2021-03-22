package M6_Milestone2.jobs.domain;

public class Manager extends Employee {
	
	public Manager(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		
		if (salaryPerMonth <= 3000 | salaryPerMonth >= 5000) throw new Exception("Manager base salary out of bounds.");
	}
	
}

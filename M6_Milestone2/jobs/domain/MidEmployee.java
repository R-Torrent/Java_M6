package M6_Milestone2.jobs.domain;

public class MidEmployee extends Employee {
	
	public MidEmployee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		
		if (salaryPerMonth <= 1800 | salaryPerMonth >= 2500) throw new Exception("Mid-employee base salary out of bounds.");
	}

}

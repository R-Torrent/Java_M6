package M6_Milestone2.jobs.domain;

public class JuniorEmployee extends Employee {
	
	public JuniorEmployee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		
		if (salaryPerMonth <= 900 | salaryPerMonth >= 1600) throw new Exception("Junior employee base salary out of bounds.");
	}
	
}

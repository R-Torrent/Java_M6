package M6_Milestone3.jobs.domain;

public class MidEmployee extends Employee {
	
	protected double tax = 15; // % IRPF
	
	public MidEmployee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		super.tax = tax;
		
		if (salaryPerMonth <= 1800 | salaryPerMonth >= 2500) throw new Exception("Mid-employee base salary out of bounds.");
	}

}

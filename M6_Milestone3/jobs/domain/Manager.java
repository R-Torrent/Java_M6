package M6_Milestone3.jobs.domain;

public class Manager extends Employee {
	
	protected double tax = 26; // % IRPF

	public Manager(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		super.tax = tax;
		
		if (salaryPerMonth <= 3000 | salaryPerMonth >= 5000) throw new Exception("Manager base salary out of bounds.");
	}
	
}

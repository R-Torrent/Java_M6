package M6_Milestone3.jobs.domain;

public class SeniorEmployee extends Employee {
	
	protected double tax = 24; // % IRPF

	public SeniorEmployee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		super.tax = tax;
		
		if (salaryPerMonth <= 2700 | salaryPerMonth >= 4000) throw new Exception("Senior employee base salary out of bounds.");
	}

}

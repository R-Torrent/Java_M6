package M6_Milestone3.jobs.domain;

public class Boss extends Employee {
	
	protected double tax = 32; // % IRPF

	public Boss(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		super.tax = tax;
		
		if (salaryPerMonth <= 8000) throw new Exception("Boss base salary out of bounds.");
	}
	
}

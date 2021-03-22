package M6_Milestone2.jobs.domain;

public class SeniorEmployee extends Employee {

	public SeniorEmployee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		
		if (salaryPerMonth <= 2700 | salaryPerMonth >= 4000) throw new Exception("Senior employee base salary out of bounds.");
	}

}

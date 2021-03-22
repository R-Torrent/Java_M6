package M6_Milestone2.jobs.domain;

public class Boss extends Employee {

	public Boss(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
			super(name, address, phone, salaryPerMonth, paymentRate);
			
			if (salaryPerMonth <= 8000) throw new Exception("Boss base salary out of bounds.");
	}

}

package M6_Milestone2.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);
		
		if(salaryPerMonth < 0) throw new Exception("Negative salary.");
		if(paymentRate == null) throw new Exception("Salary modifier missing.");
				
		this.salaryPerMonth = salaryPerMonth;
		this.paymentRate = paymentRate;
	}
	
	@Override
	public void pay() {
		totalPaid = paymentRate.pay(salaryPerMonth);
	}

}

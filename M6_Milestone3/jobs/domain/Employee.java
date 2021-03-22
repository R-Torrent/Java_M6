package M6_Milestone3.jobs.domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;
	protected double grossPaid;
	protected double tax;
	protected double netPaid;

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);
		
		if(salaryPerMonth < 0) throw new Exception("Negative salary.");
		if(paymentRate == null) throw new Exception("Salary modifier missing.");
				
		this.salaryPerMonth = salaryPerMonth;
		this.paymentRate = paymentRate;
	}

	@Override
	public Double[] getIncome() {
		return new Double[] {grossPaid, tax, netPaid};
	}
	
	private void netPaidCalc() {
		netPaid = grossPaid * (1 - tax / 100);
	}
	
	@Override
	public void pay() {
		grossPaid += paymentRate.pay(salaryPerMonth); // Monthly salary
		netPaidCalc();
	}
	
	@Override
	public void pay(double percent) {
		grossPaid += paymentRate.pay(salaryPerMonth) * 12 * percent / 100; // +<percent>% annual salary bonus
		netPaidCalc();
	}
	
	@Override
	public void bonus(double amount) { // Fixed amount bonus
		grossPaid += amount;
		netPaidCalc();
	}
	
	@Override
	public void govGrant(double amount) {} // Los empleados no reciben ayuda estatal
	
}

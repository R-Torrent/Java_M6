package M6_Milestone3.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String description;
	protected double grants;
		
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		this.description = description;
	}

	@Override
	public Double[] getIncome() {
		return new Double[] {grants};
	}
	
	@Override
	public void pay() {} // Los voluntarios no reciben un suledo...
	
	@Override
	public void pay(double percent) {} // ...ni un bonus sobre el sueldo...

	@Override
	public void bonus(double amount) {} // ...ni un extra fijo 
	
	@Override
	public void govGrant(double amount) { // Ayuda directa del estado
		grants += amount;
	}
	
}

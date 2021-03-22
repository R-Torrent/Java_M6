package M6_Milestone3.jobs.domain;


public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;

	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception("Name missing.");
		if (address.equals(""))
			throw new Exception("Address missing.");
		if (phone.equals(""))
			throw new Exception("Phone number missing.");

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS++;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract Double[] getIncome();
	
	public abstract void pay();
	
	public abstract void pay(double percent);
	
	public abstract void bonus(double amount);
	
	public abstract void govGrant(double amount);
	
}

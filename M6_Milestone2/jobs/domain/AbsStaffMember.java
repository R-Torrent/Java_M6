package M6_Milestone2.jobs.domain;

public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid;

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
	
	public String getName() {
		return name;
	}
	
	public double getTotalPaid() {
		return totalPaid;
	}

	public abstract void pay();
	
}

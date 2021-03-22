package M6_Milestone2.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String description;
	
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		this.description = description;
	}

	@Override
	public void pay() {} // No hace nada; totalPaid ya es, por defecto, 0.0

}

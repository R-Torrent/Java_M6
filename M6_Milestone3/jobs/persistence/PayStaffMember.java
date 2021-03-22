package M6_Milestone3.jobs.persistence;

import M6_Milestone3.jobs.domain.AbsStaffMember;

public class PayStaffMember implements RepositoryCommand {
	
	double percent_annual;
	
	public PayStaffMember() {}
	
	public PayStaffMember(double percent_annual) throws Exception {
		if (percent_annual <= 0.0) throw new Exception("Nonpositive % bonus.");
		
		this.percent_annual = percent_annual;
	}
	
	public void execute(AbsStaffMember member) {
		if(percent_annual == 0.0)
			member.pay();
		else
			member.pay(percent_annual);	
	}

}

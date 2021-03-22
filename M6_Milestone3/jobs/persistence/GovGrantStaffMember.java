package M6_Milestone3.jobs.persistence;

import M6_Milestone3.jobs.domain.AbsStaffMember;

public class GovGrantStaffMember implements RepositoryCommand {
	
	double amount;
		
	public GovGrantStaffMember() throws Exception {
		throw new Exception("Nonpositive grant.");
	}
		
	public GovGrantStaffMember(double amount) throws Exception {
		if(amount <= 0.0) throw new Exception("Nonpositive grant.");
		if(amount > 300.0) throw new Exception("Exceeds government program limit.");
		
		this.amount = amount;
	}
		
	public void execute(AbsStaffMember member) {
		member.govGrant(amount);		
	}

}

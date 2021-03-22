package M6_Milestone3.jobs.persistence;

import M6_Milestone3.jobs.domain.AbsStaffMember;

public class BonusStaffMember implements RepositoryCommand {
	
	double amount;
		
	public BonusStaffMember() throws Exception {
		throw new Exception("Nonpositive bonus.");
	}
		
	public BonusStaffMember(double amount) throws Exception {
		if (amount <= 0.0) throw new Exception("Nonpositive bonus.");
		
		this.amount = amount;
	}
		
	public void execute(AbsStaffMember member) throws Exception {
		member.bonus(amount);		
	}

}

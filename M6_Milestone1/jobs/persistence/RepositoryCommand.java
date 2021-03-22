package M6_Milestone1.jobs.persistence;

import M6_Milestone1.jobs.domain.AbsStaffMember;

public interface RepositoryCommand {
	
	public void execute(AbsStaffMember member);
	
}

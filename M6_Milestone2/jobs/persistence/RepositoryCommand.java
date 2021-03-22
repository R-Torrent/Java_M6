package M6_Milestone2.jobs.persistence;

import M6_Milestone2.jobs.domain.AbsStaffMember;

public interface RepositoryCommand {
	
	public void execute(AbsStaffMember member);
	
}

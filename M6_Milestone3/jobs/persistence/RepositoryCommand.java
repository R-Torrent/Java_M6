package M6_Milestone3.jobs.persistence;

import M6_Milestone3.jobs.domain.AbsStaffMember;

public interface RepositoryCommand {
		
	public void execute(AbsStaffMember member) throws Exception;
	
}

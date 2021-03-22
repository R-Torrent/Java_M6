package M6_Milestone1.jobs.persistence;

import java.util.ArrayList;
import java.util.List;
import M6_Milestone1.jobs.domain.AbsStaffMember;

public class EmployeeRepository {

	private static List<AbsStaffMember> members = new ArrayList<>();
	
	public EmployeeRepository() {}
	
	public List<AbsStaffMember> getAllMembers() {
		return new ArrayList<>(members); // Devuelve una copia, no el original
	}
	
	public void addMember(AbsStaffMember member) throws Exception {
		if(member == null) throw new Exception();
		members.add(member);
	}
	
	public void updateAllMembers(RepositoryCommand command) {
		members.forEach(member -> command.execute(member));
	}
	
}

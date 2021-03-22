package M6_Milestone2.jobs.persistence;

import java.util.ArrayList;
import java.util.List;
import M6_Milestone2.jobs.domain.AbsStaffMember;
import M6_Milestone2.jobs.domain.Employee;

public class EmployeeRepository {

	private static List<AbsStaffMember> members = new ArrayList<>();
	
	public EmployeeRepository() {}
	
	public List<AbsStaffMember> getAllStaff() {
		return new ArrayList<>(members); // Devuelve una copia, no el original
	}
	
	public List<AbsStaffMember> getAllEmployees() {
		List<AbsStaffMember> list = getAllStaff();
		list.removeIf(member -> !(member instanceof Employee));
		return list;
	}
	
	public void addMember(AbsStaffMember member) throws Exception {
		if(member == null) throw new Exception("Adding an empty record into the repository.");
		members.add(member);
	}

	public void updateMembers(List<AbsStaffMember> list, RepositoryCommand command) throws Exception {
		if(list == null) throw new Exception("Attempting to update an empty repository.");
		if(command == null) throw new Exception("Missing updating command.");
		list.forEach(member -> command.execute(member)); 
	}
	
	public void updateAllStaff(RepositoryCommand command) throws Exception {
		if(command == null) throw new Exception("Missing updating command.");
		updateMembers(members, command);
	}
	
}

package M6_Milestone3.jobs.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import M6_Milestone3.jobs.domain.AbsStaffMember;
import M6_Milestone3.jobs.domain.Employee;

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
	
	public List<AbsStaffMember> getAllNonEmployees() {
		List<AbsStaffMember> list = getAllStaff();
		list.removeIf(member -> (member instanceof Employee));
		return list;
	}
	
	public void addMember(AbsStaffMember member) throws Exception {
		if(member == null) throw new Exception("Adding an empty record into the repository.");
		members.add(member);
	}

	public void updateMembers(List<AbsStaffMember> list, RepositoryCommand command) throws Exception {
		if(list == null) throw new Exception("Attempting to update an empty repository.");
		if(command == null) throw new Exception("Missing updating command.");
		for(AbsStaffMember member : list)
			command.execute(member);
	}
	
	public void updateAllStaff(RepositoryCommand command) throws Exception {
		if(command == null) throw new Exception("Missing updating command.");
		updateMembers(members, command);
	}

	private AbsStaffMember findId(int id) throws Exception {
		if(id < 1 || id > members.size()) throw new Exception("Id #" + id + " out of bounds.");
		Iterator<AbsStaffMember> it = members.iterator();
		while(it.hasNext()) {
			AbsStaffMember member = it.next();
			if(member.getId() == id) return member;
		}
		throw new Exception("Staff member #" + id + " not found.");
	}
		
	public void updateOneMember(int id, RepositoryCommand command) throws Exception {
		if(command == null) throw new Exception("Missing updating command.");
		command.execute(findId(id));
	}
	
}

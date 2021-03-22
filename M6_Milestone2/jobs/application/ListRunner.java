package M6_Milestone2.jobs.application;

import java.util.List;
import M6_Milestone2.jobs.domain.AbsStaffMember;

public class ListRunner {
	
	private List<AbsStaffMember> list;
	
	public ListRunner(List<AbsStaffMember> staff) {
		this.list = staff;
	}
	
	public String nameString() {
		String nameList = "";
		boolean first = true;
		for(AbsStaffMember member : list) {
			if(!first)
				nameList += ", ";
			else
				first = false;
			nameList += member.getName();
		}
		return nameList;
	}
	
	public String salaryString() {
		String salaryList = "";
		for(AbsStaffMember member : list)
			salaryList += member.getName() + ": " + member.getTotalPaid() + "\n";
		return salaryList;
	}

}

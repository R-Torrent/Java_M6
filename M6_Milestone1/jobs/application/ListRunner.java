package M6_Milestone1.jobs.application;

import java.util.List;
import M6_Milestone1.jobs.domain.AbsStaffMember;
import M6_Milestone1.jobs.domain.Employee;

public class ListRunner {
	
	private List<AbsStaffMember> staff;
	
	public ListRunner(List<AbsStaffMember> staff) {
		this.staff = staff;
	}
	
	public String employeeList() {
		String employeeList = "";
		boolean first = true;
		for(AbsStaffMember staffmember : staff)
			if(staffmember instanceof Employee) {
				if(!first)
					employeeList += ", ";
				else
					first = false;
				employeeList += staffmember.getName();
			}
		return employeeList;
	}
	
	public String salaryList() {
		String salaryList = "";
		for(AbsStaffMember staffmember : staff)
			salaryList += staffmember.getName() + ": " + staffmember.getTotalPaid() + "\n";
		return salaryList;
	}

}

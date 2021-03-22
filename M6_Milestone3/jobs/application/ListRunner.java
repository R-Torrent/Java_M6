package M6_Milestone3.jobs.application;

import java.util.List;
import M6_Milestone3.jobs.domain.AbsStaffMember;

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
	
	public String incomeString() {
		String salaryList = "";
		for(AbsStaffMember member : list) {
			salaryList += String.format("%25s ", member.getName())
					+ String.format("(# %03d): ", member.getId());
			if(member.getIncome().length == 3)
				salaryList += String.format("%8.2f(gross) at ", member.getIncome()[0])
						+ String.format("%05.2f %% income tax = ", member.getIncome()[1])
						+ String.format("%8.2f(net) ", member.getIncome()[2])
						+ String.format("[ %9.2f(gross) " , member.getIncome()[0] * 12)
						+ String.format("%9.2f(net) annual ]\n", member.getIncome()[2] * 12);		
			else
				salaryList += String.format("%8.2f", member.getIncome()[0]) + " of government grant(s)\n";
		}
		return salaryList;
	}

}

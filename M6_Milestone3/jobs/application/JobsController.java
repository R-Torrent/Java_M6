package M6_Milestone3.jobs.application;

import M6_Milestone3.jobs.domain.Boss;
import M6_Milestone3.jobs.domain.Manager;
import M6_Milestone3.jobs.domain.SeniorEmployee;
import M6_Milestone3.jobs.domain.MidEmployee;
import M6_Milestone3.jobs.domain.JuniorEmployee;
import M6_Milestone3.jobs.domain.Volunteer;
import M6_Milestone3.jobs.persistence.EmployeeRepository;
import M6_Milestone3.jobs.persistence.PayStaffMember;
import M6_Milestone3.jobs.persistence.BonusStaffMember;
import M6_Milestone3.jobs.persistence.GovGrantStaffMember;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController() {}
		
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) { try {
		repository.addMember(new Boss(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss()));
	} catch(Exception e) { e.printStackTrace(); } }

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) { try {
		repository.addMember(new Manager(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager()));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void createSeniorEmployee(String name, String address, String phone, double salaryPerMonth) { try {
		repository.addMember(new SeniorEmployee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateSeniorEmployee()));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void createMidEmployee(String name, String address, String phone, double salaryPerMonth) { try {
		repository.addMember(new MidEmployee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateMidEmployee()));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void createJuniorEmployee(String name, String address, String phone, double salaryPerMonth) { try {
		repository.addMember(new JuniorEmployee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateJuniorEmployee()));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void createVolunteer(String name, String address, String phone) { try {
		repository.addMember(new Volunteer(name, address, phone, "Internship/Volunteer"));
	} catch(Exception e)  { e.printStackTrace(); } }
		
	public void payAllStaff() { try {
		repository.updateAllStaff(new PayStaffMember());
	} catch(Exception e)  { e.printStackTrace(); } }
	
	public void payAllStaff(double percent_annual) { try {
		repository.updateAllStaff(new PayStaffMember(percent_annual));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void payAllEmployees() { try {
		repository.updateMembers(repository.getAllEmployees(), new PayStaffMember());
	} catch(Exception e)  { e.printStackTrace(); } }
	
	public void payAllEmployees(double percent_annual) { try {
		repository.updateMembers(repository.getAllEmployees(), new PayStaffMember(percent_annual));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void payAllNonEmployees() { try {
		repository.updateMembers(repository.getAllNonEmployees(), new PayStaffMember());
	} catch(Exception e)  { e.printStackTrace(); } }
	
	public void payAllNonEmployees(double percent_annual) { try {
		repository.updateMembers(repository.getAllNonEmployees(), new PayStaffMember(percent_annual));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void payOneStaffMember(int id) { try {
		repository.updateOneMember(id, new PayStaffMember());
	} catch(Exception e) { e.printStackTrace(); } }

	public void payOneStaffMember(int id, double percent_annual) { try {
		repository.updateOneMember(id, new PayStaffMember(percent_annual));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void bonusAllStaff(double bonus) { try {
		repository.updateAllStaff(new BonusStaffMember(bonus));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void bonusAllEmployees(double bonus) { try {
		repository.updateMembers(repository.getAllEmployees(), new BonusStaffMember(bonus));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void bonusAllNonEmployees(double bonus) { try {
		repository.updateMembers(repository.getAllNonEmployees(), new BonusStaffMember(bonus));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void bonusOneStaffMember(int id, double bonus) { try {
		repository.updateOneMember(id, new BonusStaffMember(bonus));
	} catch(Exception e) { e.printStackTrace(); } }

	public void grantAllStaff(double bonus) { try {
		repository.updateAllStaff(new GovGrantStaffMember(bonus));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void grantAllEmployees(double bonus) { try {
		repository.updateMembers(repository.getAllEmployees(), new GovGrantStaffMember(bonus));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void grantAllNonEmployees(double bonus) { try {
		repository.updateMembers(repository.getAllNonEmployees(), new GovGrantStaffMember(bonus));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void grantOneStaffMember(int id, double bonus) { try {
		repository.updateOneMember(id, new GovGrantStaffMember(bonus));
	} catch(Exception e) { e.printStackTrace(); } }
	
	public void printAllStaff() {
		System.out.println("STAFF: " + (new ListRunner(repository.getAllStaff())).nameString() + "\n");
	}
	
	public void printAllEmployees() {
		System.out.println("EMPLOYEES: " + (new ListRunner(repository.getAllEmployees())).nameString() + "\n");
	}
	
	public void printAllNonEmployees() {
		System.out.println("NON-EMPLOYEES: " + (new ListRunner(repository.getAllNonEmployees())).nameString() + "\n");
	}
	
	public void printAllEarnings() { // Comprobación de que los salarios se computan correctamente
		System.out.println("EARNINGS:\n" + (new ListRunner(repository.getAllStaff())).incomeString());
	}

}

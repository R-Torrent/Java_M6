package M6_Milestone2.jobs.application;

import M6_Milestone2.jobs.domain.Boss;
import M6_Milestone2.jobs.domain.Manager;
import M6_Milestone2.jobs.domain.SeniorEmployee;
import M6_Milestone2.jobs.domain.MidEmployee;
import M6_Milestone2.jobs.domain.JuniorEmployee;
import M6_Milestone2.jobs.domain.Volunteer;
import M6_Milestone2.jobs.persistence.EmployeeRepository;
import M6_Milestone2.jobs.persistence.PayStaffMember;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController() {}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		repository.addMember(new Boss(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss()));
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		repository.addMember(new Manager(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager()));
	}
	
	public void createSeniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		repository.addMember(new SeniorEmployee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateSeniorEmployee()));
	}
	
	public void createMidEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		repository.addMember(new MidEmployee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateMidEmployee()));
	}
	
	public void createJuniorEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		repository.addMember(new JuniorEmployee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateJuniorEmployee()));
	}
	
	public void createVolunteer(String name, String address, String phone) throws Exception {
		repository.addMember(new Volunteer(name, address, phone, "Internship/Volunteer"));
	}
	
	public void payAllStaff() throws Exception {
		repository.updateAllStaff(new PayStaffMember());
	}
	
	public void payAllEmployees() throws Exception {
		repository.updateMembers(repository.getAllEmployees(), new PayStaffMember());
	}
	
	public String getAllStaff() {
		ListRunner lr = new ListRunner(repository.getAllStaff());
		return lr.nameString();
	}
	
	public String getAllEmployees() {
		ListRunner lr = new ListRunner(repository.getAllEmployees());
		return lr.nameString();
	}
	
	public String getAllSalaries() { // Comprobación de que los salarios se computan correctamente
		ListRunner lr = new ListRunner(repository.getAllStaff());
		return lr.salaryString();
	}
	
}

package M6_Milestone1.jobs.application;

import M6_Milestone1.jobs.domain.Employee;
import M6_Milestone1.jobs.domain.Volunteer;
import M6_Milestone1.jobs.persistence.EmployeeRepository;
import M6_Milestone1.jobs.persistence.PayStaffMember;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController() {}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {		
		Employee boss = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		Employee manager = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {		
		Employee employee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}
	
	public void createVolunteer(String name, String address, String phone) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone, "Internship/Volunteer");
		repository.addMember(volunteer);
	}

	public void payAllEmployees() {
		repository.updateAllMembers(new PayStaffMember());
	}

	public String getAllEmployees() {
		ListRunner lr = new ListRunner(repository.getAllMembers());
		return lr.employeeList();
	}
	
	public String getAllSalaries() { // Comprobación de que los salarios se computan correctamente
		ListRunner lr = new ListRunner(repository.getAllMembers());
		return lr.salaryList();
	}
	
}

/** Back-end Java
*** M6 - Milestone 3
*** Roger Torrent */

package M6_Milestone3.jobs.view;

import M6_Milestone3.jobs.application.JobsController;
import java.util.Locale;

/* 
 * Comandos reconocidos en la función 'userInterface':
 * 
 * controller.create[Boss|Manager|SeniorEmployee|MidEmployee|JuniorEmployee](<name>, <address>, <phone>, <base_monthly_salary>);
 * controller.createVolunteer(<name>, <address>, <phone>);
 * controller.print[AllStaff|AllEmployees|AllNonEmployees]();
 * controller.printAllEarnings();
 * controller.pay[AllStaff|AllEmployees|AllNonEmployees]();
 * controller.pay[AllStaff|AllEmployees|AllNonEmployees](<annual_salary_percent>);
 * controller.payOneStaffMember(<#id>);
 * controller.payOneStaffMember(<#id>, <annual_salary_percent>);
 * controller.bonus[AllStaff|AllEmployees|AllNonEmployees](<amount>);
 * controller.bonusOneStaffMember(<#id>, <amount>);
 * controller.grant[AllStaff|AllEmployees|AllNonEmployees](<amount>);
 * controller.grantOneStaffMember(<#id>, <amount>);
 * 
 * Evidentemente, las familias de funciones 'pay' y 'bonus' sólo afectan a los empleados.
 * Por contra, la familia de funciones 'grant' sólo afecta a los voluntarios.
 */

public class Main {

	private static JobsController controller = new JobsController();
	
	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		Locale.setDefault(Locale.ROOT); // Experimentando con los formatos numéricos locales...
		
		userInterface();
		
		Locale.setDefault(loc); // Devolviendo la JVM al 'locale' de partida		
	}
	
	public static void userInterface() {
		
		controller.createBossEmployee("Pepe Boss", "Direccion molona 1", "666666666", 9200.0);
		controller.createMidEmployee("Pedro Mid-employee", "Direccion molona 2", "665266666", 2320.0);
		controller.createSeniorEmployee("Laura Senior employee", "Direccion molona 3", "644266666", 3145.0);
		controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666");
		controller.createManagerEmployee("Pedro Manager", "Direccion molona 5", "632666666", 4350.0);
		controller.createVolunteer("Roger Volunteer", "Direccion molona 6", "633266666");
		controller.createJuniorEmployee("Silvia Junior employee", "Direccion molona 7", "600666666", 920.0);
		controller.createMidEmployee("Oscar Mid-employee", "Direccion molona 8", "616666666", 1930.0);
		controller.createJuniorEmployee("David Junior employee", "Direccion molona 9", "602666666", 1004.0);
		controller.createJuniorEmployee("Emilio Junior employee", "Direccion molona 10", "654666666", 1015.0);
		
		controller.printAllStaff();
		controller.printAllEmployees();
		controller.printAllNonEmployees();
		
		controller.payAllEmployees();
		
		controller.printAllEarnings();		
		
		controller.payAllEmployees(10);
		
		controller.printAllEarnings();		
		
		controller.payOneStaffMember(1);
		controller.payOneStaffMember(9, 5);
		
		controller.printAllEarnings();		
		
		controller.bonusOneStaffMember(3, 420.0);
		
		controller.printAllEarnings();
		
		controller.bonusAllStaff(20);
		controller.bonusAllEmployees(10);
		
		controller.printAllEarnings();
		
		controller.grantAllNonEmployees(50);
		controller.grantOneStaffMember(6, 300.0);
		
		controller.printAllEarnings();
		
	}

}

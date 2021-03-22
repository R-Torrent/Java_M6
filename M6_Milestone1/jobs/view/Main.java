/** Back-end Java
*** M6 - Milestone 1
*** Roger Torrent */

package M6_Milestone1.jobs.view;

import M6_Milestone1.jobs.application.JobsController;

public class Main {

	private static JobsController controller = new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Direccion molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Direccion molona 3", "644266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666");
		controller.createManagerEmployee("Pedro Manager", "Direccion molona 5", "632666666", 80.0);
		controller.createVolunteer("Roger Volunteer", "Direccion molona 6", "633266666");
		
		System.out.println("EMPLOYEES: " + controller.getAllEmployees() + "\n");
		
		controller.payAllEmployees();
		
		System.out.println("SALARIES:\n" + controller.getAllSalaries());	
		
	}

}

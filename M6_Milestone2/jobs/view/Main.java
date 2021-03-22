/** Back-end Java
*** M6 - Milestone 2
*** Roger Torrent */

package M6_Milestone2.jobs.view;

import M6_Milestone2.jobs.application.JobsController;

public class Main {

	private static JobsController controller = new JobsController();
	
	public static void main(String[] args) {
		
		try {
		controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 9200.0);
		controller.createMidEmployee("Pedro Mid-employee", "Direccion molona 2", "665266666", 2320.0);
		controller.createSeniorEmployee("Laura Senior employee", "Direccion molona 3", "644266666", 3145.0);
		controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666");
		controller.createManagerEmployee("Pedro Manager", "Direccion molona 5", "632666666", 4350.0);
		controller.createVolunteer("Roger Volunteer", "Direccion molona 6", "633266666");
		controller.createJuniorEmployee("Silvia Junior employee", "Direccion molona 7", "600666666", 920.0);
		controller.createMidEmployee("Oscar Mid-employee", "Direccion molona 8", "616666666", 1930.0);
		controller.createJuniorEmployee("David Junior employee", "Direccion molona 9", "602666666", 1005.0);		
		} catch(Exception e) { e.printStackTrace();	}
		
		System.out.println("STAFF: " + controller.getAllStaff() + "\n");
		System.out.println("EMPLOYEES: " + controller.getAllEmployees() + "\n");
		
		try { controller.payAllEmployees(); } catch(Exception e) { e.printStackTrace();	}
		
		System.out.println("SALARIES:\n" + controller.getAllSalaries());
		
	}

}

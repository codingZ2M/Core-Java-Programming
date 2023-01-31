package methods_examples;

public class Employee {

	/* :: Methods ::
      Methods are taking the code block concept to the next level, so that the code could be 
      reused at several times.
	 */

	// showUpdatedSalary method with 'public' ... 'double'...'static'...
	public static double showUpdatedSalary(double basicEmployeeSalary, double increment, boolean isPermanent ) {

		double incentive = 1000.00d;
		double finalSalary=0;

		if (isPermanent ) {  // Code block starts here..

			double updatedSalary =(  basicEmployeeSalary + ( basicEmployeeSalary * (increment/100) ) );

			finalSalary  = updatedSalary +=incentive;

		} // Code block ends here..
		return  finalSalary;
	}

	// showUpdatedSalary method with 'public' ... 'String'...'static'...
	public static String showPosition (double salary)  {

		if(salary >= 11000) {
			return "Project Leader";
		} else if(salary >= 10000 && salary < 11000) {
			return "Sr. Java Programmer";
		} else if(salary >= 9000 && salary < 10000) {
			return "Jr. Java Programmer";
		} else {
			return "Trainee Employee";
		}


	}
	// method 
	public static void showEmployeeDetails (double salary, String employeePosition) {

		System.out.println("Final Employee Salary: " + salary + " | " + 
				"Employee Position: " + employeePosition);

	}


}




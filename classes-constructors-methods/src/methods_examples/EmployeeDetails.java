package methods_examples;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		double finalSalary=0;
		String position;

    	double basicSalary = 8000.00d;
		double increment = 10.00d;
		boolean isPermanent = true;
		
		finalSalary = Employee.showUpdatedSalary(basicSalary, increment, isPermanent);
		
		position = Employee.showPosition (finalSalary);
		
		Employee.showEmployeeDetails(finalSalary, position );
	
	 basicSalary = 9000.00d;
	 increment = 11.00d; 
	 isPermanent = true;
	
	 	finalSalary  = Employee.showUpdatedSalary(basicSalary, increment, isPermanent);
	 	position = Employee.showPosition (finalSalary);
	 	
	 	Employee.showEmployeeDetails(finalSalary, position );

	}

}

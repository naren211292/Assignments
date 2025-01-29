package com.assignments;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employees employees = new Employees();
		
		 String[] employeeNames = employees.getEmployeeNames();
	     int[] employeeIDs = employees.getEmployeeIDs();
	     
	     System.out.println("Employee Details:");
	     System.out.println("Employee Name: " + employeeNames[0]+ ", Employee ID " + employeeIDs[0]);
	     System.out.println("Employee Name: " + employeeNames[1]+ ", Employee ID " + employeeIDs[1]);
	     System.out.println("Employee Name: " + employeeNames[2]+ ", Employee ID " + employeeIDs[2]);

}
	
}

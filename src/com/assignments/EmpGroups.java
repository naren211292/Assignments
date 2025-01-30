package com.assignments;

public class EmpGroups {

	public static void main(String[] args) {
		// This is a child class
       
		//Creating parent class object inside the child class
		Employees emp = new Employees();
		
		//Creating String array to store the Employee names
		//Retrieve Employee names from Employees class and store in String array
		 String[] employeeNames = new String[3];
		 employeeNames[0] = emp.empname1;
		 employeeNames[1] = emp.empname2;
		 employeeNames[2] = emp.empname3;
		 
        //Creating integer array to store Employee Ids
		//Retrieve Employee Ids from Employees class and store in Integer array
		 int [] employeeIds = new int[3];
		 employeeIds[0] = emp.empId1;
		 employeeIds[1] = emp.empId2;
		 employeeIds[2] = emp.empId3;
	     
		 
	     System.out.println("Employee Details:");
	     
	     //printing Employee's names along with their IDs.
	     System.out.println("Employee Name: " + employeeNames[0]+ ", Employee ID :" + employeeIds[0]);
	     System.out.println("Employee Name: " + employeeNames[1]+ ", Employee ID :" + employeeIds[1]);
	     System.out.println("Employee Name: " + employeeNames[2]+ ", Employee ID :" + employeeIds[2]);

}
	
}

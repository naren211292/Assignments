package com.assignments;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Storing 1st Employee details in Emp1 Hashtable
		Map<String, String> Emp1 = new Hashtable<String, String>();
		Emp1.put("EmployeeID", "E001");
		Emp1.put("Name", "Alice Green");
		Emp1.put("Age", "30");
		Emp1.put("Gender", "Female");
		Emp1.put("Department", "Engineering");
		Emp1.put("Position", "SoftwareEngineer");
		Emp1.put("Salary", "75,000");
		Emp1.put("Email", "alice@emample.com");
		Emp1.put("ContactNumber", "9876543213");
		
		//Storing 2nd Employee details in Emp2 Hashtable
		Map<String, String> Emp2 = new Hashtable<String, String>();
		Emp2.put("EmployeeID", "E002");
		Emp2.put("Name", "Bob Johnson");
		Emp2.put("Age", "35");
		Emp2.put("Gender", "Male");
		Emp2.put("Department", "Marketing");
		Emp2.put("Position", "Marketing Manager");
		Emp2.put("Salary", "85,000");
		Emp2.put("Email", "bob@emample.com");
		Emp2.put("ContactNumber", "9876543214");
		
		//Storing 3rd Employee details in Emp3 Hashtable
		Map<String, String> Emp3 = new Hashtable<String, String>();
		Emp3.put("EmployeeID", "E003");
		Emp3.put("Name", "Carol White");
		Emp3.put("Age", "28");
		Emp3.put("Gender", "Female");
		Emp3.put("Department", "Sales");
		Emp3.put("Position", "Sales Executive");
		Emp3.put("Salary", "65,000");
		Emp3.put("Email", "carol@emample.com");
		Emp3.put("ContactNumber", "9876543215");
		
		//Storing All employee data Hashtables in Linked List
		List<Map<String, String>> EmpData = new LinkedList<Map<String, String>>();
		EmpData.add(Emp1);
		EmpData.add(Emp2);
		EmpData.add(Emp3);
		
		//Printing Employee 2 Email address
        System.out.println(Emp2.get("Email"));
	}

}

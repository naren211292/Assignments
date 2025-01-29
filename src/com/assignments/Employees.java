package com.assignments;

public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String emp1Name = "Bharath";
	     String emp2Name = "ABC";
	     String emp3Name = "XYZ";

	     int emp1ID = 1234;
	     int emp2ID = 1235;
	     int emp3ID = 1236;
	     

	}
	
	 public String[] getEmployeeNames() {
		 String emp1Name = "Bharath";
	     String emp2Name = "ABC";
	     String emp3Name = "XYZ";
			return new String[]{emp1Name, emp2Name, emp3Name};
	    }

	    public int[] getEmployeeIDs() {
	    	 int emp1ID = 1234;
		     int emp2ID = 1235;
		     int emp3ID = 1236;
	        return new int[]{emp1ID, emp2ID, emp3ID};
	    }

}

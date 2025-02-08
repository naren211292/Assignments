package com.assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) {
		
		//Store empnames in string array
		String [] empNames = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
		
		//store employee salary, experience, rating details in double array
		Double [] empData1 = {75000.0, 5.0, 4.2};
		Double [] empData2 = {68000.0, 3.0, 3.8};
		Double [] empData3 = {82000.0, 7.0, 4.5};
		Double [] empData4 = {90000.0, 10.0, 2.0};
		Double [] empData5 = {60000.0, 2.0, 3.5};
	
		//store all employee details in hashmap collection
		Map<String, Double[]> employeeData = new HashMap<String, Double[]>();
		
        employeeData.put(empNames[0], empData1);
        employeeData.put(empNames[1], empData2);
        employeeData.put(empNames[2], empData3);
        employeeData.put(empNames[3], empData4);
        employeeData.put(empNames[4], empData5);
	
        //creating hikemap to store the calculated hike values
        Map<String, Double> hikeMap = new HashMap<>();
	    
        //foreach loop to iterate each  employee in employee details hashmap
	    for(String emp : empNames) {
	    	//double array to store the  employee salary, bonus and reward details which are getting from employeeData Map
	    	Double [] data = employeeData.get(emp);
	    	double salary = data[0];
	    	double experience = data[1];
	    	double rating = data[2];
	    	
	    	//declaring variables for variablePay, bonus, reward
	    	double variablePay;
	    	double bonus;
	    	double reward = 0;
	    	
	    	//check the rating and defining variable pay and bonus according to that rating
	    	if(rating>=4) {
	    			variablePay = 15;
	    			bonus = 1500;
	    	} else if(rating >=3) {
	    			variablePay = 10;
	    			bonus = 1200;
	    	}else {
	    		 variablePay = 3;
	    		 bonus = 300;
	    	}
	    	//check the experience and defining reward
	    	if(experience >= 5) {
	    		 reward = 5000;
	    	}
	    	//calculating the hike value
	    	double hike = (salary*variablePay/100) + bonus + reward;
	    	//calculating hike percent
	    	double hikePercent = (hike/salary)*100;
	    	
	    	//adding calculated hikepercent in hikeMap
	    	hikeMap.put(emp, hikePercent);
	    		    	
	}
	    
		System.out.println("Employees Hike Details :" + hikeMap);
    	
	
	 }
	
 }


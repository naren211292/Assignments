package com.assignments;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name = "John Doe";
      int creditScore = 720;
      float income = 55000.0f;
      boolean isEmployed = true;
      float debtToIncomeRatio = 35.0f;
      
      //condition check whether credit score is above 750 or not
      if (creditScore > 750) {
    	  System.out.println("Dear John Doe, your loan is auto approved");
    	  
    	  //if condition to check whether the credit score is above 650 to consider the loan
      }else if(creditScore>=650 && creditScore<750)  {
    	  
    	  System.out.println("Dear '" + name + "', additional checks are required for your loan approval");
    	  
    	  //Nested loop - if condition to check whether the salary is enough to consider the loan
    	  if(income>=50000) {
    		  
    		  //Nested loop - if condition to check whether the person is employed or not
    		  if(isEmployed = true) {
    			  
    			  //Nested loop - if condition to check whether the DebtToRatio is less than 40
    			  if(debtToIncomeRatio <40) {
    				  System.out.println("Dear '" + name + "', after all the checks your loan is approved");
    			  }else {
    				  System.out.println("Loan is denied");
    			  }
    		  } else {
    			  System.out.println("Dear '" + name + "', your Loan is denied");
    		  }
    	  }else {
    		  System.out.println("Dear '" + name + "', your Loan is denied");
    	  }
      }else {
    	  System.out.println("Dear '" + name + "', your Loan is denied");
      }
	}

}

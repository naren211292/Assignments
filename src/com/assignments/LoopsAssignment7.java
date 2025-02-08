package com.assignments;

import java.util.LinkedList;
import java.util.List;


public class LoopsAssignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//storing all the transactions in LinkedList
		List<Integer> transactions = new LinkedList<Integer>();
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);  
		
		//declare variables for credit & debit (count)
		int credit = 0;
		int debit = 0;
		
		//declare variables for total credit & total debit (total amount)
		int totalcredit = 0;
		int totaldebit = 0;
		
		//creating for each loop to iterate each value in a linkedlist
		for (int transaction : transactions)
		//if condition to check if the transaction is credit or debit(+ or -)			
		if (transaction > 0) {
			
			credit++;                   //increase the credit count
			totalcredit += transaction; //add the transaction amount with totalcredit value
			
			//if condition to check the suspecious credit limit
			if (transaction > 10000) {
				System.out.println(transaction + " is suspecious credit transaction");
			}
		} else {
			
			debit++;                    //increase the debit count
			totaldebit += transaction;  //add the transaction amount with totaldebit value
			
			//if condition to check the suspecious credit limit
			if(transaction <-10000) {
				System.out.println(transaction + " is suspecious debit transaction");
			}
			
		}
		
		//calculating the remaining amount in the account
		int remainingamount = totalcredit + totaldebit;
		
		
		System.out.println("Total credit transactions count : " + credit + " Total debit transactions count :" + debit);
		System.out.println("Total credit amount is " + totalcredit +" Total debited amount is "+ totaldebit );
		System.out.println("Total remaining amount in the account is "+ remainingamount );
	}

}

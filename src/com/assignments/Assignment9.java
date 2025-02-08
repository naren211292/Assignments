package com.assignments;

public class Assignment9 {

	public static void main(String[] args) {
		
		//integer array of random numbers
		int [] numbers = {12,34,11,36,87,98,93};
		
		//declaring variables for large, second large and third large numbers
		int large = 0;
		int secondLarge =0;
		int thirdLarge =0;
		
		//foreach loop to iterate each number in the array
		for (int num : numbers) {
			//if condition to check the current number with large number
			if(num > large) {
				//if condition satisfies move the current number to large, large to second large and secondlarge to thirdlarge
				thirdLarge = secondLarge;
				secondLarge = large;
				large = num;

				//else if condition to check the current number with secondlarge number
			}else if(num > secondLarge ) {
				//if condition satisfies move the current number to secondlarge, secondlarge to thirdlarge
				thirdLarge = secondLarge;
				secondLarge = num;
				
				//else if condition to check the current number with thirdlarge number	
			}else if(num > thirdLarge){
				//if condition satisfies move the current number to thirdlarge
				num = thirdLarge;
				
			}
			
		}
		//print the 2nd and 3rd large numbers
		System.out.println("Second Largest number is :" +secondLarge);
		System.out.println("Third Largest number is :" +thirdLarge);

	}

}

package simpleinterest;

import java.util.Scanner;



public class SimpleInterestDemo {
	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	double principle;
	double rate;
	double time;
	double result;

		
	System.out.println("Enter the principle amount : "); 
	principle = userInput.nextDouble();
	
	System.out.print("Enter the rate : ");
	rate = userInput.nextDouble();
	
	System.out.print("Enter the time :");
	time = userInput.nextDouble();
	
	result= principle * rate * time / 100;
	System.out.println("The simple interest is :" + result);
	
	
	}
}

	
	
	
	
	

	
	
	



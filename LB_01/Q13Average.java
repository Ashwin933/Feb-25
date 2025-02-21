//13. Calculate the Average of Three Numbers 

import java.util.Scanner;
class Average{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		System.out.print("Input first number: ");
		double n1=sc.nextInt();
		
        	System.out.print("Input second number: ");
		double n2=sc.nextInt();

        	System.out.print("Input third number: ");
		double n3=sc.nextInt();

		double average=(n1+n2+n3)/3;

		System.out.println("The average is:- " + average);

		
	}
}
//Question 3: Calculator

import java.util.Scanner;
class SimpleCalculator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first no:- ");
		double num1=sc.nextDouble();

		System.out.println("Enter an operator(+,-,*,/):- ");
		char operator=sc.next().charAt(0);

		System.out.println("Enter second no:- ");
		double num2=sc.nextDouble();

		double result;
		
		switch(operator){
			case '+':
				result=num1+num2;
				System.out.println("Result: "+result);
				break;
			case '-':
				result=num1-num2;
				System.out.println("Result: "+result);
				break;
			case '*':
				result=num1*num2;
				System.out.println("Result: "+result);
				break;
			case '/':
				if(num2!=0){
					result=num1/num2;
					System.out.println("Result: "+result);
				}else{
					System.out.println("Error: Division by zero not allowed.");
				}
					break;
			default:
				System.out.println("Invalid Operator! please enter +,-,*,/.");
				

			
		}
	}
}
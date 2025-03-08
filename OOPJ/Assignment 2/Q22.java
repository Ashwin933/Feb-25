/*Q22: Implement a calculator that takes two numbers and an operator (+, -, *, /) as input
and prints the result using only switch-case.*/


import java.util.Scanner;
public class Q22{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
		double result = 0;
		switch(operator){
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				if(num2!=0){
				result=num1/num2;
				}else{
				System.out.println("Error! Division by zero");
				return;
				}
				break;
			default:
				System.out.println("Invalid Operator!");
				return;
		}
		System.out.println("Result: "+result);
	}
}
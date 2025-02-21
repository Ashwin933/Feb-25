//12. Reverse a Number 

import java.util.Scanner;
class Reverse{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input number:- ");
		int n=sc.nextInt();
		
		int reverse=0;
		int original=n;

		while(n!=0){
		int digit=n%10;
		reverse=reverse*10+digit;
		n=n/10;
		}

		System.out.println("The reverse of " + original + " is " + reverse);
		

	}
}
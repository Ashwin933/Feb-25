//20. Count the Number of Digits in a Number 


import java.util.Scanner;
public class CountDigits{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input No:- ");
		int n=sc.nextInt();
		
		int count=0;
		int temp=n;
	
		while(temp!=0){
		temp=temp/10;
		count++;
		}

		System.out.println("The no " + n + " has "+count+" digits");
	}
}
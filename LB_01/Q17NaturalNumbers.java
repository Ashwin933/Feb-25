//17. Print the First N Natural Numbers 

import java.util.Scanner;
public class NaturalNumbers{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input a Number");
		int n=sc.nextInt();
		
		System.out.print("The first "+ n + " natural numbers are: ");

		for(int i=1;i<=n;i++){
		System.out.print(i + " ");
		}
	}
}
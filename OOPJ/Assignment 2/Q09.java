/*Q9: Implement a Java program that checks if a number is within a specific range (20 to
50) without using if-else.
Hint: Use logical AND (&&) in a print statement*/


import java.util.Scanner;
public class Q09{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//boolean x=(num>=20 && num<=50);
		System.out.println("the is Within range(20 to 50): "+ (num>=20 && num<=50));
	}
}
/*Q18: Given a student’s percentage, print “Pass” if the percentage is 40 or above;
otherwise, print “Fail”, using only the ternary operator.*/

import java.util.Scanner;
public class Q18{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int percentage=sc.nextInt();
		
		String result=(percentage>=40)?"Pass":"Fail";
		System.out.println("Result: "+result);
	}
}
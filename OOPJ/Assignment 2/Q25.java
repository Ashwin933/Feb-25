/* Q25: Implement a program that reverses an integer number without using string
conversion (StringBuilder or toCharArray).
Hint: Use while(n!=0) { rev = rev * 10 + n % 10; n/=10; } */

import java.util.Scanner;
public class Q25{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int num=sc.nextInt();
		
		int rev=0;
		
		while(num!=0){
			int lastDigit=num%10;
			rev=rev*10+lastDigit;
			num/=10;
		}
		
		System.out.println("Reversed number: "+rev);
		
	}
}	

//19. Calculate the Power of a Number 

import java.util.Scanner;
public class PowerCalulator{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input base number: ");
        	int base = sc.nextInt();
        
        	System.out.print("Input exponent number: ");
        	int exponent = sc.nextInt();

		long result=1;
		for(int i=0;i<exponent;i++){
		result=result*base;
		}

		        System.out.println(base + " raised to the power " + exponent + " is " + result);
	}
}
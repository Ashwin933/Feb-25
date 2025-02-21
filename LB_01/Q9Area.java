//9. Calculate the Area of a Circle 

import java.util.Scanner;
class Area{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Intput Radius:-");
		double r=sc.nextDouble();
		
		double area=Math.PI*r*r;
		System.out.println("Area of Circle"+area);
		
	
	}
}
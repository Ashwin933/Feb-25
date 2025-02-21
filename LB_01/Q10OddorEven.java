//10. Check If a Number Is Even or Odd 

import java.util.Scanner;
class OddorEven{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No:-");
		int x=sc.nextInt();
		if(x%2==0){
		System.out.println("the Number"+ x +"is even");
		}else{
		System.out.println("the Number"+ x +"is odd");
		}
	}
}
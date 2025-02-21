//7. Multiplication Table 

import java.util.Scanner;
class Mtables{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:-");
		int a=sc.nextInt();
		
		for(int i=1;i<=10;i++){
		System.out.println(a+"X"+i+"="+(a*i));
		}
		
	}
}
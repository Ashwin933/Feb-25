//16. Check Whether a Number Is Prime 

import java.util.Scanner;
public class PrimeNo{

	public static Boolean isPrime(int n){
		if(n<=1){
		return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		
	 	return true;
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:- ");
		int n=sc.nextInt();
		
		if(isPrime(n)){
			System.out.println("The no "+n+" is Prime");
		}else{
			System.out.println("The no "+n+" is not Prime");
		}
	}
}
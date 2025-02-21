// 1. Check Positive Number: 



import java.util.Scanner;
class PositiveCheck{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no:- ");
		int num=sc.nextInt();

		if (num > 0) {
            	System.out.println("The number " + num + " is Positive");
        	}
		else{
            	System.out.println("The number " + num + " is not Positive");
        	}
		
	}
}
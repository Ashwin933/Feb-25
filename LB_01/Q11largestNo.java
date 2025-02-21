//11. Find the Largest of Three Numbers 


import java.util.Scanner;
class largestNo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Input first number: ");
		int n1=sc.nextInt();
		
        	System.out.print("Input second number: ");
		int n2=sc.nextInt();

        	System.out.print("Input third number: ");
		int n3=sc.nextInt();

		int largest;
		if(n1>n2 && n1>n3){
		largest=n1;
		}else if(n2>n1 && n2>n3){
		largest=n2;
		}else{
		largest=n3;
		}

		System.out.println("The largest No is:-"+largest);
	}
}
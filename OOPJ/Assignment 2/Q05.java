/*Q5: Write a Java program to swap two numbers using the += and -= operators only*/

public class Q05{
	public static void main(String args[]){
		 int a=10,b=20;
		 System.out.println("Before Swap: a = " + a + ", b = " + b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After Swap: a = " + a + ", b = " + b);
	}
}
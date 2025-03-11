/*3. Write a program to convert a double value to int using typecasting 
and explain the data loss.*/

public class doubleToint{
	public static void main(String args[]){
		double a=8279.5769;
		
		//Explicitly cast double to int(Narrowing Conversion):-large data type is converted to small
		//data is lost in this 
		int b=(int)a;
		System.out.println(a);
		System.out.println(b);
	}
}
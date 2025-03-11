/*5. Write a program to demonstrate binary, octal, hexadecimal, and 
floating-point literals in Java.*/

public class LiteralsDemo{
	public static void main(String args[]){
		//Binary literals (prefix:0b or 0B)
		int binaryNum=0b0011;
		System.out.println(binaryNum);
		
		//Octal literals (prefix: 0)
		int octalNum=012;
		System.out.println(octalNum);
		
		//HexaDecimal literals(prefix: 0x or 0X)
		int hexaNum=0xA;
		System.out.println(hexaNum);
		
		//Floating-point literals
		float floatNum=12.34f;  // 'f' or 'F' suffix is required for float
		System.out.println(floatNum);
		
		double doubleNum=123.546; //By default,decimal numbers are double
		System.out.println(doubleNum);
		
		//Exponential notation (Scientific notation)
		double expNum=1.22e3; //1.22 x 10³=1220.0
		System.out.println(expNum);
	}
}











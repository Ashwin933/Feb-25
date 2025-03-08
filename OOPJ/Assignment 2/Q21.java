/*Q21: Write a program that increments a number without using + or ++ operators.
Hint: Use bitwise - (~x).*/

public class Q21{
    public static void main(String[] args) {
		int num=10;
		
		/*~num inverts all bits of num, which is equivalent to -(num + 1).
		Applying - to ~num gives num + 1, effectively incrementing the number.*/
		
		int incrementNum= -~num;
		
		System.out.println("Original number: " + num);
        System.out.println("Incremented number: " + incrementNum);
	}
}
/*Q15: Implement a program to swap odd and even bits of a number using bitwise
operators.
Hint: Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1.*/

public class Q15{
	public static void main(String args[]){
		int num=23;
		int evenMask=0xAAAAAAAA;    //10101010101010101010101010101010
		int oddMask=0x55555555;		//01010101010101010101010101010101
		
		int swapped=((num&evenMask)>>1)|((num&oddMask)<<1);
		System.out.println("Original number: " + num);
        System.out.println("Number after swapping odd and even bits: " + swapped);
	}
}
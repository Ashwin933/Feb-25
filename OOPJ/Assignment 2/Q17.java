/*Q17: Implement a Java program that finds the minimum of four numbers using nested
ternary operators*/


public class Q17{
	public static void main(String args[]){
		int a = 12, b = 5, c = 8, d = 15;
		int min=(a<b)?((a<c) ? (a<d ? a : d) : (c < d ? c : d))
				:
				 ((b < c) ? (b < d ? b : d) : (c < d ? c : d));
		System.out.println("The minimum number is: "+min);
	}
}
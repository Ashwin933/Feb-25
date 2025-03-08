/*Q23: Given a number, find whether it is odd or even using the & bitwise operator and print
the result without using if-else.*/

public class Q23{
    public static void main(String[] args) {
        int num = 7; 

        // Using bitwise AND (&) to determine odd/even and ternary operator for output
        String result = (num & 1) == 0 ? "Even" : "Odd";

        System.out.println(num + " is " + result);
    }
}


/*

	111   (Binary of 7)
 &  001   (Binary of 1)
  -------
    001   (Result is 1 → Odd)
	
	
	 1010   (Binary of 10)
   & 0001   (Binary of 1)
   --------
     0000   (Result is 0 → Even)

*/
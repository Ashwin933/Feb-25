/* 17. Write a program to print the following pattern:
 
***** 
 **** 
  *** 
   ** 
    * 
*/


public class InvertedRightAlignedPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}

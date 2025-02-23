/*16. Write a program to print the following pattern: 
    * 
   *** 
  ***** 
 ******* 
*********
*/

public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces for center alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}

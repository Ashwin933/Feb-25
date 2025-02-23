/*22. Write a program to print the following pattern: 
********* 
******* 
***** 
*** 
* 
*** 
***** 
******* 
*********

*/

public class LeftAlignedDiamondPattern {
    public static void main(String[] args) {
        int n = 7; // Maximum number of stars in the top row

        // Upper half (decreasing pattern)
        for (int i = n; i >= 1; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half (increasing pattern)
        for (int i = 3; i <= n; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

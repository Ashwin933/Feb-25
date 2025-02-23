/*25. Write a program to print the following pattern: 
1
12
123
1234
12345

*/

public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns
                System.out.print(j); // Print numbers from 1 to i
            }
            System.out.println(); // Move to the next line
        }
    }
}


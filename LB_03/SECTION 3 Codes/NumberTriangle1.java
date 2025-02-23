/*26. Write a program to print the following pattern: 

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/

public class NumberTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int num = 1; // Start number

        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns
                System.out.print(num + " "); // Print the number
                num++; // Increment the number
            }
            System.out.println(); // Move to the next line
        }
    }
}

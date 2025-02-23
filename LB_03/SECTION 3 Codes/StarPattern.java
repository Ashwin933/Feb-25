/*12. Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
*****  */



public class StarPattern {
    public static void main(String[] args) {
        int rows = 5, columns = 5;

        for (int i = 0; i < rows; i++) { // Outer loop for rows
            for (int j = 0; j < columns; j++) { // Inner loop for columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}


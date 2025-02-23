//11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression


public class PreIncrementPostDecrement {
    public static void main(String[] args) {
        int i = 5, j = 10;
        
        int result = ++i + j--; // Pre-increment i, use j, then decrement j

        System.out.println("Result: " + result);
        System.out.println("Value of i after operation: " + i);
        System.out.println("Value of j after operation: " + j);
    }
}

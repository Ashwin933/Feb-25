//5. Write a program to print the Fibonacci sequence up to the number 21.

public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence up to 21: " + a + " " + b + " ");

        int next;
        while ((next = a + b) <= 21) {
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}

//2. Write a program to compute the factorial of the number 10. 


public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        long factorial = 1; // Use long to handle large values

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}

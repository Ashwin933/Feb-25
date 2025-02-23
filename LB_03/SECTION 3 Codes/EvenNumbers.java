//10. Write a program to print all even numbers between 1 and 50.


public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 50:");

        for (int i = 2; i <= 50; i += 2) { // Start from 2 and increment by 2
            System.out.print(i + " ");
        }
    }
}

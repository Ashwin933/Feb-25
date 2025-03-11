/*11. Write a program to check if a number is positive and even 
using logical operators (&&, ||, !).*/

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPositive = num > 0;
        boolean isEven = num % 2 == 0;

        System.out.println("Is the number positive and even? " + (isPositive && isEven));
        System.out.println("Is the number positive or even? " + (isPositive || isEven));
        System.out.println("Is the number not positive? " + (!isPositive));

    }
}

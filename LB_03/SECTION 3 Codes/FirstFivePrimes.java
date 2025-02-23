//6. Write a program to find and print the first 5 prime numbers. 


public class FirstFivePrimes {
    public static void main(String[] args) {
        int count = 0, num = 2; // Start from the first prime number

        System.out.println("First 5 prime numbers:");
        while (count < 5) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}


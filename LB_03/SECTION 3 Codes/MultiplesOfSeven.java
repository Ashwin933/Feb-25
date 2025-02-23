//3. Write a program to print all multiples of 7 between 1 and 100. 

public class MultiplesOfSeven {
    public static void main(String[] args) {
        System.out.println("Multiples of 7 between 1 and 100:");
        for (int i = 7; i <= 100; i += 7) { // Start at 7 and increment by 7
            System.out.print(i + " ");
        }
    }
}

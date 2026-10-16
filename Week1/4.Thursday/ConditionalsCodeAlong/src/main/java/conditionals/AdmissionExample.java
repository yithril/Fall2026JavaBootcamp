package conditionals;

import java.util.Scanner;

public class AdmissionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a ticket? (true/false): ");
        boolean hasTicket = scanner.nextBoolean();

        if (age >= 18 && hasTicket) {
            System.out.println("You may enter.");
        } else if (age < 18 || !hasTicket) {
            System.out.println("You may not enter.");
        }

        scanner.close();
    }
}

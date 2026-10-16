package conditionals;

import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a drink:");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Water");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose coffee.");
                break;
            case 2:
                System.out.println("You chose tea.");
                break;
            case 3:
                System.out.println("You chose water.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

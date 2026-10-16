package conditionals;

import java.util.Scanner;

public class DayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String day = scanner.nextLine();

        if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("It's the weekend!");
        } else if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }

        scanner.close();
    }
}

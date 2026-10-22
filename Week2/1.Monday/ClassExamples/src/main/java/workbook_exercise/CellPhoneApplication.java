package workbook_exercise;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();

        System.out.println("What is the carrier?");
        String carrier = scanner.nextLine();
        cellPhone.setCarrier(carrier);

        System.out.println("What is the model?");
        String model = scanner.nextLine();

        System.out.println("What is the number of buttons?");
        int numberOfButtons = Integer.parseInt(scanner.nextLine());

        cellPhone.setCarrier(carrier); //call a method
    }
}

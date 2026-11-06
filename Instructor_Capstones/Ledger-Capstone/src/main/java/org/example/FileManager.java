package org.example;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static List<Transaction> readFile() {
        List<Transaction> transactions = new ArrayList<>();

        String filePath = "src/main/resources/transactions.csv";
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File does not exist: " + filePath);
            return transactions;  // Return empty list if file doesn't exist
        }

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                try {
                    LocalDate date = LocalDate.parse(parts[0]);
                    LocalTime time = LocalTime.parse(parts[1]);
                    String description = parts[2];
                    String vendor = parts[3];
                    double amount = Double.parseDouble(parts[4]);

                    Transaction transaction = new Transaction(date, time, description, vendor, amount);
                    transactions.add(transaction);
                } catch (Exception e) {
                    System.out.println("Skipping invalid row: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing reader: " + e.getMessage());
                }
            }
        }

        return transactions;
    }

    public static void writeToFile(Transaction transaction) {
        String filePath = "src/main/resources/transactions.csv";
        File file = new File(filePath);

        try {
            // Step 1: Make sure the folder exists
            File folder = file.getParentFile();
            if (!folder.exists()) {
                folder.mkdirs();
            }

            // Step 2: Check if file exists and is empty
            boolean fileExists = file.exists();
            boolean isEmpty = !fileExists || file.length() == 0;

            // Step 3: Open file in append mode
            FileWriter writer = new FileWriter(file, true);

            // Step 4: Write header if it's a new or empty file
            if (isEmpty) {
                writer.write("date|time|description|vendor|amount\n");
            }

            // Step 5: Write the transaction
            writer.write(transaction.toString() + "\n");

            // Step 6: Close the writer
            writer.close();

        } catch (IOException e) {
            System.out.println("Something went wrong while saving the transaction.");
            e.printStackTrace();
        }
    }
}

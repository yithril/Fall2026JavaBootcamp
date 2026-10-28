package org.searchinventory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static List<Product> getProducts(){
        List<Product> products = new ArrayList<>();

        try {
             BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                int id = Integer.parseInt(parts[0]);
                String description = parts[1];
                double price = Double.parseDouble(parts[2]);

                Product product = new Product(id, description, price);
                products.add(product);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("There was a problem reading the inventory file.");
        }
        catch(Exception ex){
            System.out.println("Something went from with the file.");
        }

        return products;
    }

    public static void writeProduct(Product product){
        try{
            File file = new File("src/main/resources/inventory.csv");
            FileWriter fileWriter = new FileWriter(file, true);
            if (file.length() > 0) {
                fileWriter.write(System.lineSeparator());
            }

            fileWriter.write(String.format("%d|%s|%f", product.getId(), product.getDescription(),
                    product.getPrice()));

            fileWriter.close();
        }
        catch(IOException ex){
            System.out.println("Error writing to file.");
        }
    }
}

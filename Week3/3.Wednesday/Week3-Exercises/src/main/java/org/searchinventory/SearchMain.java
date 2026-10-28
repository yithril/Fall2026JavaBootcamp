package org.searchinventory;

import java.util.List;
import java.util.Scanner;

public class SearchMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = FileManager.getProducts();

        while (true) {
            System.out.println("\n=== Video Game Store Menu ===");
            System.out.println("1. View all products");
            System.out.println("2. Search by id");
            System.out.println("3. Search by price range");
            System.out.println("4. Add Product");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    displayProducts(products);
                    break;
                case 2:
                    System.out.println("What is the id of the product you're looking for?");
                    int userChoice = Integer.parseInt(scanner.nextLine());
                    getProductById(products, userChoice);
                    break;
                case 3:
                    System.out.println("What is the min price of the product?");
                    int minPrice = Integer.parseInt(scanner.nextLine());
                    System.out.println("What is the max price of the product?");
                    int maxPrice = Integer.parseInt(scanner.nextLine());

                    //defensive coding
                    if(minPrice > maxPrice){
                        System.out.println("Please make sure min is lower than max");
                    }
                    else{
                        getProductByPriceRange(products, minPrice, maxPrice);
                    }
                    break;
                case 4:
                    addProduct(scanner);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose a number from 1 to 4.");
                    break;
            }
        }
    }

    public static void displayProducts(List<Product> products){
        for(Product product : products){
            System.out.println(product.toString());
        }
    }

    public static void getProductById(List<Product> products, int id){
        //two options, I have the product or I don't
        for(Product product : products){
            if(product.getId() == id){
                System.out.println(product.toString());
                return;
            }
        }

        System.out.println("Sorry, we don't have item with id " + id);
    }

    public static void getProductByPriceRange(List<Product> products,
                                              int minPrice, int maxPrice){
        for(Product product : products){
            if(product.getPrice() >= minPrice && product.getPrice() <= maxPrice){
                System.out.println(product.toString());
            }
        }
    }

    public static void addProduct(Scanner scanner){
        System.out.println("What is the name of the product?");
        String productName = scanner.nextLine();

        System.out.println("What is the price?");
        double productPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("What is the id?");
        int productId = Integer.parseInt(scanner.nextLine());

        Product product = new Product(productId, productName, productPrice);

        FileManager.writeProduct(product);
    }
}

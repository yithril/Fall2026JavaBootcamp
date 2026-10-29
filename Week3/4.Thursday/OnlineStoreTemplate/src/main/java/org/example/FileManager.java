package org.example;

import java.util.ArrayList;
import java.util.List;

//You should have two methods here, one to return a list of
//products, another to take a product and write it to the file
//No menus, no scanner, no questions, just read from the file
//write to the file. That's it.
public class FileManager {
    //The reason these are static is so that you can directly
    //call the method like FileManager.getProducts()
    //Notice the capital F
    public static List<Product> getProducts(){
        //You are going to write code to read the products
        //from the file, put them in a list and return them
        return new ArrayList<>();
    }

    public static void writeProduct(Product product){
        //This method you will take the product that is being
        //put in to this method, take its data and write it to the file
    }
}

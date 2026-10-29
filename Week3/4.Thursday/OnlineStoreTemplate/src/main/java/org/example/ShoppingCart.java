package org.example;

import java.util.ArrayList;
import java.util.List;

//One of the properties of the shopping cart
//should be the products in the shopping cart
//What data structure would make sense here?
public class ShoppingCart {
    //Be sure to instantiate the list before using it
    public List<Product> cart = new ArrayList<>();

    //These methods are just placeholders, fill them in
    //With real logic
    public void addToCart(Product product){

    }

    public void removeFromCart(Product product){

    }

    public double getCartTotal(){
        return 0;
    }
}

package org.example;

import java.util.ArrayList;

public class StockManager {
    private ArrayList<Product> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }

    public boolean addStock(String productName, int quantity) {
        if (quantity <= 0) {
            return false;
        }

        Product product = findProduct(productName);
        if (product == null) {
            stock.add(new Product(productName, quantity));
        } else {
            product.setQuantity(product.getQuantity() + quantity);
        }
        return true;
    }

    public boolean removeStock(String productName, int quantity) {
        Product product = findProduct(productName);
        if (product == null || product.getQuantity() < quantity) {
            return false;
        }
        product.setQuantity(product.getQuantity() - quantity);
        return true;
    }

    public int getStock(String productName) {
        Product product = findProduct(productName);
        return product != null ? product.getQuantity() : -1;
    }

    private Product findProduct(String productName) {
        for (Product product : stock) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
}

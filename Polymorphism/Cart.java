package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calculateTotalPrice(Product... products) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getBasePrice();
        }
        System.out.println("Total price of cart: " + totalPrice);
    }
}


package Polymorphism;

public class Main {

    public static void main(String[] args) {

        Electronics laptop = new Electronics("E001", "Laptop", 1000.0, 24);
        Clothing jacket = new Clothing("C001", "Winter Jacket", 200.0, "M", 20.0);

        // Apply discount of 10% to the Laptop
        laptop.applyDiscount(10);

        // Calculate the final price of the Laptop and Winter Jacket
        double laptopFinalPrice = laptop.getFinalPrice();
        double jacketFinalPrice = jacket.getFinalPrice();

    System.out.println("Final price of Laptop: " + laptopFinalPrice);
    System.out.println("Final price of Winter Jacket: " + jacketFinalPrice);

      // Add both products to the cart and calculate the total price
      Cart cart = new Cart();
      cart.addProduct(laptop);
      cart.addProduct(jacket);
      cart.calculateTotalPrice(laptop, jacket);
    }
}

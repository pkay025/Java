package Polymorphism;

public abstract class Product {
    private String productId;
    private String productName;
    private double basePrice;


    public Product(String productId, String productName, double basePrice) {
        this.productId = productId;
        this.productName = productName;
        this.basePrice = basePrice;
    }
    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getBasePrice() {
        return basePrice;
    }

    public void applyDiscount(double percentage) {
        basePrice = basePrice * (percentage / 100);
        System.out.println("Discount applied. New price: " + basePrice);
    }
    public abstract double calculateFinalPrice();
   
    }


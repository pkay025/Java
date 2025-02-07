package Polymorphism;

public class Electronics extends Product {
    private int warrantyPeriod;

    public Electronics(String productId, String productName, double basePrice, int warrantyPeriod) {
        super(productId, productName, basePrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateFinalPrice() {
        double finalPrice = getBasePrice() + (getBasePrice() * 0.10);
        System.out.println("Final price of " + getProductName() + " with warranty: " + finalPrice);
        return finalPrice;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public double getFinalPrice() {
        return calculateFinalPrice();
    }
}

    
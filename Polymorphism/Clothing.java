package Polymorphism;

public class Clothing extends Product{
    private String size;
    private double seasonDiscount;
    
    public Clothing(String productId, String productName, double basePrice, String size, double seasonDiscount){
        super(productId, productName, basePrice);
        this.size = size;
        this.seasonDiscount = seasonDiscount;

    }
    public String getSize(){
        return size;
    }

    @Override
    public double calculateFinalPrice() {
        double finalPrice = getBasePrice() - seasonDiscount;
        System.out.println("Final price of " + getProductName() + " after seasonal discount: " + finalPrice);
        return finalPrice;
    }
    public double getFinalPrice() {
        return calculateFinalPrice();
    }
}

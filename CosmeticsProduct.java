// Define the concrete Products
public class CosmeticsProduct extends Product {
    static final String cosmeticsCategory = "Cosmetics";
    public CosmeticsProduct(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
        super.category = cosmeticsCategory;
    }

    public void display() {
        System.out.println("Cosmetics Product");
    }
} 
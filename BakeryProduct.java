// Define the concrete Products
public class BakeryProduct extends Product {
    static final String bakeryCategory = "Bakery";
    public BakeryProduct(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
        super.category = bakeryCategory;
    }

    
    public void display() {
        System.out.println("Bakery Product");
        System.out.println(this.name);
        System.out.println(this.description);
        System.out.println(this.price);
    }
}

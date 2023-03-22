// Define the concrete Products
public class ElectronicsProduct extends Product {
    static final String electronicsCategory = "Electronics";
    public ElectronicsProduct(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
        super.category = electronicsCategory;
    }

    public void display() {
        System.out.println("Electronics Product");
        System.out.println(this.name);
        System.out.println(this.description);
        System.out.println(this.price);
    }
}

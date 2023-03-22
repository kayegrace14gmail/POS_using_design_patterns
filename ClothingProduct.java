// Define the concrete Products
public class ClothingProduct extends Product {
    static final String clothingCategory = "Clothing";
    public ClothingProduct(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
        super.category = clothingCategory;
    }
    public void display() {
        System.out.println("Clothing product");
    }
}

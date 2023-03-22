// Define the concrete Products
public class BeverageProduct extends Product {
    static final String beverageCategory = "Beverage";
    public BeverageProduct(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
        super.category = beverageCategory;
    }
    public void display() {
        System.out.println("Beverage Product");
    }
}


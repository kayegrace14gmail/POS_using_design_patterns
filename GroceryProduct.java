public class GroceryProduct extends Product {
    static final String groceryCategory = "Grocery";
    public GroceryProduct(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
        super.category = groceryCategory;
    }
    
    public void display() {
        System.out.println("Grocery Product");
    }
}
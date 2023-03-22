public class GroceryFactory implements Factory {
    public Product createProduct(String name, String description, float price) {
        return new GroceryProduct(name, description, price);
    }
}

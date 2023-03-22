// Define the concrete Factories
public class BakeryFactory implements Factory {
    public Product createProduct(String name, String description, float price) {
        return new BakeryProduct(name, description, price);
    }
}

// Define the concrete Factories
public class ClothingFactory implements Factory {
    public Product createProduct(String name, String description, float price) {
        return new ClothingProduct(name, description, price);
    }
}

// Define the concrete Factories
public class ElectronicsFactory implements Factory {
    public Product createProduct(String name, String description, float price) {
        return new ElectronicsProduct(name, description, price);
    }
}
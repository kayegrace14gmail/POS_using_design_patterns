// Define the concrete Factories
public class CosmeticsFactory implements Factory {
    public Product createProduct(String name, String description, float price) {
        return new CosmeticsProduct(name, description, price);
    }
}


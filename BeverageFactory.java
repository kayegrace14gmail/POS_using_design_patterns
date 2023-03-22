// Define the concrete Factories
public class BeverageFactory implements Factory {
    public Product createProduct(String name, String description, float price) {
        return new BeverageProduct(name, description, price);
    }
}

     // Client code that uses the Factory Method to create Products
    import java.util.List;
    public class Client {
    public static void main(String[] args) {
        // Use ElectronicsFactory to create ElectronicsProduct
        Factory electronics = new ElectronicsFactory();
        Product electronicsproduct = electronics.createProduct("Extension","High capacity Extension cable", 40000);

      // refers to the only object of Database
      ProductCatalog productcatalog = ProductCatalog.getInstance();
      productcatalog.addProduct(electronicsproduct);

    //     // Use GroceryFactory to create GroceryProduct
    //     Factory grocery = new GroceryFactory();
    //     Product groceryproduct = grocery.createProduct();



         //use ClothingFactory to create ClothingProduct
         Factory clothing = new ClothingFactory();
         Product clothingproduct = clothing.createProduct("Puma Jumper","A hoodless Jumper by Puma label",3500);
         productcatalog.addProduct(clothingproduct);
    
        //use BakeryFactory to create BakeryProduct
        Factory bakery = new BakeryFactory();
        Product bakeryproduct = 
        bakery.createProduct("Kiddawalime loaf","Rectangular loaf by Kiddawalime Bakery",4000);
        productcatalog.addProduct(bakeryproduct);

        // Retrieving the products
        List <Product> currentProductList = productcatalog.getProducts();

        for(int i=0; i<currentProductList.size(); i++) {
            System.out.println("Category:"+currentProductList.get(i).category);
            System.out.println("Product:"+currentProductList.get(i).name);
            System.out.println("Description:" +currentProductList.get(i).description);
            System.out.println("Price: UGX"+currentProductList.get(i).price);
            System.out.println("\n");
        }

    //      //use BeverageFactory to create BeverageProduct
    //      Factory beverage = new BeverageFactory();
    //      Product beverageproduct = beverage.createProduct();
    //      beverageproduct.display();

    //       //use CosmeticsFactory to create CosmeticsProduct
    //       Factory cosmetics = new CosmeticsFactory();
    //       Product cosmeticsproduct = cosmetics.createProduct();
    //       cosmeticsproduct.display();
    }
} 


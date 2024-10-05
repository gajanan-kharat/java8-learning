package ConsumerInterface;
import java.util.function.BiConsumer;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void updateProduct(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " [Price: $" + price + ", Quantity: " + quantity + "]";
    }
}

public class ConsumerInterface{
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000.0, 10);

        BiConsumer<Double, Integer> updateProduct = (newPrice, newQuantity) -> {
            product.updateProduct(newPrice, newQuantity);
        };

        updateProduct.accept(1200.0, 15);

        // Print the updated product
        System.out.println(product);  // Output: Laptop [Price: $1200.0, Quantity: 15]
    }
}


package Stream;
import java.util.Arrays;
import java.util.List;

class Product13 {
    private String name;
    private double price;

    // Constructor
    public Product13(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double discountPercentage) {
        this.price -= this.price * (discountPercentage / 100);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + String.format("%.2f", price) + "}";
    }
}

public class PeekorForeach {
    public static void main(String[] args) {
        List<Product13> products = Arrays.asList(
                new Product13("Laptop", 1200.00),
                new Product13("Smartphone", 800.00),
                new Product13("Tablet", 300.00),
                new Product13("Smartwatch", 150.00),
                new Product13("Headphones", 50.00)
        );

        double discountPercentage = 10.0;

        products.stream()
                .peek(product -> product.applyDiscount(discountPercentage))
                .forEach(product -> System.out.println(product));

//        Product{name='Laptop', price=1080.00}
//        Product{name='Smartphone', price=720.00}
//        Product{name='Tablet', price=270.00}
//        Product{name='Smartwatch', price=135.00}
//        Product{name='Headphones', price=45.00}

    }
}


















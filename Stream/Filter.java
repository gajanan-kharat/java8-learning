package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Arrays;

//Example 2: Filter the product by price
//
//Product Name	Price ($)
//Laptop	                 1200.00
//Smartphone	         800.00
//Tablet	                 300.00
//Smartwatch	         150.00
//Headphones	         50.00
//
//Min price=100;
//Max price=800;
//

class Product1 {
    String name;
    double price;

    Product1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

public class Filter {
    public static void main(String[] args) {
        List<Product1> products = Arrays.asList(
                new Product1("Laptop", 1200.00),
                new Product1("Smartphone", 800.00),
                new Product1("Tablet", 300.00),
                new Product1("Smartwatch", 150.00),
                new Product1("Headphones", 50.00)
        );

        double minPrice = 100.00;
        double maxPrice = 800.00;

        List<Product1> filteredProducts = products.stream()
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .collect(Collectors.toList());

        System.out.println("Products in the price range $" + minPrice + " - $" + maxPrice + ": " + filteredProducts);
        //Products in the price range $100.0 - $800.0: [Smartphone ($800.0), Tablet ($300.0), Smartwatch ($150.0)]

    }
}



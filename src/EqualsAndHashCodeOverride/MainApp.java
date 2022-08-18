package EqualsAndHashCodeOverride;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        MainApp app = new MainApp();
        Product productOne = new Product(1, "cheese", 15);
        Product productTwo = new Product(1, "milk", 3);
        Product productThree = new Product(1, "water", 1);
        Product productFour = new Product(1, "bread", 2);
        Product productFive = new Product(1, "meat", 20);

        List<Product> products = new ArrayList<>(Arrays.asList(productOne,productTwo,productThree,productFour,productFive));
        Set<Product> uniqueProducts = app.addUniqueProducts(products);
        Iterator<Product> iterator = uniqueProducts.iterator();
        while (iterator.hasNext()){
            Product product = iterator.next();
            System.out.println(product);
        }
    }

    private Set<Product> addUniqueProducts(List<Product> products){
        Set<Product> productSet = new HashSet<>();
        for (Product product: products) {
            productSet.add(product);
        }
        return productSet;
    }
}

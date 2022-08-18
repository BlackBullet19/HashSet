package EqualsAndHashCodeOverride;

import java.util.Objects;

public class Product {

    private int productId;
    private String name;
    private int price;

    public Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }

    @Override
    public String toString() {
        return "Product - " + name + ", productId=" + productId + ", price=" + price;
    }
}

package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product == null) {
                products[index] = products[index - 1];
                products[index - 1] = products[index];
            }
        }
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName());
        }
    }
}

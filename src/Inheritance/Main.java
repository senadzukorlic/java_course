package Inheritance;

import Inheritance.product.Pants;
import Inheritance.product.Product;
import Inheritance.product.Shirt;

public class Main {
    public static void main(String[] args) {

        Shirt shirt = new Shirt();

        shirt.setSize(Shirt.Size.MEDIUM);
        shirt.setBrand("Nike");
        shirt.setColor("Red");
        shirt.setPrice(25.99);
        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants();

        pants.setWaist(32);
        pants.setLength(34);
        pants.setBrand("Levi's");
        pants.setColor("Blue");
        pants.setPrice(49.99);
        pants.fold();
        productStore(pants);
    }
public static void productStore(Product product){
    System.out.println("Thank you for purchasing " + product.getBrand() + ". " + product.getClass().getSimpleName().toLowerCase() + " " +  "Your total is $" + product.getPrice());
}
}

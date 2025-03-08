package Inheritance;

import Inheritance.product.Pants;
import Inheritance.product.Shirt;

public class Main {
    public static void main(String[] args) {

        Shirt shirt = new Shirt();

        shirt.setSize(Shirt.Size.MEDIUM);
        shirt.setBrand("Nike");
        shirt.setColor("Red");
        shirt.setPrice(25.99);
        shirt.fold();

        Pants pants = new Pants();

        pants.setWaist(32);
        pants.setLength(34);
        pants.setBrand("Levi's");
        pants.setColor("Blue");
        pants.setPrice(49.99);
        pants.fold();
    }

}

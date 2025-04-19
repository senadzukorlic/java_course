package Inheritance;

import Inheritance.product.Pants;
import Inheritance.product.Product;
import Inheritance.product.Shirt;

public class Main {
    public static void main(String[] args) {

        Shirt shirt = new Shirt(10.00, "blue", "Nike", Shirt.Size.LARGE);


        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants(49.99, "black", "Levi's", 32, 34);
        pants.setWaist(123 );

        pants.fold();
        productStore(pants);
    }
public static void productStore(Product product){
    System.out.println("Thank you for purchasing " + product.getBrand() + ". " + product.getClass().getSimpleName().toLowerCase() + " " +  "Your total is $" + product.getPrice());
}
}

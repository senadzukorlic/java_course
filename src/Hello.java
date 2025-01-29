public class Hello {
    public static void main(String[] args) {
        Car Toyota = new Car();
        Toyota.make = "Toyota";
        Toyota.price = 20000;
        Toyota.year = 2020;
        Toyota.color = "Red";

        Car Nissan = new Car();
        Nissan.make = "Nissan";
        Nissan.price = 25000;
        Nissan.year = 2021;
        Nissan.color = "Blue";

        System.out.println("Toyota: " + Toyota.make + " " + Toyota.price + " " + Toyota.year + " " + Toyota.color);
        System.out.println("Nissan: " + Nissan.make + " " + Nissan.price + " " + Nissan.year + " " + Nissan.color);

    }
}

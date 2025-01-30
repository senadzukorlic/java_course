public class Hello {
    public static void main(String[] args) {
        Car Toyota = new Car("Toyota", 20000, 2020, "Red");
//        Toyota.make = "Toyota";
//        Toyota.price = 20000;
//        Toyota.year = 2020;
//        Toyota.color = "Red";

        Car Nissan = new Car("Nissan", 25000, 2021, "Blue");
//        Nissan.make = "Nissan";
//        Nissan.price = 25000;
//        Nissan.year = 2021;
//        Nissan.color = "Blue";

        System.out.println("Toyota: " + Toyota.getMake() + " " + Toyota.getPrice() + " " + Toyota.getYear() + " " + Toyota.getColor());
        System.out.println("Nissan: " + Nissan.getMake() + " " + Nissan.getPrice() + " " + Nissan.getYear() + " " + Nissan.getColor());

    }
}

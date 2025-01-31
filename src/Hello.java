public class Hello {
    public static void main(String[] args) {
        Car Toyota = new Car("Toyota", 20000, 2020, "Red");
        Car Nissan = new Car("Nissan", 25000, 2021, "Blue");

        Car Toyota2 = new Car(Toyota);

        Toyota2.setColor("Green");
        Toyota.setColor("Yellow");

        System.out.println("Toyota: " + Toyota.getMake() + " " + Toyota.getPrice() + " " + Toyota.getYear() + " " + Toyota.getColor());
        System.out.println("Nissan: " + Nissan.getMake() + " " + Nissan.getPrice() + " " + Nissan.getYear() + " " + Nissan.getColor());
        System.out.println("Toyota2: " + Toyota2.getMake() + " " + Toyota2.getPrice() + " " + Toyota2.getYear() + " " + Toyota2.getColor());

    }
}

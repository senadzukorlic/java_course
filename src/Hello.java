public class Hello {
    public static void main(String[] args) {
        String[] spareParts = new String[]{"Engine", "Tires", "Brakes"};
        Car Toyota = new Car("Toyota", 20000, 2020, "Red", spareParts);
        Car Nissan = new Car("Nissan", 25000, 2021, "Blue", spareParts);

        Car Toyota2 = new Car(Toyota);


        Toyota.drive();
    }
}

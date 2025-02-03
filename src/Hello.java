public class Hello {
    public static void main(String[] args) {

        Car Toyota = new Car("Toyota", 20000, 2020, "Red", new String[]{"Engine", "Tires", "Brakes"});
        Car Nissan = new Car("Nissan", 25000, 2021, "Blue", new String[]{"Engine", "Tires", "Brakes"});


        Nissan.setColor("Green");
        Toyota.drive();
    }
}

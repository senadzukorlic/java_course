public class Hello {
    public static void main(String[] args) {

        Car[] cars=new Car[]{
                new Car("Dodge", 20000, 2020, "Red", new String[]{"Engine", "Tires", "Brakes"}),
                new Car("Nissan", 25000, 2021, "Blue", new String[]{"Engine", "Tires", "Brakes"}),
                new Car("Subaru", 30000, 2022, "Black", new String[]{"Engine", "Tires", "Brakes"}),
                new Car("Ford", 35000, 2023, "White", new String[]{"Engine", "Tires", "Brakes"})
        };

        Dealership dealership = new Dealership(cars);

        System.out.println("Dealership has the following cars:" + dealership.toString());
    }
}

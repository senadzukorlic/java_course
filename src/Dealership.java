

public class Dealership {
       private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for(int i=0;i<this.cars.length;i++){
            this.cars[i]=new Car(cars[i]);
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Available cars:\n");
        for (Car car : cars) {
            sb.append(car.toString()).append("\n"); // Pozivanje toString() iz klase Car
        }
        return sb.toString();
    }
}

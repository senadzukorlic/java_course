package Enums;
import Enums.model.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        car.drive(Car.TrafficLight.GREEN);
    }

}

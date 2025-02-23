package Objects;

import java.util.Arrays;

public class Car {

        private  String make;
        private double price;
        private int year;
        private String color;
        private String[] parts;

        public Car(String make, double price, int year, String color, String[] parts) {
            //Konstruktor,koristi se za kreiranje   objeakta
            this.make = make;
            this.price = price;
            this.year = year;
            this.color = color;
            this.parts = Arrays.copyOf(parts, parts.length);
        }

        public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);

    }
        public void setColor(String color) {
            this.color = color;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }


        public double getPrice() {
            return price;
        }

        public String getMake() {
            return make;
        }

        public int getYear() {
            return year;
        }

        public String getColor() {
            return color;
        }

        public String[] getParts() {
            return Arrays.copyOf(this.parts, this.parts.length);
        }


    public String toString() {
        return "Marka: " + make + ", Cena: " + price + ", Godina: " + year + ", Boja: " + color + ", Delovi: " + Arrays.toString(parts);
    }


        public void drive(){
        System.out.println("You bought a " + make + " " + year + " " + color + " for " + price + " dollars. Enjoy your ride!");
        }


}



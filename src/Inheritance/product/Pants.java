package Inheritance.product;

public class Pants extends Product {

    private int waist;
    private int length;

    public Pants(double price, String color, String brand,int length, int waist) {
        super(price, color, brand);
        this.length = length;
        this.waist = waist;
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

@Override
    public void fold() {
        System.out.println("\nFolding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }





}

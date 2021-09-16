package main.java;

public class Opel implements Car {

    String color;
    String brand = "Opel";
    String regNumber;
    String engine;

    public Opel(String color, String brand) {
        this.color = color;
        this.brand = brand;
        setRegistrationNumber();
    }

    public Opel(String color) {
        this.color = color;
        engine = "2.4 TFS";
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getRegistrationNumber() {
        return regNumber;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    public String setRegistrationNumber() {
        return this.regNumber = RegNumberGenerator.getAlphaNumericString(6);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

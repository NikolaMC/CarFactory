package main.java;

public class Volvo implements Car {

    String color;
    String brand = "Volvo";
    String regNumber;

    public Volvo(String color) {
        this.color = color;
        setRegistrationNumber();
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

    public String setRegistrationNumber() {
        return this.regNumber = RegNumberGenerator.getAlphaNumericString(6);
    }
}

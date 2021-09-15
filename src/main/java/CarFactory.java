package main.java;

public class CarFactory {
    public Car getCar(String brand) {
        if(brand == null) {
            return null;
        }
        if(brand == "Opel") {
            Opel opel = new Opel("Red");
            System.out.println(opel.getRegistrationNumber());
            return opel;
        } else if(brand == "Volvo") {
            Volvo volvo = new Volvo("White");
            System.out.println(volvo.getRegistrationNumber());
            return volvo;
        }

        return null;
    }
}
package main.java;

public class CarFactory {
    public Car getCar(String brand) throws CarException {
        switch(brand) {
            case "Opel": {
                Opel opel = new Opel("Red");
                System.out.println(opel.getRegistrationNumber());
                return opel;
            }
            case "Volvo": {
                Volvo volvo = new Volvo("White");
                System.out.println(volvo.getRegistrationNumber());
                return volvo;
            }
            default: {
                throw new CarException("Not a valid brand");
            }
        }
    }
}

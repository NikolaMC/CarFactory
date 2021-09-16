package main.java;

public class CarFactory {


    public Car createCar(String color, String brand) throws CarException {


        switch( brand.toLowerCase() ){
            case "opel": {
                 return new Opel(color);
            }
            case "volvo": {
                return  new Volvo(color);
            }
            default: {
                throw new CarException("Not a valid brand");
            }
        }
    }
    public String getCar(String brand, String color){


        return brand + color;
    }
}

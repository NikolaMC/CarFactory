package main.java;

public class CarFactory {

    private String[] brands = {"Volvo", "Opel", "a"};
    private String[] engines = {"Engine1", "Engine2"};

    private String swedishRegistrationPlate() {
        String Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        StringBuilder lettersSb = new StringBuilder(3);
        StringBuilder numSb = new StringBuilder(3);

        for (int i = 0; i < 3; i++) {
            int index = (int)(Letters.length() * Math.random());
            lettersSb.append(Letters.charAt(index));
        }
        for (int i = 0; i < 3; i++) {
            int index = (int)(numbers.length() * Math.random());
            numSb.append(numbers.charAt(index));
        }
        StringBuilder regPlate = new StringBuilder(6);
        regPlate.append(lettersSb);
        regPlate.append(numSb);

        return regPlate.toString();
    }

    public Car getCar(String color) throws CarException {
        switch(brands[0]) {
            case "Opel": {
                Car opel = new Car(color);
                opel.setRegNumber(swedishRegistrationPlate());
                System.out.println(opel.getRegNumber());
                opel.setBrand(brands[0]);
                opel.setEngine(engines[0]);
                return opel;
            }
            case "Volvo": {
                Car volvo = new Car(color);
                volvo.setRegNumber(swedishRegistrationPlate());
                System.out.println(volvo.getRegNumber());
                volvo.setBrand(brands[0]);
                volvo.setEngine(engines[0]);
                return volvo;
            }
            default: {
                throw new CarException("Not a valid brand");
            }
        }
    }
}

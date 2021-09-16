package main.java;

public class CarFactory {

    private String[] brands = {"Volvo", "Opel"};
    private String[] engines = {"Engine1", "Engine2"};

    private String getAlphaNumericString() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
        StringBuilder sb = new StringBuilder(6);

        for (int i = 0; i < 6; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }

    public Car getCar(String color) throws CarException {
        switch(brands[0]) {
            case "Opel": {
                Car opel = new Car(color);
                opel.setRegNumber(getAlphaNumericString());
                System.out.println(opel.getRegNumber());
                opel.setBrand(brands[0]);
                opel.setEngine(engines[0]);
                return opel;
            }
            case "Volvo": {
                Car volvo = new Car(color);
                volvo.setRegNumber(getAlphaNumericString());
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

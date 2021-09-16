package test;

import main.java.Car;
import main.java.CarException;
import main.java.CarFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarFactoryTest {
    CarFactory carFactory;
    private Car volvo;

    @Before
    public void init() throws CarException {
        carFactory = new CarFactory();
        volvo = carFactory.createCar("red", "Volvo");
    }

    @Test
    public void test_get_volvo_car_brand_success() throws CarException {
        assertEquals("volvo", volvo.getBrand());
    }

    @Test
    public void test_get_volvo_car_color_success() throws CarException {
        assertEquals("red", volvo.getColor());
    }

    @Test
    public void test_get_non_existing_car_brand_fail() throws CarException {

        CarException carException = assertThrows(CarException.class, () -> carFactory.createCar("red", "Bmw"));
        assertEquals("Not a valid brand", carException.getMessage());
    }

   /* @Test
    public void test_get_volvo_car_color_success() throws CarException { assertEquals("White", carFactory.getCar("Volvo").getColor()); }
*/

}

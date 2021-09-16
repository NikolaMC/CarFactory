package test;

import main.java.CarException;
import main.java.CarFactory;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarFactoryTest {
    CarFactory carFactory = new CarFactory();

    @Test
    public void test_get_opel_car_brand_success() throws CarException { assertEquals("Opel", carFactory.getCar("Opel").getBrand()); }

    @Test
    public void test_get_opel_car_color_success() throws CarException { assertEquals("Red", carFactory.getCar("Opel").getColor()); }

    @Test
    public void test_get_volvo_car_brand_success() throws CarException {
        assertEquals("Volvo", carFactory.getCar("Volvo").getBrand());
    }

    @Test
    public void test_get_volvo_car_color_success() throws CarException { assertEquals("White", carFactory.getCar("Volvo").getColor()); }

    @Test
    public void test_wrong_car_brand_fail() {
        CarException carException = assertThrows(CarException.class, () -> carFactory.getCar("ASdfa"));
        assertEquals("Not a valid brand", carException.getMessage());
    }
}

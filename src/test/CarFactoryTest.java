package test;

import main.java.CarFactory;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFactoryTest {
    CarFactory carFactory = new CarFactory();

    @Test
    public void test_get_opel_car_brand_success() {
        assertEquals("Opel", carFactory.getCar("Opel").getBrand());
    }

    @Test
    public void test_get_opel_car_color_success() { assertEquals("Red", carFactory.getCar("Opel").getColor()); }

    @Test
    public void test_get_volvo_car_brand_success() {
        assertEquals("Volvo", carFactory.getCar("Volvo").getBrand());
    }

    @Test
    public void test_get_volvo_car_color_success() { assertEquals("White", carFactory.getCar("Volvo").getColor()); }
}

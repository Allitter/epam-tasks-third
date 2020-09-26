package com.epam.tasks.third.domain;

import com.epam.tasks.third.domain.models.Car;
import com.epam.tasks.third.domain.models.CarPark;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;

public class CarParkLogicTest {
    private static final int CAR_PARK_SIZE = 10;
    private CarParkLogic logic = new CarParkLogic();
    private static List<String> carModels = new LinkedList();
    private static CarPark park = new CarPark();

    @BeforeClass
    public static void toDoBeforeAllTests() {
        park.addCar(new Car(1, 100, "ABT"));
        park.addCar(new Car(2, 100, "AC Schnitzer"));
        park.addCar(new Car(3, 100, "Acura"));
        park.addCar(new Car(4, 100, "Alfa Romeo"));
        park.addCar(new Car(5, 100, "Alpina"));
        park.addCar(new Car(6, 100, "Alpine"));
        park.addCar(new Car(7, 100, "Apex"));
        park.addCar(new Car(8, 100, "Arrinera"));

        carModels.add("ABT");
        carModels.add("AC Schnitzer");
        carModels.add("Acura");
        carModels.add("Alfa Romeo");
        carModels.add("Alpina");
        carModels.add("Alpine");
        carModels.add("Apex");
        carModels.add("Arrinera");
    }

    @Test
    public void testFillCarParkRandom() {
        CarPark park = new CarPark();
        logic.fillCarParkRandom(park, carModels, CAR_PARK_SIZE);

        List<Car> cars = park.getCars();
        int parkSize = cars.size();

        Assert.assertEquals(CAR_PARK_SIZE, parkSize);
    }

    @Test
    public void testCountCarParkPrice() {
        int expected = 800;
        int actual = (int)logic.countCarParkPrice(park);

        Assert.assertEquals(expected, actual);
    }

}

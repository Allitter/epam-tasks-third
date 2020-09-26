package com.epam.tasks.third.domain.models;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarParkTest {
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
    }

    @Test
    public void testFindByIdWithCorrectId() throws CarNotExistsException, IncorrectArgumentException {
        Car actual = park.findCarById(3);
        Car expected = new Car(3, 100, "Acura");

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IncorrectArgumentException.class)
    public void testFindByIdWithIncorrectId() throws CarNotExistsException, IncorrectArgumentException {
        park.findCarById(-1);
    }

    @Test(expected = CarNotExistsException.class)
    public void testRemove() throws CarNotExistsException, IncorrectArgumentException {
        park.removeCar(3);
        park.findCarById(3);
    }
}

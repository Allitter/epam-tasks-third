package com.epam.tasks.third.logic.models;

import java.util.LinkedList;
import java.util.List;

public class CarPark {
    private List<Car> cars = new LinkedList<>();

    public CarPark() {
    }

    public List<Car> getCars() {
        return new LinkedList<>(cars);
    }

    public Car findCarById(int id) throws CarNotExistsException, IncorrectArgumentException {
        if (id < 0) {
            throw new IncorrectArgumentException();
        }

        Car result;
        int i = 0;

        while (i < cars.size()) {
            result = cars.get(i);
            i++;

            if (result.getId() == id) {
                return result;
            }
        }

        throw new CarNotExistsException();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCars(Car...cars) {
        for (Car car : cars) {
            addCar(car);
        }
    }

    public void removeCar(int id) {
        try {
            Car toRemove = findCarById(id);
            cars.remove(toRemove);
        } catch (Exception e) { }
    }
}

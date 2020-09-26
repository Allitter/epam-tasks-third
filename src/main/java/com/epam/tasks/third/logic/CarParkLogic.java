package com.epam.tasks.third.logic;

import com.epam.tasks.third.logic.models.Car;
import com.epam.tasks.third.logic.models.CarPark;
import java.util.List;
import java.util.Random;

public class CarParkLogic {
    private static final int MIN_CAR_PRICE = 10000;
    private static final int CAR_PRICE_RANGE = 20000;
    private Random random = new Random();

    public void fillCarParkRandom(CarPark carPark, List<String> carModels, int amount) {
        Car car;
        String carModel;
        int price;
        int modelNumber;

        for (int i = 0; i < amount; i++) {
            modelNumber = random.nextInt(carModels.size());
            carModel = carModels.get(modelNumber);
            price = random.nextInt(CAR_PRICE_RANGE) + MIN_CAR_PRICE;

            car = new Car(i, price, carModel);

            carPark.addCar(car);
        }
    }

    public long countCarParkPrice(CarPark carPark) {
        long totalPrice = 0;
        long carPrice;

        for (Car car : carPark.getCars()) {
            carPrice = car.getPrice();
            totalPrice += carPrice;
        }

        return totalPrice;
    }

}

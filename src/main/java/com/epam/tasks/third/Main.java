package com.epam.tasks.third;

//TODO Создать класс автомобиль. Создать автопарк организации.
// Посчитать стоимость автопарка.

import com.epam.tasks.third.data.FileInputService;
import com.epam.tasks.third.data.InputService;
import com.epam.tasks.third.domain.CarParkLogic;
import com.epam.tasks.third.domain.models.CarPark;
import com.epam.tasks.third.view.ConsoleResultPrinter;
import com.epam.tasks.third.view.ResultPrinter;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static final int CARS_AMOUNT = 100;
    public static final String CAR_MODELS_PATH = "src/main/resources/Car_Models.txt";

    public static void main(String[] args) throws IOException {
        List<String> carModels;
        try (InputService input = new FileInputService(new File(CAR_MODELS_PATH))) {
            carModels = input.readAllLines();
        }

        CarPark park = new CarPark();
        CarParkLogic parkLogic = new CarParkLogic();
        parkLogic.fillCarParkRandom(park, carModels, CARS_AMOUNT);
        long carParkPrice = parkLogic.countCarParkPrice(park);

        ResultPrinter printer = new ConsoleResultPrinter();
        printer.print(carParkPrice, "Car park price");
    }

}

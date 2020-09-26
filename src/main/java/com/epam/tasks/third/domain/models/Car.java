package com.epam.tasks.third.domain.models;

import java.util.Objects;

public class Car {
    private int id;
    private int price;
    private String carModel;

    public Car(int id, String carModel) {
        this.id = id;
        this.carModel = carModel;
    }

    public Car(int id, int price, String carModel) {
        this.id = id;
        this.price = price;
        this.carModel = carModel;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                carModel.equals(car.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, carModel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}

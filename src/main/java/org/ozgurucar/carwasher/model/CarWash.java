package org.ozgurucar.carwasher.model;

import java.util.Date;
import java.util.Objects;

public class CarWash {
    private int id;
    private Driver driver;
    private Car car;
    private int price;
    private Date date;

    public CarWash() {

    }

    public CarWash(int id, Driver driver, Car car, int price, Date date) {
        this.id = id;
        this.driver = driver;
        this.car = car;
        this.price = price;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarWash carWash = (CarWash) o;
        return id == carWash.id && price == carWash.price && Objects.equals(driver, carWash.driver) && Objects.equals(car, carWash.car) && Objects.equals(date, carWash.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, driver, car, price, date);
    }

    @Override
    public String toString() {
        return "CarWash{" +
                "id=" + id +
                ", driver=" + driver +
                ", car=" + car +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

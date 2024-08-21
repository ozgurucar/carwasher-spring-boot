package org.ozgurucar.carwasher.web;

import org.ozgurucar.carwasher.model.Car;
import org.ozgurucar.carwasher.model.Driver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/carWasherController")
public class CarWasherController {

    @RequestMapping("/cars")
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<Car>();
        Driver driver1 = new Driver(1, "WALTER", "WHITE", "PHONEWALTER", "ADDRESSWALTER");
        Driver driver2 = new Driver(2, "PAUL", "WALKER", "PHONEPAUL", "ADRESSPAUL");
        Driver driver3 = new Driver(3, "RAUL", "GIMENEZ", "PHONEGIMENEZ", "ADRESSGIMENEZ");

        Car car1 = new Car(1, "BMW", "RED", driver1, 2020);
        Car car2 = new Car(2, "AUDI", "WHITE", driver2, 2013);
        Car car3 = new Car(3, "MERCEDES", "BLACK", driver1, 2024);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        return cars;

    }
}

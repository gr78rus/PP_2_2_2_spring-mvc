package web.dao;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarDaoImpl implements CarDao{

    List<Car> carList = Arrays.asList(
            new Car("Opel", "Astra", 2008),
            new Car("Ford", "Focus", 2006),
            new Car("Kia", "Optima", 2016),
            new Car("Nissan", "Note", 2008),
            new Car("Skoda", "Rapid", 2020));

    @Override
    public List<Car> listCar(int count) {
        if (count >= 5) {
            return carList;
        } else if (count >= 0) {
            return carList.subList(0, count);
        } else {
            return null;
        }
    }
}
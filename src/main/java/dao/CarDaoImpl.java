package dao;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    private static List<Car> cars;

    static {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla x", "123", 2012));
        cars.add(new Car("Tesla y", "456", 2014));
        cars.add(new Car("Tesla z", "789", 2015));
        cars.add(new Car("cybertruck", "1", 2022));
        cars.add(new Car("Tesla s", "1011", 2016));
    }

    @Override
    public List<Car> getCarList() {
        return cars;
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count < 5) {
            List<Car> result = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                result.add(cars.get(i));
            }
            return result;
        } else {
            return cars;
        }
    }
}

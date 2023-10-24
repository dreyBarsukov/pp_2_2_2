package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
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
    public List<Car> getCarList(Integer count) {
        return cars.stream().limit(count).toList();
    }
}

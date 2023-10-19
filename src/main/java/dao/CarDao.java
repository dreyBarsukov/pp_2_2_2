package dao;

import model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getCarList();
    List<Car> getCarList(int count);
}

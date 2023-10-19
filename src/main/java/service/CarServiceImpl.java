package service;

import dao.CarDao;
import dao.CarDaoImpl;
import model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    private CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCarList() {
        return carDao.getCarList();
    }

    @Override
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }
}

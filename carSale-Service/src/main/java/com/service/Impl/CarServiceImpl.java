package com.service.Impl;

import com.common.Assist;
import com.dao.CarMapper;
import com.entity.Car;
import com.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarMapper carDao;
    @Override
    public long getCarRowCount(Assist assist){
        return carDao.getCarRowCount(assist);
    }
    @Override
    public List<Car> selectCar(Assist assist){
        return carDao.selectCar(assist);
    }
    @Override
    public Car selectCarByObj(Car obj){
        return carDao.selectCarByObj(obj);
    }
    @Override
    public Car selectCarById(Integer id){
        return carDao.selectCarById(id);
    }
    @Override
    public int insertCar(Car value){
        return carDao.insertCar(value);
    }
    @Override
    public int insertNonEmptyCar(Car value){
        return carDao.insertNonEmptyCar(value);
    }
    @Override
    public int insertCarByBatch(List<Car> value){
        return carDao.insertCarByBatch(value);
    }
    @Override
    public int deleteCarById(Integer id){
        return carDao.deleteCarById(id);
    }
    @Override
    public int deleteCar(Assist assist){
        return carDao.deleteCar(assist);
    }
    @Override
    public int updateCarById(Car enti){
        return carDao.updateCarById(enti);
    }
    @Override
    public int updateCar(Car value, Assist assist){
        return carDao.updateCar(value,assist);
    }
    @Override
    public int updateNonEmptyCarById(Car enti){
        return carDao.updateNonEmptyCarById(enti);
    }
    @Override
    public int updateNonEmptyCar(Car value, Assist assist){
        return carDao.updateNonEmptyCar(value,assist);
    }

    public CarMapper getCarDao() {
        return this.carDao;
    }

    public void setCarDao(CarMapper carDao) {
        this.carDao = carDao;
    }

}
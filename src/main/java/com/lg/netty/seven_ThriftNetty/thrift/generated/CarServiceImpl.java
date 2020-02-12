package com.lg.netty.seven_ThriftNetty.thrift.generated;

import org.apache.thrift.TException;

/**
 * @author liugou  2020/2/12 15:39
 * @version 1.0
 */
public class CarServiceImpl implements  CarService.Iface {
    @Override
    public Car getCar(String name) throws DException, TException {
        System.out.println("gor : " + name);

        final Car car = new Car();
        car.setMarried(true);
        car.setMileage(3);
        car.setName("2344");
        return car;
    }

    @Override
    public void saveCar(Car car) throws DException, TException {
        System.out.println(car.getMileage());
        System.out.println(car.getName());
    }
}

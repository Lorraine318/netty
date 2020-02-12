package com.lg.netty.seven_ThriftNetty;

import com.lg.netty.seven_ThriftNetty.thrift.generated.Car;
import com.lg.netty.seven_ThriftNetty.thrift.generated.CarService;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * @author liugou  2020/2/12 16:18
 * @version 1.0
 */
public class ThriftClient {


    public static void main(String[] args) {

        TTransport transport = new TFramedTransport(new TSocket("localhost",9999),600);
        TProtocol protocol =  new TCompactProtocol(transport);

         CarService.Client client = new CarService.Client(protocol);

        try{
            transport.open();
            Car car = client.getCar("张三");

            System.out.println(car.getName());
            System.out.println(car.getMileage());

            System.out.println("--------------");

            final Car car1 = new Car();
            car1.setName("lisi");
            car1.setMileage(12312);

            client.saveCar(car1);

        }catch (Exception ex){
            throw  new RuntimeException(ex.getMessage(),ex);
        }finally {
            transport.close();
        }
    }
}

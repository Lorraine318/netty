namespace java com.lg.netty.seven_ThriftNetty.thrift.generated

typedef i16 short
typedef i32 int
typedef i64 long
typedef string String
typedef bool boolean


//thrift --gen java -out D:\ideaWorkspace\netty_lecture\src\main\java Car.thrift
struct Car{
    1:optional String name;
    2:optional int mileage,
    3:optional boolean married
}


exception DException{
        1:optional String message;
        2:optional String callBack;
        3:optional String date
}

service CarService{

    Car getCar(1:required String name) throws (1: DException de)

    void saveCar(1:required Car car) throws (1: DException de)
}
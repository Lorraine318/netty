namespace java thrift.generated #命令空间

typedef i16 short //定义别称
typedef i32 int
typedef i64 long
typedef string String
typedef bool boolean

//使用：
// thrift --gen java D:\ideaWorkspace\netty_lecture\src\main\java\com\lg\thrift\Data.thrift
//就会在项目下gen-java目录下生成对应的包和对应的类。
struct Person{
    1:optional String username, //可以逗号分隔
    2:optional int age; //可以分号分隔
    3:optional boolean married
}

//自定义异常
exception DataException{
    1:optional String message;
    2:optional String callStack;
    3:optional String date
}

//相当于接口
service PersonService{

    //required 必选
    //代参，可能抛自定义异常
    Person getPersonByUsername(1:required String username) throws (1:DataException dataexception),

    void savePerson(1:required Person person) throws (1:DataException dataexception)
}
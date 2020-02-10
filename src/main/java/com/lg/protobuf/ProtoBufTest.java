package com.lg.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @author liugou  2020/2/7 5:23
 * @version 1.0
 *
 *      将protobuf转换成字节数组，将字节数组在其他服务器间传递，在别的服务器端也可以调用该对象。
 */
public class ProtoBufTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {

        final DataInfo.Student build = DataInfo.Student.newBuilder().setId(1).setName("zhangsan").setAddress("北京").build();
        final byte[] bytes = build.toByteArray();
        final DataInfo.Student student = DataInfo.Student.parseFrom(bytes);
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getAddress());
    }
}

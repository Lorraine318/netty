package com.lg.netty.six_ProtobufNetty2;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandlerInvoker;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;

import java.util.Random;

/**
 * @author liugou  2020/2/10 17:27
 * @version 1.0
 */
public class ProtobufClientHandler2 extends SimpleChannelInboundHandler<MyMessage.Message> {
    @Override
    protected void messageReceived(ChannelHandlerContext ctx, MyMessage.Message msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        final int i = new Random().nextInt(3);
        System.out.println(i);
        MyMessage.Message  message = null ;
        if (0 == i) {
                message = MyMessage.Message.newBuilder().setDataType(MyMessage.Message.DataType.PresonType).setPerson(MyMessage.Person.newBuilder().setCity("北京").setName("lg").build()).build();
        } else if (1 == i) {
            message = MyMessage.Message.newBuilder().setDataType(MyMessage.Message.DataType.DogTyPe).setDog(MyMessage.Dog.newBuilder().setDogName("北京").setDogAge(3).build()).build();
        } else {
            message = MyMessage.Message.newBuilder().setDataType(MyMessage.Message.DataType.CatType).setCat(MyMessage.Cat.newBuilder().setName("北京").setAge(3).build()).build();
        }

        ctx.writeAndFlush(message);
    }
}

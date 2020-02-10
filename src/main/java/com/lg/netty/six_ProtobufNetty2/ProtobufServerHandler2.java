package com.lg.netty.six_ProtobufNetty2;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandlerInvoker;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;

/**
 * @author liugou  2020/2/10 17:02
 * @version 1.0
 */
public class ProtobufServerHandler2 extends SimpleChannelInboundHandler<MyMessage.Message> {
    @Override
    protected void messageReceived(ChannelHandlerContext ctx, MyMessage.Message msg) throws Exception {
        if (msg.getDataType() == MyMessage.Message.DataType.PresonType) {
            System.out.println(msg.getPerson());
        } else if (msg.getDataType() == MyMessage.Message.DataType.DogTyPe) {
            System.out.println(msg.getDog());
        } else if (msg.getDataType() == MyMessage.Message.DataType.CatType) {
            System.out.println(msg.getCat());
        }
    }
}

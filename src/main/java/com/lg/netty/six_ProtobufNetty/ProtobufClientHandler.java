package com.lg.netty.six_ProtobufNetty;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandlerInvoker;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;

import java.beans.SimpleBeanInfo;

/**
 * @author liugou  2020/2/10 14:40
 * @version 1.0
 */
public class ProtobufClientHandler extends SimpleChannelInboundHandler<DataPersonInfo.Person> {
    @Override
    protected void messageReceived(ChannelHandlerContext ctx, DataPersonInfo.Person msg) throws Exception {

    }


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        final DataPersonInfo.Person liugou = DataPersonInfo.Person.newBuilder().setAddress("127.0.0.1").setId(2).setName("liugou").build();
        ctx.writeAndFlush(liugou);
    }
}

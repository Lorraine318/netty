package com.lg.netty.six_ProtobufNetty;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandlerInvoker;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;

/**
 * @author liugou  2020/2/10 12:56
 * @version 1.0
 */
public class ProtobufServerHandler extends SimpleChannelInboundHandler<DataPersonInfo.Person> {
    @Override
    protected void messageReceived(ChannelHandlerContext ctx, DataPersonInfo.Person msg) throws Exception {

        System.out.println(msg.getAddress());
        System.out.println(msg.getId());
        System.out.println(msg.getName());
        System.out.println(msg);
    }


}

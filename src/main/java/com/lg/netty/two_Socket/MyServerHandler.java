package com.lg.netty.two_Socket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.UUID;

/**
 * @author liugou  2020/2/3 19:27
 * @version 1.0
 */
public class MyServerHandler extends SimpleChannelInboundHandler<String> {

    //ChannelHandlerContext 上下文对象，可以获取远程连接地址也就是客户端的地址，连接对象等等
    //msg: 接收到的请求数据
    @Override
    protected void messageReceived(ChannelHandlerContext ctx, String msg) throws Exception {

        System.out.println(ctx.channel().remoteAddress() + ", " + msg);

        ctx.writeAndFlush("from : server ： " + UUID.randomUUID());
    }

    //当出现异常时会进入该方法
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();

    }
}

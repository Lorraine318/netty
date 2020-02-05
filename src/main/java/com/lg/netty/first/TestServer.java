package com.lg.netty.first;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author liugou  2020/2/2 17:43
 * @version 1.0
 */
public class TestServer {

    public static void main(String[] args) throws InterruptedException {

        //两个线程组
        EventLoopGroup bossGroup = new NioEventLoopGroup(); //接收连接请求，将连接让workerGroup进行处理工作
        EventLoopGroup workerGroup = new NioEventLoopGroup();//进行连接处理

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)//通道
                    .childHandler(new TestServerInitializer()) // 服务端子处理器
            ;
            final ChannelFuture channelFuture = serverBootstrap.bind(8899).sync();//sync表示同步阻塞等待
            channelFuture.channel().closeFuture().sync();
        } finally {
                bossGroup.shutdownGracefully();
                workerGroup.shutdownGracefully();
        }


    }

}

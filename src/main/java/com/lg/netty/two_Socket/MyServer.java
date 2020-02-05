package com.lg.netty.two_Socket;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author liugou  2020/2/3 19:07
 * @version 1.0
 */
public class MyServer {

//服务端的  childerHandler 与   handler
    public static void main(String[] args) throws InterruptedException {

        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class)
                    .childHandler(new MyServerInitializer());
                    /*
                    * server端也可以添加   serverBootSTRAP.handler() ，和 .childHandler的区别是什么呢
                    *
                    * .handler是针对于只收集连接工作的bossGroup的发挥作用的，
                    * 而childHandler是只针对于bossGroup将连接请求丢给workerGroup处理的workerGroup来发挥作用的。
                    * 所以server都是.childHandler 而客户端只需要一个线程组group,所以只用handler就可以
                    * */

            final ChannelFuture channelFuture = serverBootstrap.bind("localhost",8880).sync();
            channelFuture.channel().closeFuture().sync();

        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }


    }
}

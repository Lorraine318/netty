package com.lg.netty.four_heartbeat;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author liugou  2020/2/5 17:52
 * @version 1.0
 */
public class MyHeartBeatClient {

    public static void main(String[] args) throws InterruptedException, IOException {

        final NioEventLoopGroup group = new NioEventLoopGroup();

        try{
            final Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group).channel(NioSocketChannel.class).handler(new MyHeartBeatClientInitalizer());

            final Channel channel = bootstrap.connect("localhost", 8888).sync().channel();

            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            for(;;){
                channel.writeAndFlush(bufferedReader.readLine() + "\r\n");
            }

        }finally {
            group.shutdownGracefully();
        }
    }
}

package com.lg.netty.three_Chat;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author liugou  2020/2/5 13:18
 * @version 1.0
 */
public class MyChatClient {

    public static void main(String[] args) throws InterruptedException, IOException {

        EventLoopGroup group = new NioEventLoopGroup();

        try {

            final Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group).channel(NioSocketChannel.class).handler(new MyChatClientInitalizer());
            final Channel channel = bootstrap.connect("localhost", 8888).sync().channel();

            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            for (; ; ) {
                channel.writeAndFlush(bufferedReader.readLine() + "\r\n");
            }
        } finally {
            group.shutdownGracefully();
        }

    }

}

package com.lg.netty.six_ProtobufNetty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * @author liugou  2020/2/10 13:00
 * @version 1.0
 */
public class ProtoBufClient {

    public static void main(String[] args) throws Exception {

        final EventLoopGroup group = new NioEventLoopGroup();


        try {

            final Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .handler(new ProtobufClientInitializer());

            final ChannelFuture channelFuture = bootstrap.connect("localhost", 8899).sync();

            channelFuture.channel().closeFuture().sync();

        }finally {
            group.close();
        }
    }

}

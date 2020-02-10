package com.lg.netty.six_ProtobufNetty2;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author liugou  2020/2/10 17:03
 * @version 1.0
 */
public class ProtoBufClient2 {


    public static void main(String[] args) throws InterruptedException {


        final EventLoopGroup group = new NioEventLoopGroup();

        try {

            final Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ProtoBufClientInitializer2());

            final ChannelFuture channelFuture = bootstrap.connect("localhost",8899).sync();
                channelFuture.channel().closeFuture().sync();

        }finally {
            group.shutdownGracefully();
        }
    }
}

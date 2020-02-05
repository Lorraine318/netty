package com.lg.netty.four_heartbeat;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * @author liugou  2020/2/5 18:01
 * @version 1.0
 */
public class MyHeartBeatServerInitalizer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {

        final ChannelPipeline pipeline = ch.pipeline();
        //心跳handler   读  写   读或者写 如果超出，触发自定义里面的事件
        pipeline.addLast(new IdleStateHandler(5,7,10,TimeUnit.SECONDS));
        pipeline.addLast(new MyHeartBeatServerHandler());
    }
}

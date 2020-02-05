package com.lg.netty.two_Socket;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;


/**
 * @author liugou  2020/2/3 19:57
 * @version 1.0
 */
public class MyClientInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {

        ChannelPipeline channelPipeline = ch.pipeline();
        channelPipeline.addLast(new LengthFieldBasedFrameDecoder(   //解码器
                Integer.MAX_VALUE,
                0,
                4,
                0,
                4));
        channelPipeline.addLast("LengthFieldPrepender", //只是一个名字，可加可不加
                new LengthFieldPrepender(4));//编码器

        channelPipeline.addLast(new StringDecoder(CharsetUtil.UTF_8));//编码
        channelPipeline.addLast(new StringEncoder(CharsetUtil.UTF_8));//解码
        channelPipeline.addLast(new MyClientHandler());


    }
}

package com.lg.netty.first;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * @author liugou  2020/2/2 17:54
 * @version 1.0
 */
public class TestServerInitializer extends ChannelInitializer<SocketChannel> {


    //一旦连接被注册之后就会被调用 初始化channel  回调方法
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline channelPipeline = ch.pipeline();//管道中可以有很多拦截器（channelHandler）

        channelPipeline.addLast("httpServerCodec",new HttpServerCodec());   //对响应请求进行编解码用的
        channelPipeline.addLast("testHttpServerHandler",new TestHttpServerHandler());
    }
}

package com.lg.netty.five_websocket;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * @author liugou  2020/2/5 19:32
 * @version 1.0
 */
public class MyWebSocketServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {

        ChannelPipeline pipeline = ch.pipeline();

        //   httphandler
        pipeline.addLast("", new HttpServerCodec());
        //   httphandler     netty会将请求进行分段，每段都会调用handler
        pipeline.addLast(new ChunkedWriteHandler());
        //   httphandler    会将所有的段聚合成完整的一段。
        pipeline.addLast(new HttpObjectAggregator(8192));


        // websocketHandler   指定的路径表示： ws://server:port/wss
        pipeline.addLast(new WebSocketServerProtocolHandler("/wss"));


        pipeline.addLast(new MyTextWebSocketFrameServerHandler());
    }
}

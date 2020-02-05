package com.lg.netty.four_heartbeat;

import io.netty.channel.*;
import io.netty.util.concurrent.EventExecutorGroup;

/**
 * @author liugou  2020/2/5 17:55
 * @version 1.0
 */
public class MyHeartBeatClientHandler extends SimpleChannelInboundHandler<String> {

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println(msg);
    }
}

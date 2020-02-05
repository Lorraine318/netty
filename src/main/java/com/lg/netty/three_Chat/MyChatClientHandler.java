package com.lg.netty.three_Chat;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author liugou  2020/2/5 14:05
 * @version 1.0
 */
public class MyChatClientHandler extends SimpleChannelInboundHandler<String> {
    @Override
    protected void messageReceived(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println(msg);
    }
}

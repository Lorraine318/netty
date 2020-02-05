package com.lg.netty.four_heartbeat;

import io.netty.channel.*;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.concurrent.EventExecutorGroup;

/**
 * @author liugou  2020/2/5 18:01
 * @version 1.0
 */
public class MyHeartBeatServerHandler extends ChannelInboundHandlerAdapter {


    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            final IdleStateEvent evt1 = (IdleStateEvent) evt;

            switch (evt1.state()) {
                case READER_IDLE:
                    System.out.println("读超时空闲");
                    break;
                case WRITER_IDLE:
                    System.out.println("写超时空闲");
                    break;
                case ALL_IDLE:
                    System.out.println("读或者写  超时空闲");
                    break;
                default:
                    break;
            }
            System.out.println(ctx.channel().remoteAddress() + "超时事件： " + evt1.state());
            ctx.channel().close();
        }
    }
}

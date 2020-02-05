package com.lg.netty.three_Chat;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @author liugou  2020/2/5 11:06
 * @version 1.0
 */
public class MyChatServerHandler extends SimpleChannelInboundHandler<String> {

    //保存每个channel对象   当有channel断开之后，会自动从channelGroup中移除出去。
    private static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, String msg) throws Exception {
        final Channel channel = ctx.channel();

        channelGroup.forEach(ch->{
            if(ch != channel){
                ch.writeAndFlush(channel.remoteAddress() + "  发送的消息 : " + msg  +"\n");
            }else{
                ch.writeAndFlush("【自己： 】 " + msg + "\n");
            }
        });
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        final Channel channel = ctx.channel(); //每次建立连接都会有channel对象，服务端如果想向多个客户端发送数据，必须保存所有的channel
        channelGroup.writeAndFlush("【服务器】 -" + channel.remoteAddress() + "加入\n");//channelGroup会遍历所有的channel并发送数据。
        channelGroup.add(channel);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {

        final Channel channel = ctx.channel();
        channelGroup.writeAndFlush("【服务器】 -" + channel.remoteAddress() + "断开\n");
    }


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println(ctx.channel().remoteAddress() + "上线");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println(ctx.channel().remoteAddress() + "下线");
    }
}

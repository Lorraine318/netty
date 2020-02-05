package com.lg.netty.first;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.*;
import io.netty.util.CharsetUtil;

/**
 * @author liugou  2020/2/2 17:59
 * @version 1.0
 */

//定义自己的channelHandler， 自己的处理器
public class TestHttpServerHandler extends SimpleChannelInboundHandler<HttpObject> {


    //服务器读取客户端发过来的请求，并且向客户端响应
    @Override
    protected void messageReceived(ChannelHandlerContext ctx, HttpObject msg) throws Exception {

        System.out.println(msg.getClass());
        System.out.println(ctx.channel().remoteAddress());//获取远程地址

        if (msg instanceof HttpRequest) { //如果是一个http的请求的话

            System.out.println("执行 messageReceived");

            HttpRequest httpRequest = (HttpRequest) msg;

            System.out.println("请求方法名： " + httpRequest.method().name());

            if ("/favicon.ico".equals(httpRequest.uri())) {
                System.out.println("请求favicon.ico");        //默认所有请求都会请求该网址的图标，也就是这个favicon.ico
                return;
            }
            //我们要响应的数据
            ByteBuf content = Unpooled.copiedBuffer("Hello word", CharsetUtil.UTF_8);
            //netty 专门支持响应的一个对象，FullHttpResponse
            FullHttpResponse response = new DefaultFullHttpResponse(
                    HttpVersion.HTTP_1_1,
                    HttpResponseStatus.OK,
                    content);

            //设置响应头内容
            response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/plain");
            response.headers().set(HttpHeaderNames.CONTENT_LENGTH, String.valueOf(content.readableBytes()));

            //进行响应，写回到客户端
            ctx.writeAndFlush(response);
           // ctx.channel().close();  //响应完关闭此请求 。
        }

    }


    //连接活跃时调用得方法
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channel active");
        super.channelActive(ctx);
    }

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channel registered");
        super.channelRegistered(ctx);
    }

    //添加连接
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        System.out.println("add handler");
        super.handlerAdded(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channel inactive");
        super.channelInactive(ctx);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channel unregister   ");
        super.channelUnregistered(ctx);
    }

    //断开连接
    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        System.out.println("channel removed");
        super.handlerRemoved(ctx);
    }
}

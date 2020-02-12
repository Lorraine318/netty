package com.lg.netty.seven_ThriftNetty;

import com.lg.netty.seven_ThriftNetty.thrift.generated.CarService;
import com.lg.netty.seven_ThriftNetty.thrift.generated.CarServiceImpl;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.transport.TFastFramedTransport;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportException;

import java.net.InetSocketAddress;

/**
 * @author liugou  2020/2/12 15:05
 * @version 1.0
 */
public class ThriftServer {

    public static void main(String[] args) throws InterruptedException, TTransportException {

        //非阻塞的 异步的
        TNonblockingServerSocket socket = new TNonblockingServerSocket(new InetSocketAddress("localhost",9999));
        THsHaServer.Args arg = new THsHaServer.Args(socket).minWorkerThreads(2).maxWorkerThreads(4);
        CarService.Processor<CarServiceImpl> processor = new CarService.Processor<>(new CarServiceImpl());

        //协议工厂
        arg.protocolFactory(new TCompactProtocol.Factory());
        arg.transportFactory(new TFramedTransport.Factory());
        arg.processorFactory(new TProcessorFactory(processor));

        //高可用的一个server
        THsHaServer server = new THsHaServer(arg);

        System.out.println("thrift server started..");

        server.serve();
    }
}

package nia.chapter4;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * Listing 4.4 Asynchronous networking with Netty
 *
 * @author <a href="mailto:norman.maurer@gmail.com">Norman Maurer</a>
 */
public class NettyNioServer {
    public void server(int port) throws Exception {
        final ByteBuf buf =
                Unpooled.unreleasableBuffer(Unpooled.copiedBuffer("Hi!\r\n",
                        Charset.forName("UTF-8")));
        // Uses NioEventLoopGroup for non-blocking mode
        NioEventLoopGroup group = new NioEventLoopGroup();
        try {
            // Creates ServerBootstrap
            ServerBootstrap b = new ServerBootstrap();
            b.group(group).channel(NioServerSocketChannel.class)
                    .localAddress(new InetSocketAddress(port))
                    // Specifies ChannelInitializer to be called for each accepted connection
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                                      @Override
                                      public void initChannel(SocketChannel ch) throws Exception {
                                          ch.pipeline().addLast(
                                                  // Adds ChannelInboundHandlerAdapter to receive events and process them
                                                  new ChannelInboundHandlerAdapter() {
                                                      @Override
                                                      public void channelActive(
                                                              ChannelHandlerContext ctx) throws Exception {
                                                          // Writes message to client
                                                          ctx.writeAndFlush(buf.duplicate())
                                                                  // close the connection once the message is written
                                                                  .addListener(ChannelFutureListener.CLOSE);
                                                      }
                                                  });
                                      }
                                  }
                    );
            // Binds server to accept connections
            ChannelFuture f = b.bind().sync();
            f.channel().closeFuture().sync();
        } finally {
            // Releases all resources
            group.shutdownGracefully().sync();
        }
    }
}


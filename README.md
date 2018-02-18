This Repository contains the source-code for all chapters of the book [Netty in Action](http://manning.com/maurer)
by Norman Maurer and Marvin Allen Wolfthal.

Latest version: https://github.com/normanmaurer/netty-in-action/tree/2.0-SNAPSHOT

Enjoy! Feedback and PR's welcome!


Prerequisites

	JDK 1.7.0u71 or better

	Maven 3.3.9 or better


If you want to build everything at once, from the top directory run

	mvn install


If you want to build only single projects then from the top directory first run

	mvn install -pl utils


This will make the utils jar available to all the projects.

---

[《netty in action》笔记](https://github.com/mindawei/netty-in-action/wiki)

# [01 Netty — asynchronous and event-driven](https://mindawei.github.io/2018/02/08/%E3%80%8ANetty-in-Action%E3%80%8B%E7%AC%94%E8%AE%B0%EF%BC%881%EF%BC%89/)
This chapter covers
* Networking in Java
* Introducing Netty
* Netty's core components

# [02 Your first Netty application](https://mindawei.github.io/2018/02/09/%E3%80%8ANetty-in-Action%E3%80%8B%E7%AC%94%E8%AE%B0%EF%BC%882%EF%BC%89/)
This chapter covers
* Setting up the development environment
* Writing an Echo server and client
* Building and testing the applications

# [03 Netty components and design](https://mindawei.github.io/2018/02/10/%E3%80%8ANetty-in-Action%E3%80%8B%E7%AC%94%E8%AE%B0%EF%BC%883%EF%BC%89/)
This chapter covers
* Technical and architectural aspects of Netty
* `Channel`, `EventLoop`, and `ChannelFuture`
* `ChannelHandler` and `ChannelPipeline`
* Bootstrapping

# [04 Transports](https://mindawei.github.io/2018/02/11/%E3%80%8ANetty-in-Action%E3%80%8B%E7%AC%94%E8%AE%B0%EF%BC%884%EF%BC%89/)
This chapter covers
* OIO—blocking transport
* NIO—asynchronous transport
* Local transport—asynchronous communications within a JVM
* Embedded transport—testing your `ChannelHandlers`

# [05 ByteBuf](https://mindawei.github.io/2018/02/12/%E3%80%8ANetty-in-Action%E3%80%8B%E7%AC%94%E8%AE%B0%EF%BC%885%EF%BC%89/)
This chapter covers
* `ByteBuf` — Netty’s data container
* API details
* Use cases
* Memory allocation

# [06 ChannelHandler and ChannelPipeline](https://mindawei.github.io/2018/02/14/%E3%80%8ANetty-in-Action%E3%80%8B%E7%AC%94%E8%AE%B0%EF%BC%886%EF%BC%89/)
This chapter covers
* The `ChannelHandler` and `ChannelPipeline` APIs
* Detecting resource leaks
* Exception handling

# [07 EventLoop and threading model](https://mindawei.github.io/2018/02/16/%E3%80%8ANetty-in-Action%E3%80%8B%E7%AC%94%E8%AE%B0%EF%BC%887%EF%BC%89/)
This chapter covers
* Threading model overview
* Event loop concept and implementation
* Task scheduling
* Implementation details

# [08 Bootstrapping](https://mindawei.github.io/2018/02/17/%E3%80%8ANetty-in-Action%E3%80%8B%E7%AC%94%E8%AE%B0%EF%BC%888%EF%BC%89/)
This chapter covers
* Bootstrapping clients and servers
* Bootstrapping clients from within a `Channel`
* Adding `ChannelHandlers`
* Using `ChannelOptions` and attributes

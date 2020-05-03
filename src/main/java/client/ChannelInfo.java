package client;

import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;

/**
 * Created by wephone on 18-1-8.
 * IP对应的channel类 用于一个IP映射的Map IPChannelMap
 * 存放一个IP对应的channel
 */
public class ChannelInfo {

    private EventLoopGroup group;
    private Channel channel;
    private long lastUpdateTime;        // 最后一次生命检测的时间

//    //保证多线程修改时引用计数正确
//    private AtomicInteger serviceQuoteNum=new AtomicInteger(0);//原子变量要赋初值

    public EventLoopGroup getGroup() {
        return group;
    }

    public void setGroup(EventLoopGroup group) {
        this.group = group;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

}

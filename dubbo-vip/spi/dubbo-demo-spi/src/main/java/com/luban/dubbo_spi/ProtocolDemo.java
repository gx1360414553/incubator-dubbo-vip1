package com.luban.dubbo_spi;

import com.luban.dubbo_spi.api.Car;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

import java.io.IOException;

/**
 * *************书山有路勤为径***************
 * 鲁班学院
 * 往期资料加木兰老师  QQ: 2746251334
 * VIP课程加安其拉老师 QQ: 3164703201
 * 讲师：周瑜老师
 * *************学海无涯苦作舟***************
 */
public class ProtocolDemo {

    public static void main(String[] args) {
        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);

        extensionLoader.getAdaptiveExtension();//获取代理类

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.luban.dubbo_spi;

import com.luban.dubbo_spi.api.Car;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * *************书山有路勤为径***************
 * 鲁班学院
 * 往期资料加木兰老师  QQ: 2746251334
 * VIP课程加安其拉老师 QQ: 3164703201
 * 讲师：周瑜老师
 * *************学海无涯苦作舟***************
 */
public class CarDemo {

    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader =
                ExtensionLoader.getExtensionLoader(Car.class);

//       //getAdaptiveExtension()  Adaptive类存在的意义就是在调用接口方法时，根据url参数去加载对应的实现类，这样不用提前加载
//    // 对于一个接口你可以手动实现一个Adaptive类，比如AdaptiveExtensionFactory，getAdaptiveExtension()获取的就是实现类上加了Adaptive注解的，只能有一个，否则报错
//    // 也可以有Dubbo默认给我们实现，也就是创建一个代理类，在实现的时候会根据接口中的方法是否含有Adaptive注解，有注解的方法才会代理，没有注解的方法则不会代理，并且使用代理类调用的时候会抛异常
//      Car adaptiveExtension = ExtensionLoader.getExtensionLoader(Car.class).getAdaptiveExtension();


        Car redCar = extensionLoader.getExtension("red");
        redCar.getColor();
//        Car benz = extensionLoader.getExtension("benz");
//
//
//        Map<String, String> map = new HashMap<>();
//        map.put("car", "black");
//        URL url = new URL("","",1, map);
//
//        benz.getColorForUrl(url);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

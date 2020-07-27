package com.luban.dubbo_spi.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * *************书山有路勤为径***************
 * 鲁班学院
 * 往期资料加木兰老师  QQ: 2746251334
 * VIP课程加安其拉老师 QQ: 3164703201
 * 讲师：周瑜老师
 * *************学海无涯苦作舟***************
 */
@SPI
public interface Car {

    public void getColor();

    //    @Adaptive("car") 指定获取url中key为car对应值得实现类来执行getColorForUrl方法
    @Adaptive
    public void getColorForUrl(URL url);
}

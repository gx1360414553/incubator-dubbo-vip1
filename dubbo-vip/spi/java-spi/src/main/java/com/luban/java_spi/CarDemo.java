package com.luban.java_spi;

import com.luban.java_spi.api.CarInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

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
        ServiceLoader<CarInterface> serviceLoader = ServiceLoader.load(CarInterface.class);
        //需要遍历使用，不能指定获取某个实现类
        Iterator<CarInterface> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            CarInterface carInterface = iterator.next();
            carInterface.getColor();
        }
    }
}

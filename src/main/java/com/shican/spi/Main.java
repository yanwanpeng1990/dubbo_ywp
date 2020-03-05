package com.shican.spi;

import com.shican.spi.car.Car;
import com.shican.spi.car.impl.Father;
import com.shican.spi.loader.ShiCanExtensionLoader;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Map<String, Class<?>> bigCar = ShiCanExtensionLoader.getExtensionLoader(Car.class).getExtensionClasses();
        bigCar.entrySet().forEach(stringClassEntry -> {
            //可以进行路由了，这个就没有什么问题
            System.out.println(stringClassEntry.getValue().getGenericInterfaces()[0]);
        });
    }
}

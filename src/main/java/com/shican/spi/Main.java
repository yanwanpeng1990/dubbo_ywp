package com.shican.spi;

import com.shican.spi.interfaces.MadaptiveExt;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class Main {
    public static void main(String[] args) {
       /* Map<String, Class<?>> bigCar = ShiCanExtensionLoader.getExtensionLoader(Car.class).getExtensionClasses();
        bigCar.entrySet().forEach(stringClassEntry -> {
            //可以进行路由了，这个就没有什么问题
            System.out.println(stringClassEntry.getValue().getGenericInterfaces()[0]);

        });*/
        ExtensionLoader<MadaptiveExt> loader= ExtensionLoader.getExtensionLoader(MadaptiveExt
                .class);
        MadaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        System.out.println(adaptiveExtension.echo("d",URL.valueOf("test://localhost/test")));
    }
}

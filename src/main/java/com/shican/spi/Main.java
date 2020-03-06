package com.shican.spi;

import com.shican.spi.interfaces.MadaptiveExt;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class Main {
    static int x;
    public Main(int x){
        this.x = x;
    }
    //递归获取main
    public static Main getMain(){
        Main s  = new Main(x);
        if(x < 200){
            System.out.println(x);
            x++;
            s = getMain();
        }
        return s;
    }

    public static void main(String[] args) {
    /*    Map<String, Class<?>> bigCar = ShiCanExtensionLoader.getExtensionLoader(Car.class).getExtensionClasses();
        bigCar.entrySet().forEach(stringClassEntry -> {
            //可以进行路由了，这个就没有什么问题
            System.out.println(stringClassEntry.getValue().getGenericInterfaces()[0]);

        });*/
        ExtensionLoader<MadaptiveExt> loader= ExtensionLoader.getExtensionLoader(MadaptiveExt
                .class);
        MadaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("t//t?fuck=cloud");
        System.out.println(adaptiveExtension.echo("d",url));
        System.out.println();
        System.out.println(Main.getMain());
    }
}

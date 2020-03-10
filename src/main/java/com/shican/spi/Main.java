package com.shican.spi;

import com.shican.spi.interfaces.MadaptiveExt;
import javafx.application.Application;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

    public Integer getCount(){
        return x;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    /*    Map<String, Class<?>> bigCar = ShiCanExtensionLoader.getExtensionLoader(Car.class).getExtensionClasses();
        bigCar.entrySet().forEach(stringClassEntry -> {
            //可以进行路由了，这个就没有什么问题
            System.out.println(stringClassEntry.getValue().getGenericInterfaces()[0]);

        });*/

       /* ExtensionLoader<MadaptiveExt> loader= ExtensionLoader.getExtensionLoader(MadaptiveExt
                .class);
        MadaptiveExt adaptiveExtension = loader.getAdaptiveExtension();
        URL url = URL.valueOf("t//t?fuck=cloud");
        System.out.println(adaptiveExtension.echo("d",url));
        System.out.println();
        System.out.println(Main.getMain());
        Main s = new Main(1);
        Method[] methods = s.getClass().getMethods();
        for(Method method:methods){
            //System.out.println(method.getName());
            if(method.getReturnType()==void.class||method.getParameterCount()>0||!method.getName().contains("get")){
                continue;
            }
            //了解了,通过动态的字符串去走
            Object o = method.invoke(s);
            System.out.println(o);
        }
*/
    }
}

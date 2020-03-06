package com.shican.spi.interfaces;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("dubbo")
public interface MadaptiveExt {
    @Adaptive({"fuck"})
    String echo(String msg,URL url);
}

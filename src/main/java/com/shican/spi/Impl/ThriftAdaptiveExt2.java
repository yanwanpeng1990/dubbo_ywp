package com.shican.spi.Impl;

import com.shican.spi.interfaces.MadaptiveExt;
import org.apache.dubbo.common.URL;

public class ThriftAdaptiveExt2 implements MadaptiveExt {

    @Override
    public String echo(String msg, URL url) {
        return "Thrift";
    }
}
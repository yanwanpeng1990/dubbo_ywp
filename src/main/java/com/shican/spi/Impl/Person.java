package com.shican.spi.Impl;

public abstract class Person {
    public abstract  int findPerson();
    public int getX(){
        int x = findPerson();
        return x;
    }
}

package com.youngjin.designpattern.chapter06.A2.framework;

public interface Product {
    public abstract void use(String s);
    public abstract Product createCopy();
}

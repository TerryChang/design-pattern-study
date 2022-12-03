package com.youngjin.designpattern.chapter06.Sample.framework;

public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();
}

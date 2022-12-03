package com.youngjin.designpattern.chapter06.A1b.framework;

public abstract class ConcreteProduct implements Product {
    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}

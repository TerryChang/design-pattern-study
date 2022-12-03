package com.youngjin.designpattern.chapter08.Sample.factory;

public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}

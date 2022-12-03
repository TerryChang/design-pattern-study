package com.youngjin.designpattern.chapter13.A1;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}

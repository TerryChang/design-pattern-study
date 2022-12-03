package com.youngjin.designpattern.chapter13.Sample;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}

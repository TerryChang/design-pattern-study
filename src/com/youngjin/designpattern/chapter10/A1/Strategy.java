package com.youngjin.designpattern.chapter10.A1;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}

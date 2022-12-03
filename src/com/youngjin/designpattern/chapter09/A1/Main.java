package com.youngjin.designpattern.chapter09.A1;

public class Main {
    public static void main(String[] args) {
        RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello, Korea."));
        d.randomDisplay(10);
    }
}

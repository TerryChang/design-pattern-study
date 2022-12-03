package com.youngjin.designpattern.chapter09.A2;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay {
    private Random random = new Random();

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times));
    }
}

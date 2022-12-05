package com.youngjin.designpattern.chapter08.A2.divfactory;

import com.youngjin.designpattern.chapter08.A2.factory.Factory;
import com.youngjin.designpattern.chapter08.A2.factory.Link;
import com.youngjin.designpattern.chapter08.A2.factory.Page;
import com.youngjin.designpattern.chapter08.A2.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}

package com.youngjin.designpattern.chapter08.Sample.divfactory;

import com.youngjin.designpattern.chapter08.Sample.factory.Factory;
import com.youngjin.designpattern.chapter08.Sample.factory.Link;
import com.youngjin.designpattern.chapter08.Sample.factory.Page;
import com.youngjin.designpattern.chapter08.Sample.factory.Tray;

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

package com.youngjin.designpattern.chapter08.Sample.listfactory;

import com.youngjin.designpattern.chapter08.Sample.factory.Factory;
import com.youngjin.designpattern.chapter08.Sample.factory.Link;
import com.youngjin.designpattern.chapter08.Sample.factory.Page;
import com.youngjin.designpattern.chapter08.Sample.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}

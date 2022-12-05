package com.youngjin.designpattern.chapter08.Sample.listfactory;

import com.youngjin.designpattern.chapter08.Sample.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}

package io.github.tplxmx96.chapter11.printdemo;

import io.github.tplxmx96.chapter11.printdemo.iface.IPaper;

public class B5PaperImpl implements IPaper {
    @Override
    public String getSize() {
        return "B5";
    }
}

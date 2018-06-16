package io.github.tplxmx96.chapter11.printdemo.impl;

import io.github.tplxmx96.chapter11.printdemo.iface.IPaper;

public class A4PaperImpl implements IPaper {
    @Override
    public String getSize() {
        return "A4";
    }
}

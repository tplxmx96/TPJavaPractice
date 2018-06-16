package io.github.tplxmx96.chapter11.printdemo.impl;

import io.github.tplxmx96.chapter11.printdemo.iface.IInkBox;

public class ColorInkBoxImpl implements IInkBox {
    @Override
    public String getColor() {
        return "红色";
    }
}

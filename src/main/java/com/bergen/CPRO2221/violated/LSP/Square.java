package com.bergen.CPRO2221.violated.LSP;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

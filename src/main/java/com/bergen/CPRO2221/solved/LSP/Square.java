package com.bergen.CPRO2221.solved.LSP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }
}

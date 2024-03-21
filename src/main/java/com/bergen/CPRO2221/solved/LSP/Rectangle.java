package com.bergen.CPRO2221.solved.LSP;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
package com.bergen.CPRO2221.violated.LSP;

import lombok.*;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

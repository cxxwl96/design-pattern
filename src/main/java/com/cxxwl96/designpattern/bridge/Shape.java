

package com.cxxwl96.designpattern.bridge;

/**
 * 桥接模式
 */
public abstract class Shape {
    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}

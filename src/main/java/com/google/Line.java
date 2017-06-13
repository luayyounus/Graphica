package com.google;

/**
 * Created by luayghazwan on 6/12/17.
 */
public class Line extends Shape {
    private int width;
    private int height;

    public Line(int x, int y, int width, int height) {
        super(x, y);

        this.width = width;
        this.height = height;
    }
}
package com.google;
import java.awt.*;

/**
 * Created by luayghazwan on 6/12/17.
 */
public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);

        this.width = width;
        this.height = height;
    }
}
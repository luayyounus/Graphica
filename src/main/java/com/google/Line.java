package com.google;
import java.awt.*;

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

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(color);
        canvas.drawLine(x, y, x+width-1, y+height-1); // +++++
    }
}
package com.google;
import javax.swing.*;
import java.awt.*;

/**
 * Created by luayghazwan on 6/11/17.
 */

public class Paint {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Paint!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        InputPanel inputPanel = new InputPanel();
        PaintPanel paintPanel = new PaintPanel(inputPanel);

        frame.add(inputPanel, BorderLayout.WEST);
        frame.add(paintPanel, BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
    }
}

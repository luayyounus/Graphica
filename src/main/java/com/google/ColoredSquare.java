package com.google;
import javax.swing.*;
import java.awt.*;

/**
 * Created by luayghazwan on 6/13/17.
 */

public class ColoredSquare extends JComponent {
    private Color color;

    public ColoredSquare(Color color) {
        this.color = color;

        setPreferredSize(new Dimension(50, 50));
        setMaximumSize(new Dimension(50, 50));
    }
}

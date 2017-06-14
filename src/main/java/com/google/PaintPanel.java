package com.google;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luayghazwan on 6/13/17.
 */

public class PaintPanel extends JPanel {
    private InputPanel inputPanel;
    private List<Shape> shapes = new ArrayList<>();

    public PaintPanel(InputPanel inputPanel) {
        this.inputPanel = inputPanel;

        setPreferredSize(new Dimension(750, 0));
        setBackground(Color.WHITE);

        MouseInput mouseInput = new MouseInput();

        addMouseListener(mouseInput);
        addMouseMotionListener(mouseInput);

        inputPanel.getClearButton().addActionListener(e -> {
            shapes.clear();
            repaint();
        });

        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape s : shapes) {
            if (s != null) {
                s.draw(g);
            }
        }
    }
}
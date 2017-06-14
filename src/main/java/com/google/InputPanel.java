package com.google;
import javax.swing.*;
import java.awt.*;

/**
 * Created by luayghazwan on 6/13/17.
 */

public class InputPanel extends JPanel {
    private JButton rectangleButton, circleButton, lineButton, penButton, colorButton, clearButton, quitButton;
    private JCheckBox filledBox;
    private JLabel colorLabel;

    // can be refactored
    private ShapeType shapeType;
    private Color currentColor;

    private ColoredSquare coloredSquare;

    public InputPanel() {
        rectangleButton = new JButton("Rectangle");
        circleButton = new JButton("Circle");
        lineButton = new JButton("Line");
        penButton = new JButton("Pen");
        colorButton = new JButton("Color...");
        clearButton = new JButton("Clear");
        quitButton = new JButton("Quit");

        filledBox = new JCheckBox("Filled", false);
        colorLabel = new JLabel("Current Color:");

        shapeType = ShapeType.RECTANGLE;
        currentColor = Color.BLUE;
}
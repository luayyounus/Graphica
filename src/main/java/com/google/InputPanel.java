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

        coloredSquare = new ColoredSquare(currentColor);

        rectangleButton.addActionListener(e -> {
            shapeType = ShapeType.RECTANGLE;
        });

        circleButton.addActionListener(e -> {
            shapeType = ShapeType.CIRCLE;
        });

        lineButton.addActionListener(e -> {
            shapeType = ShapeType.LINE;
        });

        penButton.addActionListener(e -> {
            shapeType = ShapeType.PEN;
        });

        colorButton.addActionListener(e -> {
            currentColor = JColorChooser.showDialog(this, "Choose a Color", currentColor);
            coloredSquare.updateColor(currentColor);
        });

        quitButton.addActionListener(e -> {
            System.exit(0);
        });

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        setBorder(BorderFactory.createEmptyBorder(15, 15, 250, 15));
        
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public boolean isFilledBoxChecked() {
        return filledBox.isSelected();
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }
}
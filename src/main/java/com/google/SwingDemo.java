package com.google;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by luayghazwan on 6/14/17.
 */
public class SwingDemo {
    private JFrame mainFrame;
    private JPanel controlPanel;
    private JLabel statusLabel;

    public SwingDemo() {
        mainFrame = new JFrame("CodeFellows Swing Demo");
        mainFrame.setSize(500, 400);
        mainFrame.setLayout(new GridLayout(3, 1));

        //mainFrame.setFont(new Font("Arial", Font.PLAIN, 40));
        //mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        JButton okButton = new JButton("ok");
        JButton submitButton = new JButton("submit");
        JButton cancelButton = new JButton("cancel");

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        JLabel headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        headerLabel.setText("Control in action: Button");

        headerLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 40));

        okButton.setActionCommand("Ok");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());

        cancelButton.addActionListener(e -> {
            statusLabel.setText("Cancel button clicked. Stop clicking buttons!");
        });

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);

        mainFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("Ok")) {
                statusLabel.setText("Ok button clicked. Yay!");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit button clicked. Cool!");
            } else if (command.equals("Cancel")) {
                statusLabel.setText("Cancel button clicked. Stop clicking buttons!");
            } else {
                statusLabel.setText("???");
            }
        }
    }
}
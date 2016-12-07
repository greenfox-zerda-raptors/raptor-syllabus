package com.greenfox.aze;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Board());
	    frame.pack();
        frame.setVisible(true);
    }
}

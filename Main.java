package com.Guicalculator;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	App obj = new App();
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	obj.setContentPane(new App().Calculator);
	obj.setTitle("Scientific Calculator");
	obj.pack();
	obj.setVisible(true);

    }
}

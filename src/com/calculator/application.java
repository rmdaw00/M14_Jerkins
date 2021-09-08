package com.calculator;

import com.calculator.gui.GInterface;

public class application {

	public static void main(String[] args) {
		
		Calculator calc = Calculator.getInstance();
		GInterface.startGUI();
		GInterface.inputGUI(calc);
		
		
	}

}

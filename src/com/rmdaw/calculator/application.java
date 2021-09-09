package src.com.rmdaw.calculator;

import src.com.rmdaw.calculator.gui.GInterface;

public class application {

	public static void main(String[] args) {

		Calculator calc = Calculator.getInstance();
		GInterface.startGUI();
		GInterface.inputGUI(calc);


	}

}

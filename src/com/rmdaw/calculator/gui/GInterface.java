package src.com.rmdaw.calculator.gui;

import java.util.Scanner;

import src.com.rmdaw.calculator.Calculator;


public class GInterface {
	public static void startGUI() {
		String output = "Welcome to Calculator:\n" +
						"   allowed operators: - x + /\n" +
						"   e.g. 4x4\n";
		System.out.println(output);


	}

	public static void inputGUI(Calculator calc) {


		Scanner inputScanner = new Scanner(System.in);

		try {
			while (true) {
				String output = "Input: ";
				System.out.println(output);

				System.out.println(calc.compute(checkInput(inputScanner)) + "\n");
			}
		} catch (Exception e) {
			if (e.getMessage().equals("quit")) {
				System.out.println("Exited Successfully");
			} else {
				System.err.println(e.getMessage());
			}

		}



	}

	public static String checkInput(Scanner inputScanner) throws Exception {
		String result = "";

		while (result.equals("")) {


			String input = inputScanner.nextLine();

			if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit")) throw new Exception("quit");

			if (input.matches("(\\d*)[-+*x/](\\d*)")) {
				result = input;
				break;
			}

			String output = "Invalid Entry\n" +
					"   allowed operators: - x + /\n" +
					"   e.g. 4x4\n" +
					"Input: ";
			System.out.println(output);
		}

		return result;
	}


}

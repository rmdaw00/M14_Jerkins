package com.calculator;

public class Calculator {
	private int first = 0, second = 0;
	private String operator = "";
	private static Calculator instance = null;
	
	public static Calculator getInstance() {
		if (instance == null) instance = new Calculator();
		return instance;
	}
	
	private Calculator() {
		
	}
	
	
	


	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}


	public void setSecond(int second) {
		this.second = second;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	
	
	public int compute(String input) throws Exception {
		String[] operators = "-+*x/".split("");
		for (String op : operators) {
			if (input.contains(op)) {
				String[] operands = input.split(op);
				first = Integer.valueOf(operands[0]);
				second = Integer.valueOf(operands[1]);
				switch(op) {
					case "-":
						return first-second;
					
					case "+":
						return first+second;
					
					
					case "/":
						return first/second;
						
					case "*":
					case "x":
						return first*second;	
				
					default:
					throw new Exception("Error!");
				}

			}
		}
				
		throw new Exception("Error!");
	}	
		
}

package com.calc;

public class CalculatorDemo {
	
	public int Addition(int a, int b) {
		return a+b;
			}
	public int multiplication(int a, int c) {
		return a*c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorDemo c= new CalculatorDemo();
		System.out.println(c.Addition(10, 10));
		System.out.println(c.multiplication(5, 6));
	}

}

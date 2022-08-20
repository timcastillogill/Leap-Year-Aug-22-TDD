package org.example;

public class LeapYearCalculator {
	public boolean checkYear(int i) {
		return divisible(i, 4) && !(divisible(i, 100) && notDivisible(i, 400));
	}

	private static boolean notDivisible(int i, int number) {
		return i % number != 0;
	}

	private static boolean divisible(int i, int number) {
		return i % number == 0;
	}
}

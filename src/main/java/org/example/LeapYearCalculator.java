package org.example;

public class LeapYearCalculator {
	public boolean checkYear(int i) {
		return i % 4 == 0 && !(i % 100 == 0 && i % 400 != 0);
	}
}

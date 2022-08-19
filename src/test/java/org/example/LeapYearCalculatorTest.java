package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {
	@Test
	public void
	divisible_by_four_returns_true() {
		assertTrue(leapYear(4));
	}

	@Test
	public void
	not_divisible_by_four_returns_false() {
		assertFalse(leapYear(3));
	}
	@Test
	public void
	leap_years_if_not_divisible_by_100_and_is_divisible_by_400() {
		assertFalse(leapYear(1800));
	}

	private boolean leapYear(int year) {
		return new LeapYearCalculator().checkYear(year);
	}
}
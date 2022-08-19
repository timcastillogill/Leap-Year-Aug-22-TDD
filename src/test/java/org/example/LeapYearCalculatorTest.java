package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCalculatorTest {

	@Test
	public void
	divisible_by_four_returns_true() {
		assertTrue(new LeapYearCalculator().checkYear(4));
	}

	@Test
	public void
	not_divisible_by_four_returns_false() {
		assertFalse(new LeapYearCalculator().checkYear(3));
	}
	@Test
	public void
	leap_years_divisible_by_4_and_are_not_divisible_by_400() {
		assertFalse(new LeapYearCalculator().checkYear(1800));
	}
}
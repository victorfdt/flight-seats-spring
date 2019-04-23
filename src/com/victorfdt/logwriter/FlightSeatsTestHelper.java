package com.victorfdt.logwriter;

public class FlightSeatsTestHelper {

	/**
	 * 1B 1F = 1 family of 3 people can take place (test case 2).
	 * 
	 * @param qtd = quantity of times to multiply the input
	 * @return It will return qtd * 1 of 3 people families
	 */
	public String generateTestCase2(int qtd) {

		StringBuilder input = new StringBuilder("");
		for (int i = 1; i <= qtd; i++) {
			input.append(i + "B " + i + "F ");
		}

		return input.toString();
	}

}

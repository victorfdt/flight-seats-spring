package com.victorfdt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.victorfdt.flightseats.FlightSeats;
import com.victorfdt.flightseats.FlightSeatsOriginal;
import com.victorfdt.logwriter.FlightSeatsTestHelper;
import com.victorfdt.logwriter.TestLogWriter;

@DisplayName("FlightSeatsTest")
public class FlightSeatsTest {

	// I'm using interfaces, so I just need to change the implementation class
	private FlightSeats myFlightSeats = new FlightSeatsOriginal();
	private static String algorithmName = "FlightSeatsOriginal";

	String seatsOcuppied = "";
	int qtdRows = 0, expectedResult = 0;
	static long startTime = 0;

	@BeforeAll
	static void init() {
		startTime = System.currentTimeMillis();
	}

	@Test
	void test1() {
		seatsOcuppied = "1A";
		qtdRows = 1;
		expectedResult = 2;
		assertEquals(expectedResult, myFlightSeats.qtdThreePeopleFamily(qtdRows, seatsOcuppied));
	}

	@Test
	void test2() {
		seatsOcuppied = "1B 1F";
		qtdRows = 1;
		expectedResult = 1;
		assertEquals(expectedResult, myFlightSeats.qtdThreePeopleFamily(qtdRows, seatsOcuppied));
	}

	@Test
	void test3() {
		seatsOcuppied = "";
		qtdRows = 1;
		expectedResult = 3;
		assertEquals(expectedResult, myFlightSeats.qtdThreePeopleFamily(qtdRows, seatsOcuppied));
	}

	@Test
	void test4() {
		seatsOcuppied = "1B 3A 1D 2G 2J";
		qtdRows = 3;
		expectedResult = 6;
		assertEquals(expectedResult, myFlightSeats.qtdThreePeopleFamily(qtdRows, seatsOcuppied));
	}

	@Test
	void test5() {
		seatsOcuppied = "1A 1B 3A 3B 3C 1D 1G 3F 2J";
		qtdRows = 3;
		expectedResult = 4;
		assertEquals(expectedResult, myFlightSeats.qtdThreePeopleFamily(qtdRows, seatsOcuppied));
	}

	@Test
	void test6() {
		seatsOcuppied = "1B 3A 1D 2G 2J 2B 4A 2D 3G 3J";
		qtdRows = 4;
		expectedResult = 5;
		assertEquals(expectedResult, myFlightSeats.qtdThreePeopleFamily(qtdRows, seatsOcuppied));
	}

	@Test
	@DisplayName("PerformanceTest")
	void performanceTest() {
		seatsOcuppied = "6A 6B 6C 4D 4G 6F 5J 7A 7B 9A 9B 6C 7D 7G 9F 8J 1A 1B 3A 3B 3C 1D 1G 3F 2J 4A 4B";
		qtdRows = 9;
		expectedResult = 12;
		assertEquals(expectedResult, myFlightSeats.qtdThreePeopleFamily(qtdRows, seatsOcuppied));
	}

	@Test
	void helperTest() {
		FlightSeatsTestHelper helper = new FlightSeatsTestHelper();

		int qtd = 5000;
		seatsOcuppied = helper.generateTestCase2(qtd);
		qtdRows = qtd;
		expectedResult = qtd;
		assertEquals(expectedResult, myFlightSeats.qtdThreePeopleFamily(qtdRows, seatsOcuppied));

	}

	@AfterAll
	static void afterAll() {
		long time = System.currentTimeMillis() - startTime;
		TestLogWriter myTestLogWriter = new TestLogWriter(algorithmName, time);
		myTestLogWriter.writeLog();
	}

}

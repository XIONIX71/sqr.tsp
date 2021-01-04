package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	City A = new City(0,0);
	City B = new City(0,-1);
	City C = new City(1,0);
	City D = new City(1,1);

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN AFromA
	 * THEN 0
	 */
	public void testdistanceToCFromC0() throws Exception{
		double expected = 0;
		double actual = C.distanceTo(C);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN AFromC
	 * THEN 1
	 */
	public void testdistanceToAFromC1() throws Exception{
		double expected = 1;
		double actual = A.distanceTo(C);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN BFromA
	 * THEN 1
	 */
	public void testdistanceToBfromA1(){
		double expected = 1;
		double actual = A.distanceTo(B);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN SqrtBetweenAD
	 * THEN sqrt(2)
	 */
	public void testDistanceToSqrtBetweenADSqrtof2() {

		double expected = Math.sqrt( 2 );
		double actual = A.distanceTo(D);

		assertEquals(expected, actual, 0);

	}

}

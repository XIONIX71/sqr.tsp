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
	public void test_distanceTo_CFromC_0() throws Exception{
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
	public void test_distanceTo_AFrom_C1() throws Exception{
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
	public void test_distanceTo_BfromA_1(){
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
	public void test_DistanceTo_SqrtBetweenAD_SqrtOf2() {

		double expected = Math.sqrt( 2 );
		double actual = A.distanceTo(D);

		assertEquals(expected, actual, 0);

	}

}

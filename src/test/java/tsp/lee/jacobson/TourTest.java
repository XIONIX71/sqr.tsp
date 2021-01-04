package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	ArrayList<City> t = new ArrayList<City>();
	City A = new City(0,0);
	City B = new City(0,1);
	City C = new City(0,-1);

	@Test
	/**
	 * GIVEN getdistance
	 * WHEN ABC
	 * THEN 4
	 */
	public void test_getDistance_ABC_4() {
			
		t.add(A);
		t.add(B);
		t.add(C);
		Tour tour = new Tour(t);
		int expected = 4;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}


	@Test
	/**
	 * GIVEN getdistance
	 * WHEN emptyTour
	 * THEN 0
	 */
	public void getDistance_emptyTour_0() {
		Tour tour = new Tour();
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	/**
	 * GIVEN getdistance
	 * WHEN OnlyOneCity
	 * THEN 0
	 */
	public void getDistance_OnlyOneCity_0() {
		t.add(B);
		Tour tour = new Tour(t);
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	/**
	 * GIVEN getdistance
	 * WHEN ABAC
	 * THEN 3
	 */
	public void getDistance_ABAC_3() {
		t.add(A);
		t.add(B);
		t.add(A);
		t.add(C);
		Tour tour = new Tour(t);
		int expected = 4;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	/**
	 * GIVEN distanceTo
	 * WHEN ofDouble
	 * THEN false
	 */
	public void getDistance_ofDouble_Exceptionfalse() throws Exception {

		City C1 = new City(0,0);
		City D1 = new City(1,1);
		
		t.add(C1);
		t.add(D1);

		Tour tour = new Tour(t);
		double expected = Math.sqrt( 2 );
		int actual =tour.getDistance();

		assertEquals(expected, actual, 0);
		//Ne fonctionne pas caar la fonction renvoie int il faudra donc faire en sorte que la fonction renvoie un double
	}

}

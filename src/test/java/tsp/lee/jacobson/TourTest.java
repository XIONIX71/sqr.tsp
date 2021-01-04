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
	 * THEN sqrt(2)
	 */
	public void testgetDistanceABC() {
			
		t.add(A);
		t.add(B);
		t.add(C);
		Tour tour = new Tour(t);
		int expected = 4;

		assertEquals(expected,tour.getDistance());
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
	public void getDistanceOnlyOneCity0() {
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
	public void getDistanceABAC3() {
		t.add(A);
		t.add(B);
		t.add(A);
		t.add(C);
		Tour tour = new Tour(t);
		int expected = 4;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

}

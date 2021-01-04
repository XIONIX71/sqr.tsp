package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test
	/**
	 * GIVEN evolvePopulation
	 * WHEN yesevolvePopulation
	 * THEN true
	 */
	public void testevolvePopulationyesEvolvePopulationTrue() {
		Population notexpected = new Population(50, true);
		Population actual = GA.evolvePopulation(notexpected);
		assertNotEquals(notexpected, actual);
	}

	@Test
	/**
	 * GIVEN evolvePopulation
	 * WHEN Best distance
	 * THEN 4
	 */
	public void testevolvePopulationthebesdistance4() {
		
		City A = new City(0,0);
		City B = new City(0,-1);
		City C = new City(1,0);
		City D = new City(1,1);

		TourManager.addCity(A);
		TourManager.addCity(D);
		TourManager.addCity(C);
		TourManager.addCity(B);
		
		Population pop = new Population(50, true);

		pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 100; i++) {
            pop = GA.evolvePopulation(pop);
		}
		int expected = pop.getFittest().getDistance();
		int actual = 4;
		assertEquals(expected, actual);
		
	}

}

package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {

	@Test
	public void testcalculer() {
		
	Factorielle factorielle = new Factorielle();
	long n= factorielle.calculer(1);
	
	assertEquals(1, n);
	
	}

}


/*public long calculer(long n) {
	if (n > 1) {
		return n * calculer(n-1);
	} else if (n < 0) {
		throw new IllegalArgumentException();*/
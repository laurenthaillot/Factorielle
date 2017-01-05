package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {

	@Test
	public void factorielle_de_1_renvoie_1() {
		
	Factorielle monfactorielle = new Factorielle();
	long n= monfactorielle.calculer(1);
	
	assertEquals(1, n);
	
	}

	@Test
	public void factorielle_de_3_renvoie_6() {
		
	Factorielle monfactorielle = new Factorielle();
	long n= monfactorielle.calculer(3);
	
	assertEquals(6, n);
	
	}
	
	
	@Test
	public void factorielle_O_renvoie_1() {
	
	long n = 0;
		
	Factorielle monfactorielle = new Factorielle();
	monfactorielle.calculer(0);
	
	assertEquals(1, n);
	
	}
	
}

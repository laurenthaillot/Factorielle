package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FactorielleTest {

	public Factorielle factorielle;

	@Before
	public void method() {
		factorielle = new Factorielle();
	}

	@Test
	@Ignore
	public void factorielle_de_1_renvoie_1() {

		long n = factorielle.calculer(1);

		assertEquals(1, n);

	}

	@Test
	public void factorielle_de_5_renvoie_120() {

		long n = factorielle.calculer(5);

		assertEquals(120, n);

	}

	@Test
	public void factorielle_de_3_renvoie_6() {

		long n = factorielle.calculer(3);

		assertTrue(n == 6);

	}

	@Test
	public void factorielle_O_renvoie_1() {

		long n = 0;
		long result = factorielle.calculer(n);

		assertEquals("ca ne marche pas", 1, result);

	}

	@Test(expected = IllegalArgumentException.class)
	public void factorielle_nb_negatif_renvoie_IllegalArgumentException() {
		long n = -1;
		factorielle.calculer(n);

	}
}

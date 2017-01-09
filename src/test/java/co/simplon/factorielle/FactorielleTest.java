package co.simplon.factorielle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.*;

public class FactorielleTest {

	public Factorielle factorielle;

	@Before
	public void method() {
		factorielle = new Factorielle();
	}

	@Test (timeout=1)
	
		public void factorielle_de_1_renvoie_18() {
		
		int a = 1;				
		while (a<100){
		long n = factorielle.calculer(18);

		assertEquals(6402373705728000l, n);
		a++;
		}
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
	
	
	@Test 
	public void Factorielle_de_4_doit_etre_24_avec_Hamcrest(){
		
		//Given
		long entier = 4;
		long resultatattendu =24;
		
		// When
		long resultat =factorielle.calculer(entier);
						
		//then
		
		assertThat(resultat, equalTo(resultatattendu));
				
	}
	
	
}

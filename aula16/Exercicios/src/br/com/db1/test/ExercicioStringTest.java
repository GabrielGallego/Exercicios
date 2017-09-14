package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.ExercicioString;

public class ExercicioStringTest {
	private ExercicioString test = new ExercicioString();
	
	@Test 
	public void letraMaiusculaTest() {
		Assert.assertTrue("TEXTO".equals(test.letraMaiuscula("texto")));
	}
	
	@Test
	public void letraMinusculaTest() {
		Assert.assertTrue("texto".equals(test.letraMinuscula("TEXTO")));
	}
	
	@Test
	public void quantidadeLetrasTest() {
		Assert.assertTrue(8 == test.quantidadeLetras("DB1START"));
		Assert.assertTrue(8 == test.quantidadeLetras(" DB1START "));
	}
	
	@Test 
	public void recortaNomeTest(){
		Assert.assertTrue("Luiz".equals(test.recortaNome("Luiz Gabriel Galego")));	
	}
	
	@Test 
	public void recortaNome2Test() {
		Assert.assertTrue("iz Gabriel Galego".equals(test.recortaNome2("Luiz Gabriel Galego")));
	}
	
	@Test
	public void recortaNome3Test() {
		Assert.assertTrue("lego".equals(test.recortaNome3("Luiz Gabriel Galego")));
	}
	
}

package br.com.db1.start;



public class ExercicioString {

	public String letraMaiuscula(String texto) {
		String maiusculo;
		maiusculo = texto.toUpperCase();
		
		return maiusculo;
		
	}
	
	public String letraMinuscula(String TEXTO) {
		String minusculo;
		minusculo = TEXTO.toLowerCase();
		
		return minusculo;
	}
	
	public Integer quantidadeLetras(String palavra) {
		palavra = palavra.trim();
		return palavra.length();
	}
	public String recortaNome(String nome) {
		return nome.substring(0, 4);
	}
	
	public String recortaNome2(String nome) {
		return nome.substring(2, nome.length());
	}
	
	public String recortaNome3(String nome) {
		return nome.substring(nome.length() -4, nome.length());
	}
	
}

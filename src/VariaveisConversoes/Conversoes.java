package VariaveisConversoes;

public class Conversoes {

	public static void main(String[] args) {
		
		byte inteiroCurto = 127;
		short inteiroMedio = 32767;
		int inteiroGrande = 2147483647;
		float fracionadoMedio = 9.1234567890f;
		long inteiroGigante = 9223372036854775807l;
		double fracionadoGrande = 1.1234567890;
		
		/* Conversões de tipos numéricos sempre 
		 * tem que ser do tipo de menor capacidade
		 * para o tipo de maior capacidade, ou 
		 * perderá dados */
		
		inteiroCurto = (byte) fracionadoGrande;
		
		inteiroGrande = (int) fracionadoMedio;
		
		fracionadoGrande = (double) fracionadoMedio;
		
		inteiroMedio = (short) inteiroCurto;
		
		
	}

}

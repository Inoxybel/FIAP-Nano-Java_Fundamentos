package LoopsArraysColecoes;

import java.util.ArrayList;
import java.util.List;

public class Loops {

	public static void main(String[] args) {

		/* Loops */
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		
		int x = 0;
		
		while (x < 5) {
			x++;
			System.out.println(x);
		}
		
		x = 0;
		
		do {
			System.out.println(x);
			x++;
		}while(x < 5);
		
		
		/* Arrays */
		char[] texto = {'U', 'm', ' ', 't', 'e', 'x', 't', 'o'};
		System.out.println(texto);
		
		String[] array = new String[]{"Um", "Dois", "Tres"};
		for(int z = 0; z < array.length; z++) {
			System.out.println(array[z]);
		}
		
		/* Coleções */
		List<String> lista = new ArrayList();
		lista.add("string1");
		lista.add("string2");
		lista.add("string3");
		System.out.println(lista);
		
		
		
	}

}

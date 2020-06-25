package br.edu.univas.br;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[]args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int z = 0;
		
		System.out.println("Digite um número:");
		    int x = leitura.nextInt();
		    
		    if (x % 5 == 2 || x % 5 == 1 || x % 5 == 0) {
		    	z = x;
		    	System.out.println(z + " arredonda");
		    } else {
		    	z = x;
		    	System.out.println(z + " não arredonda");
		    }
		
		
		leitura.close();
		
	}
}

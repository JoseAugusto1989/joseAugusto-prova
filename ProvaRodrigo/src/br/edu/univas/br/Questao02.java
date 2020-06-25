package br.edu.univas.br;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[]args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int k = 100;
		int resS = 0;
		int resN = 0;
		int sul = 0;
		int sud = 0;
		int cen = 0;
		int nor = 0;
		int nd = 0;
		
		for(int i = 0; i < k; i++) {
			System.out.println("Digite 1 para sim e 2 para não");
			System.out.println("Voce acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			    int res1 = leitura.nextInt();
			    if (res1 == 1) {
			    	resS++;
			    } else if (res1 == 2) {
			    	resN++;
			    }
		}
		for(int i = 0; i < k; i++) {
			System.out.println("Digite 1 p/ Sul, 2 p/ Sudeste, 3 p/ Centro-Oeste, 4 p/ Norte e 5 p/ Nordeste");
			System.out.println("Digite qual região do Brasil voce mora:");
			    int res2 = leitura.nextInt();
			    if (res2 == 1) {
			    	sul++;
			    } else if (res2 == 2) {
			    	sud++;
			    } else if (res2 == 3) {
			    	cen++;
			    } else if (res2 == 4) {
			    	nor++;
			    } else if (res2 == 5) {
			    	nd++;
			    }
		}
		
		System.out.println(resS + " votaram SIM");
		System.out.println(resN + " votaram NÃO");
		System.out.println(sul + " pessoas do sul");
		System.out.println(sud + " pessoas do sudeste");
		System.out.println(cen + " pessoas do centro-oeste");
		System.out.println(nor + " pessoas do norte");
		System.out.println(nd + " pessoas do nordeste");
		
		leitura.close();
		
	}
}

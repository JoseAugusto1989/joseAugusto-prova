package br.edu.univas.br;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[]args) {
		
		 Scanner leitura = new Scanner(System.in);
		 
         int x = 0;
		 int h = 0;
		 int z = 0;
		 
         for (int i = 1; i != h; i++) {
        	 System.out.println("Digite um número:");
        	     x = leitura.nextInt();
        	     if (x < 0) {
        	    	 z++; 
        	     } else if (x == 0) {
        	    	 break;
        	     }
        	      
         }    
         System.out.println(z);  
		 leitura.close();
		
	}

}

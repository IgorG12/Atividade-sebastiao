package atividade1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		String letra;
		System.out.println("Digite uma palavra com 5 letras: ");
		Scanner Letra = new Scanner(System.in);
		
		letra = Letra.next();
		int tam = letra.length();
		if (tam == 5) {
			//System.out.print("a palavra sera: "+  letra);
			char palavra[]= letra.toCharArray();
			for (int i = 0;i < tam;i++) {
				for(int j=0; j< tam;j++) {
					for(int x =0;x<tam;x++) {
						System.out.print(palavra[i]);
						System.out.print(palavra[j]);
						System.out.print(palavra[x]);
						System.out.println("");
					}
				}
			}
				
		}else
			System.out.println("Error");

	

}
}
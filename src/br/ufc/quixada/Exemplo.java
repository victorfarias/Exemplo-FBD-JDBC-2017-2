package br.ufc.quixada;

import java.util.Scanner;

public class Exemplo {

	public void exemplo() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(s);
		if(s.equals("joao")) {
			System.out.println("Eu li joao");
		}else {
			System.out.println("Nao li joao");
		}
		for(int i=0; i<5; i++) {
			System.out.println("Rodou");
		}
	}
}
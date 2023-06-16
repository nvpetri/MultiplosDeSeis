package br.senai.sp.jandira;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int valor1, valor2, menorValor, maiorValor;

		System.out.println("Olá!! Digite o valor 1: ");
		valor1 = teclado.nextInt();
		System.out.println("Agora digite o valor 2: ");
		valor2 = teclado.nextInt();
		System.out.println("Calculando...");
		System.out.println();
		System.out.println("Aqui estão os multiplos de 6 dentro do intervalo selecionado.");
		System.out.println();
		if (valor1 < valor2) {
			menorValor = valor1;
			maiorValor = valor2;
		} else {
			menorValor = valor2;
			maiorValor = valor1;
		}
		int i = menorValor;
		while (i <= maiorValor) {
			if (i % 6 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}

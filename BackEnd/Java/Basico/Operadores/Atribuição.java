package br.com.stefanini.cursojavabasico.operadores;

public class Atribuição {

	public static void main(String[] args) {

		int a = 10; // Operador de atribuição
		int b = 5;

		b += a;
		b -= a;
		b *= a;
		b /= a;
		b %= a;
		
		
		System.out.println(a % b);

	}
}

package br.com.stefanini.cursobasico.estruturacontrole;

public class IfElse2 {

	public static void main(String[] args) {

		int nota = 5;

		// if
		if (nota >= 7) {
			System.out.println("Aprovado");
		}

		// if sem bloco
		if (nota >= 9)
			System.out.println("Aprovado");
		System.out.println("Parabéns");

		// if else

		if (nota >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		// if else if

		if (nota >= 9) {
			System.out.println("Aprovado");

			System.out.println("Parabéns");
		} else if (nota >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}
}

package br.com.stefanini.cursobasico.estruturacontrole;



public class Loop {

	public static void main(String[] args) {

		int count = 10;

		while (count < 100) {

			System.out.println("count: " + count);
			count++;
		}

		int countDois = 10;

		do {

			System.out.println(countDois);
			countDois++;
		} while (countDois < 100);

		// FOR - NORMAL

		// FOR - (ATRIBUIÇÃO,CONDIÇÃO E ALTERAÇÃO)

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}

		// FOR - AREAS AUSENTES
		int i = 0;

		for (; i < 100;) {

			System.out.println(i);
			i++;
		}
		
		for (;;) {

			System.out.println("For");
			
		}
		
		
		

	}
}

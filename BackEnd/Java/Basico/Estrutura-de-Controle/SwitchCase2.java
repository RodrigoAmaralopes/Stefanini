package br.com.stefanini.cursobasico.estruturacontrole;

public class SwitchCase2 {
	public static void main(String[] args) {

		int mes = 1; // janeiro

		/*if (mes == 1) {
			System.out.println("Janeiro");
		}
		if (mes == 2) {
			System.out.println("Fevereiro");
		}

		if (mes == 3) {
			System.out.println("Março");
		}

		if (mes == 4) {
			System.out.println("Abril");
		}

		if (mes == 5) {
			System.out.println("Maio");
		}

		if (mes == 6) {
			System.out.println("Junho");
		}

		if (mes == 7) {
			System.out.println("Julho");
		}

		if (mes == 8) {
			System.out.println("Agosto");
		}

		if (mes == 9) {
			System.out.println("Setembro");
		}

		if (mes == 10) {
			System.out.println("Outubro");
		}

		if (mes == 11) {
			System.out.println("Novembro");
		}

		if (mes == 12) {
			System.out.println("Dezembro");
		} */
		
		switch(mes) {
		case 1: System.out.println("Janeiro"); break;
		case 2: System.out.println("Fevereiro"); break;
		case 3: System.out.println("Março"); break;
		case 4: System.out.println("Abril"); break;
		case 5: System.out.println("Maio"); break;
		case 6: System.out.println("Junho"); break;
		case 7: System.out.println("Julho"); break;
		case 8: System.out.println("Agosto"); break;
		case 9: System.out.println("Setembro"); break;
		case 10: System.out.println("Outubro"); break;
		case 11: System.out.println("Novembro"); break;
		case 12: System.out.println("Dezembro"); break;
		default: System.out.println("Mês Inválido !");
	}

	}
}

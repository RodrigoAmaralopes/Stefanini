package br.com.stefanini.cursojavabasico.vetor;
public class vetor {
	public static void main(String[] args) {
		
		 int notas [] = new int[10]; // tamanho 10 do array 

		 notas[0] = 1;

		 notas[2] = 5;

		 notas[6] = 9;

		 notas[4] = 2;

		 notas[1] = 4;

		 notas[9] = 7;

		 notas[7] = 8;

		 //nota[11] = 10 

		 System.out.println(notas[0]);
		 System.out.println(notas[2]);
		 System.out.println(notas[6]);
		 System.out.println(notas[4]);
		 System.out.println(notas[1]);
		 System.out.println(notas[9]);
		 System.out.println(notas[7]);

		 String[] carros = new String[] {"BMW i320","Mercedes C180","BMW M3","Mercedes AMG ","Tesla Model S"};

		 System.out.println(carros.length);

		 for (String carro : carros)
		 {

		 System.out.println(carros);

		 }
	}
}

		 /* for (int i = 0; i < notas.length; i++) {
		 System.out.println(notas[i]);	
		 		}*/ 
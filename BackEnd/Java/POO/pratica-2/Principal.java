package br.com.stefanini.orientacaoaobjetos.pratica2;

public class Principal {

	/*
	 * 
	 * 
	 * MODIFICADORES DE ACESSO
	 * 
	 * DEFAULT => NAO UMA PALAVRA CHAVE (Palavra reservada). própria classe de um
	 * mesmo pacote PUBLIC => PERMITE ACESSO DE QUALQUER LUGAR, PRÓPRIA CLASSE,
	 * CLASSE DO MESMO PACOTE, SUBCLASSES (EXTENDS), TODAS AS DEMAIS CLASSES PRIVATE
	 * =>ACESSÍVEL PRÓPRIA CLASSE PROTECTED => ACESSIVEL PRÓPRIA CLASSE, CLASSE
	 * MESMO PACOTE, SUBCLASSES
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Carro bmw = new Carro();
		Carro mercedes = new Carro("Mercedes", "C180");
		BMW bmw2 = new BMW();

		bmw2.calcularTaxaAceleracao(100.4, 5);

		bmw.setMarca("BMW");
		bmw.setModelo("M3");
		bmw.setKm_litro(7.5);
		// bmw.aceleracao = 50;
		bmw.setVelocidade_max(280);
		;

		System.out.println(mercedes.getMarca());
		System.out.println(mercedes.getModelo());
		System.out.println(bmw.getKm_litro());
		System.out.println(bmw.getAceleracao());
		System.out.println(bmw.getVelocidade_max());

		bmw.acelerar();
		bmw.frear();

		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidade_max(), 0, 10, 0));
		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidade_max(), 10));
		System.out.println(bmw.calcularTaxaAceleracao(100, 5));
	}
}

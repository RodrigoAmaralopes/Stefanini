package br.com.stefanini.orientacaoaobjetos.executor;

import br.com.stefanini.orientacaoaobjetos.Carro;
import br.com.stefanini.orientacaoaobjetos.Mercedes;
import br.com.stefanini.orientacaoaobjetos.entidade.BMW;

public class executor {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		
		carro1.setMarca("BMW");
		System.out.println(carro1.getMarca());
		
		carro1.setBancos(3);
		System.out.println(carro1.getBancos());
		
		carro1.setVelocidade(280);
		
		
		System.out.println(carro1.acelerar());
		carro1.acelerar();
		
		
		Carro carro2 = new Carro("Mercedes");
		System.out.println(carro2.getMarca());
		
		
		
		/* carro1.marca = "BMW"; 
		carro1.modelo = "320i";
		carro1.bancos = 5;
		carro1.chassi = 343434;
		carro1.roda = 20;
		
		
		System.out.println(carro1.marca);
		System.out.println(carro1.modelo);
		System.out.println(carro1.bancos);
		System.out.println(carro1.chassi);
		System.out.println(carro1.roda); */
		
		System.out.println(soma(10, 5));
		System.out.println(soma(10, 15, 6));
		
		
		
		
		
		
		BMW bmw = new BMW();
		bmw.setVelocidade(100);
		System.out.println(bmw.acelerar());
	
		
		Mercedes mercedes =   new Mercedes();
		System.out.println(mercedes.acelerar());
	
	}
	
	
	public static int soma(int a, int b) {
		
		return a + b;
		
	}
	
	public static int soma(int a, int b, int c) {
		
		return a + b + c;
	}
	
	
}

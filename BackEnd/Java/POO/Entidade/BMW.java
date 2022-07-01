package br.com.stefanini.orientacaoaobjetos.entidade;

import br.com.stefanini.orientacaoaobjetos.Carro;

public class BMW extends Carro {
	
	public BMW () {
		this.setMarca("BMW");
		
		
	}
	
	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return " A BMW pode fazer de 0 " + super.acelerar()+ " em 5s" ;
	}
	

}

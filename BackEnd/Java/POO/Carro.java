package br.com.stefanini.orientacaoaobjetos;

public class Carro {

	//ATRIBUTOS
	
	private String marca;
	private String modelo;
	private int chassi;
	private String placa;
	private int roda;
	private int bancos;
	private int velocidade;
	
	
	//CONSTRUTOR PARA FAZER UMA INSTÂNCIA
	public Carro(){
		System.out.println("Construindo um carro");
	}
	
	public Carro(String marca) {
		this.marca = marca;
		
		
	}
	
	
	//AÇÕES
	
	public String acelerar() {
	
		return velocidade + "km/5s";
		
	}
	
	
	public int getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	
	
	
	
	
	// Modificador de Acesso | Para modificar os atributos
	


	public String getMarca() {
		return this.marca;
	}
	
	
	public void setMarca(String marca) {
		
		this.marca = marca;
		
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getChassi() {
		return chassi;
	}


	public void setChassi(int chassi) {
		this.chassi = chassi;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getRoda() {
		return roda;
	}


	public void setRoda(int roda) {
		this.roda = roda;
	}


	public int getBancos() {
		return bancos;
	}


	public void setBancos(int bancos) {
		this.bancos = bancos;
	}
	

}

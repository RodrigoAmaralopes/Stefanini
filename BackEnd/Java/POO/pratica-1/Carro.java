package br.com.stefanini.orientacaoaobjetos.pratica1;

public class Carro {
    String marca;
    String modelo;
    int velocidade_max;
    int aceleracao;
    double km_litro;

    void acelerar(){
        System.out.println("Acelerando...");
    }
    void frear(){
        System.out.println("Freando..");
    }
}

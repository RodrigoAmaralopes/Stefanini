package br.com.stefanini.cursojavabasico.exceptions;

public class BMW extends Carro {
    @Override
    public double calculcarTaxaAceleracao(double vel_final, double tempo_final) {
        System.out.println("BMW Sobreescrita");
        return vel_final / tempo_final;
    }
}

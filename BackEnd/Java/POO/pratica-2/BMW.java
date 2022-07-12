package br.com.stefanini.orientacaoaobjetos.pratica2;

public class BMW extends Carro {
    @Override
    public double calculcarTaxaAceleracao(double vel_final, double tempo_final) {
        System.out.println("Sobreescrita");
        return vel_final / tempo_final;
    }
}

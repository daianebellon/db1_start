package br.com.daianebellon.original.metrica.incrementa;

import br.com.daianebellon.original.metrica.MetricaDaSenha;

/**
 * Metrica que tem como base a quantidade de caracteres presentes na senha.
 */
public class MetricaCaracteres extends MetricaDaSenha {

    private final static int MULTIPLICADOR = 4;

    @Override
    public void calcula(String senha) {
        this.quantidade = senha.length();
        this.bonus = this.quantidade * MULTIPLICADOR;
    }
}

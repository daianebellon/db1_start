package br.com.daianebellon.original.metrica.incrementa;

import br.com.daianebellon.original.metrica.MetricaDaSenha;

/**
 *  Metrica que tem como base a quantidade de numeros presentes na senha.
 */
public class MetricaNumeros extends MetricaDaSenha {

    private final static int MULTIPLICADOR = 4;

    @Override
    public void calcula(String senha) {
        char[] chars = senha.toCharArray();

        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                this.quantidade++;
            }
        }
        this.bonus = this.quantidade * MULTIPLICADOR;
    }
}

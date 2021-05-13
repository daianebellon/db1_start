package br.com.daianebellon.original.metrica.incrementa;

import br.com.daianebellon.original.metrica.MetricaDaSenha;

/**
 *  Metrica que tem como base a quantidade de letras maiusculas presentes na senha.
 */
public class MetricaLetrasMaiuscula extends MetricaDaSenha {

    private final static int MULTIPLICADOR = 2;

    @Override
    public void calcula(String senha) {
        char[] chars = senha.toCharArray();

        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                this.quantidade++;
            }
        }
        this.bonus = Math.abs((this.quantidade - senha.length()) * MULTIPLICADOR);
    }
}

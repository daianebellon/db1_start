package br.com.daianebellon.original.metrica.incrementa;

import br.com.daianebellon.original.metrica.MetricaDaSenha;

/**
 *  Metrica que tem como base a quantidade de letras minusculas presentes na senha.
 */
public class MetricaLetrasMinisculas extends MetricaDaSenha {

    private final static int MULTIPLICADOR = 2;

    @Override
    public void calcula(String senha) {
        char[] chars = senha.toCharArray();

        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                this.quantidade++;
            }
        }
        this.bonus = Math.abs((this.quantidade - senha.length()) * MULTIPLICADOR);
    }
}


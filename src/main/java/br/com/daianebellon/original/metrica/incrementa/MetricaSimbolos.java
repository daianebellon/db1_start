package br.com.daianebellon.original.metrica.incrementa;

import br.com.daianebellon.original.metrica.MetricaDaSenha;

/**
 *  Metrica que tem como base a quantidade de simbolos presentes na senha.
 */
public class MetricaSimbolos extends MetricaDaSenha {

    private final static int MULTIPLICADOR = 6;

    @Override
    public void calcula(String senha) {
        String[] chars = senha.replaceAll("\\s+", "").split("\\s*");

        for (String aChar : chars) {
            if (aChar.matches("[^a-zA-Z0-9_]")) {
                this.quantidade++;
            }
        }
        this.bonus = this.quantidade * MULTIPLICADOR;
    }
}

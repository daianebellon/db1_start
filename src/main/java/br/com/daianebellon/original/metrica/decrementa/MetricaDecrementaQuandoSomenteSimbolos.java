package br.com.daianebellon.original.metrica.decrementa;

import br.com.daianebellon.original.metrica.MetricaDaSenha;

/**
 *  Metrica que verifica se todos os caracteres são simbolos.
 */
public class MetricaDecrementaQuandoSomenteSimbolos extends MetricaDaSenha {

    private final static int MULTIPLICADOR = 6;

    @Override
    public void calcula(String senha) {
        String[] chars = senha.replaceAll("\\s+", "").split("\\s*");

        for (String aChar : chars) {
            if (aChar.matches("[^a-zA-Z0-9_]")) {
                this.quantidade++;
            }
        }

        if (this.quantidade == senha.length()) {
            this.bonus =  this.quantidade * MULTIPLICADOR;
        }
    }
}

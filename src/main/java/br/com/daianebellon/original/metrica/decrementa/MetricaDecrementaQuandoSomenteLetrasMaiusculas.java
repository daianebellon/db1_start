package br.com.daianebellon.original.metrica.decrementa;

import br.com.daianebellon.original.metrica.MetricaDaSenha;

/**
 *  Metrica que verifica se todos os caracteres são letras maiusculas.
 */
public class MetricaDecrementaQuandoSomenteLetrasMaiusculas extends MetricaDaSenha {

    @Override
    public void calcula(String senha) {
        char[] chars = senha.toCharArray();

        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                this.quantidade++;
            }
        }

        if (this.quantidade == senha.length()) {
            this.bonus = this.quantidade * 2;
        } else {
            this.bonus = 0;
        }
    }
}

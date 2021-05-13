package br.com.daianebellon.original.metrica.decrementa;

import br.com.daianebellon.original.metrica.MetricaDaSenha;

/**
 *  Metrica que verifica se todos os caracteres são letras.
 */
public class MetricaDecretementaQuandoSomenteLetras extends MetricaDaSenha {

    @Override
    public void calcula(String senha) {
        char[] chars = senha.toCharArray();

        for (char aChar : chars) {
            if (Character.isAlphabetic(aChar)) {
                this.quantidade++;
            }
        }

        if(this.quantidade == senha.length()) {
            this.bonus =  this.quantidade * 3;
        }else {
            this.bonus = 0;
        }
    }
}

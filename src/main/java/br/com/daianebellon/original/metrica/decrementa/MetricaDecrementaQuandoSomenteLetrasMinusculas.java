package br.com.daianebellon.original.metrica.decrementa;

import br.com.daianebellon.original.metrica.MetricaDaSenha;

/**
 *  Metrica que verifica se todos os caracteres são letras minusculas.
 */
public class MetricaDecrementaQuandoSomenteLetrasMinusculas extends MetricaDaSenha {

    @Override
    public void calcula(String senha) {
        char[] chars = senha.toCharArray();

        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                this.quantidade++;
            }
        }

        if(this.quantidade == senha.length()){
            this.bonus = this.quantidade * 2;
        }else {
            this.bonus = 0;
        }
    }
}

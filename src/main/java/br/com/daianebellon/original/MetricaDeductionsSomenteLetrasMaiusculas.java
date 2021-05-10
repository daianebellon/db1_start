package br.com.daianebellon.original;

public class MetricaDeductionsSomenteLetrasMaiusculas extends MetricaDaSenha {
    @Override
    void calcula(String senha) {

        char[] chars = senha.toCharArray();

        int total = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                total++;
            }
        }
        quantidade = total;
        if (quantidade == senha.length()) {
            bonus = quantidade * 2;
        } else {
            bonus = 0;
        }

    }
}

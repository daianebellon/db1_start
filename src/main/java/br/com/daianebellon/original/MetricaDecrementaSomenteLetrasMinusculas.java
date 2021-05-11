package br.com.daianebellon.original;

public class MetricaDecrementaSomenteLetrasMinusculas extends MetricaDaSenha {

    @Override
    void calcula(String senha) {

        char[] chars = senha.toCharArray();

        int total = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLowerCase(c)) {
                total++;
            }
        }
        quantidade = total;
        if(quantidade == senha.length()){
            bonus = quantidade * 2;
        }else {
            bonus = 0;
        }
    }
}
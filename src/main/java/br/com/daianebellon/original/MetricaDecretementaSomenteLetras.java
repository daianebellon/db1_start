package br.com.daianebellon.original;

public class MetricaDecretementaSomenteLetras extends MetricaDaSenha {

    @Override
    void calcula(String senha) {
        char[] chars = senha.toCharArray();
        int total = 0;
        for (int i = 0; i < chars.length; i++) {
            if(Character.isAlphabetic(chars[i])){
                total++;
            }
        }
        if(total == senha.length()) {
            quantidade = total;
            bonus = quantidade * 3;
        }else {
            bonus = 0;
        }
    }
}

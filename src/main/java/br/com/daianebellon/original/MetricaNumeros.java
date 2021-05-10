package br.com.daianebellon.original;

public class MetricaNumeros extends MetricaDaSenha {
    @Override
    void calcula(String senha) {
        char[] chars = senha.toCharArray();
        int total = 0;
        for(int i = 0; i < chars.length; i++){
            if(Character.isDigit(chars[i])){
                total++;
            }
        }
        quantidade = total;
        bonus = (quantidade * 4);
    }
}

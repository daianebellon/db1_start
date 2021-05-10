package br.com.daianebellon.original;

public class MetricaLetrasMaiuscula extends MetricaDaSenha{
    @Override
    void calcula(String senha) {
        char[] chars = senha.toCharArray();
        int total = 0;
        for (int i = 0; i < chars.length; i++){
            if(Character.isUpperCase(chars[i])){
                total++;
            }
        }
        quantidade = total;
        bonus = Math.abs((quantidade - senha.length()) * 2);
    }
}

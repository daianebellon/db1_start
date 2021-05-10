package br.com.daianebellon.original;

public class MetricaSimbolos extends MetricaDaSenha {

    @Override
    void calcula(String senha) {
        String[] chars = senha.replaceAll("\\s+", "").split("\\s*");
        int total = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i].matches("[^a-zA-Z0-9_]")){
                total++;
            }
        }
        quantidade = total;
        bonus = (quantidade * 6);
    }
}
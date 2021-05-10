package br.com.daianebellon.original;

public class MetricaCaracteres extends MetricaDaSenha {

    @Override
    void calcula(String senha) {
        quantidade = senha.length();
        bonus = quantidade * 4;
    }
}

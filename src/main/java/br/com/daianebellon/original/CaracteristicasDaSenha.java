package br.com.daianebellon.original;

import br.com.daianebellon.original.metrica.MetricaDaSenha;

import java.util.ArrayList;
import java.util.List;

public class CaracteristicasDaSenha {

    private final List<MetricaDaSenha> metricas = new ArrayList<>();
    private Complexidade complexidade;
    private int score;
    private final String senha;

    public CaracteristicasDaSenha(String senha) {
        this.senha = senha;
    }

    public void adicionaMetrica(MetricaDaSenha metricaDaSenha){
        metricaDaSenha.calcula(this.senha);
        this.metricas.add(metricaDaSenha);
        this.calculaScore();
        this.calculaComplexidade();
    }

    private void calculaScore() {
        this.score = metricas.stream()
                .mapToInt(metrica -> metrica.getBonus())
                .sum();
    }

    private void calculaComplexidade(){
        this.complexidade = Complexidade.getComplexidade(this.score);
    }

    public int getScore() {
        return score;
    }

    public Complexidade getComplexidade() {
        return complexidade;
    }

}

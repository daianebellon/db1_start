package br.com.daianebellon.original.metrica;

/**
 * Classe que representa uma metrica da senha.
 */
public abstract class MetricaDaSenha {

    protected int bonus;
    protected int quantidade;

    public abstract void calcula(String senha);

    public int getQuantidade() {
        return quantidade;
    }

    public int getBonus() {
        return bonus;
    }
}

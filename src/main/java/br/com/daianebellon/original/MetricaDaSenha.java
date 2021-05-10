package br.com.daianebellon.original;

public abstract class MetricaDaSenha {
    protected int bonus;
    protected int quantidade;

    //metodo que calcula a quantidade e o bonus
    abstract void calcula(String senha);

    public int getQuantidade() {
        return quantidade;
    }

    public int getBonus() {
        return bonus;
    }
}

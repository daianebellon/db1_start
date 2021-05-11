package br.com.daianebellon.original;

public class CaracteristicasDaSenha {
    private MetricaCaracteres caracteres;
    private MetricaLetrasMinisculas letrasMinisculas;
    private MetricaLetrasMaiuscula letrasMaiuscula;
    private MetricaNumeros numeros;
    private MetricaSimbolos simbolos;
    private Complexidade complexidade;
    private MetricaDecrementaSomenteLetrasMinusculas somenteLetrasMinusculas;
    private MetricaDecrementaSomenteLetrasMaiusculas somenteletrasMaiusculas;
    private MetricaDecretementaSomenteLetras somenteletras;
    private MetricaDecrementaSomenteNumeros somentenumeros;
    private MetricaDecrementaSomenteSimbolos somenteSimbolos;
    private int score;


//preciso somar todos os scores - metodo soma score
    private void totalScore() {
        int total = 0;
        if(caracteres != null) {
            total += caracteres.getBonus();
        }
        if (letrasMinisculas != null) {
            total += letrasMinisculas.getBonus();
        }
        if (letrasMaiuscula != null) {
            total += letrasMaiuscula.getBonus();
        }
        if (numeros != null){
            total += numeros.getBonus();
        }
        if (simbolos != null){
            total += simbolos.getBonus();
        }
        if (somenteLetrasMinusculas != null){
            total -= somenteLetrasMinusculas.getBonus();
        }
        if (somenteletrasMaiusculas != null){
            total -= somenteLetrasMinusculas.getBonus();
        }
        if (somenteletras != null) {
            total -= somenteletras.getBonus();
        }
        if (somentenumeros != null){
            total -= somentenumeros.getBonus();
        }
        if (somenteSimbolos != null){
            total -= somenteSimbolos.getBonus();
        }

        this.score = total;

        this.complexidade = Complexidade.getComplexidade(this.score);
    }


    public MetricaDecrementaSomenteSimbolos getSomenteSimbolos() {
        return somenteSimbolos;
    }

    public void setSomenteSimbolos(MetricaDecrementaSomenteSimbolos somenteSimbolos) {
        this.somenteSimbolos = somenteSimbolos;
        totalScore();
    }

    public MetricaDecrementaSomenteNumeros getSomentenumeros() {
        return somentenumeros;
    }

    public void setSomentenumeros(MetricaDecrementaSomenteNumeros somentenumeros) {
        this.somentenumeros = somentenumeros;
        totalScore();
    }

    public MetricaDecretementaSomenteLetras getSomenteletras() {
        return somenteletras;
    }

    public void setSomenteLetras(MetricaDecretementaSomenteLetras somenteletras) {
        this.somenteletras = somenteletras;
        totalScore();
    }
    public MetricaDecrementaSomenteLetrasMaiusculas getSomenteletrasMaiusculas() {
        return somenteletrasMaiusculas;
    }

    public void setSomenteletrasMaiusculas(MetricaDecrementaSomenteLetrasMaiusculas somenteletrasMaiusculas) {
        this.somenteletrasMaiusculas = somenteletrasMaiusculas;
        totalScore();
    }

    public MetricaDecrementaSomenteLetrasMinusculas getSomenteLetrasMinusculas() {
        return somenteLetrasMinusculas;
    }

    public void setSomenteLetrasMinusculas(MetricaDecrementaSomenteLetrasMinusculas somenteLetrasMinusculas) {
        this.somenteLetrasMinusculas = somenteLetrasMinusculas;
        totalScore();
    }


    public MetricaCaracteres getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(MetricaCaracteres caracteres) {
        this.caracteres = caracteres;
        totalScore();
    }

    public MetricaLetrasMinisculas getLetrasMinisculas() {
        return letrasMinisculas;
    }

    public void setLetrasMinisculas(MetricaLetrasMinisculas letrasMinisculas) {
        this.letrasMinisculas = letrasMinisculas;
        totalScore();
    }

    public MetricaLetrasMaiuscula getLetrasMaiuscula() {
        return letrasMaiuscula;
    }

    public void setLetrasMaiuscula(MetricaLetrasMaiuscula letrasMaiuscula) {
        this.letrasMaiuscula = letrasMaiuscula;
        totalScore();
    }

    public MetricaNumeros getNumeros() {
        return numeros;
    }

    public void setNumeros(MetricaNumeros numeros) {
        this.numeros = numeros;
        totalScore();
    }

    public MetricaSimbolos getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(MetricaSimbolos simbolos) {
        this.simbolos = simbolos;
        totalScore();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Complexidade getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(Complexidade complexidade) {
        this.complexidade = complexidade;
    }

}

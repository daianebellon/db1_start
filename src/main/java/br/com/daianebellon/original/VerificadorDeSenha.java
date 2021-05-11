package br.com.daianebellon.original;

public class VerificadorDeSenha {

    public static CaracteristicasDaSenha getCaracteristicas(String senha){
        CaracteristicasDaSenha caracteristicasDaSenha = new CaracteristicasDaSenha();

        MetricaCaracteres metricaCaracteres = new MetricaCaracteres();
        metricaCaracteres.calcula(senha);
        caracteristicasDaSenha.setCaracteres(metricaCaracteres);

        MetricaLetrasMinisculas metricaLetrasMinisculas = new MetricaLetrasMinisculas();
        metricaLetrasMinisculas.calcula(senha);
        caracteristicasDaSenha.setLetrasMinisculas(metricaLetrasMinisculas);

        MetricaLetrasMaiuscula metricaLetrasMaiuscula = new MetricaLetrasMaiuscula();
        metricaLetrasMaiuscula.calcula(senha);
        caracteristicasDaSenha.setLetrasMaiuscula(metricaLetrasMaiuscula);

        MetricaNumeros metricaNumeros = new MetricaNumeros();
        metricaNumeros.calcula(senha);
        caracteristicasDaSenha.setNumeros(metricaNumeros);

        MetricaSimbolos metricaSimbolos = new MetricaSimbolos();
        metricaSimbolos.calcula(senha);
        caracteristicasDaSenha.setSimbolos(metricaSimbolos);

        MetricaDecrementaSomenteLetrasMinusculas metricaDeductionsSomenteLetrasMinusculas = new MetricaDecrementaSomenteLetrasMinusculas();
        metricaDeductionsSomenteLetrasMinusculas.calcula(senha);
        caracteristicasDaSenha.setSomenteLetrasMinusculas(metricaDeductionsSomenteLetrasMinusculas);

        MetricaDecrementaSomenteLetrasMaiusculas metricaDeductionsSomenteLetrasMaiusculas = new MetricaDecrementaSomenteLetrasMaiusculas();
        metricaDeductionsSomenteLetrasMaiusculas.calcula(senha);
        caracteristicasDaSenha.setSomenteletrasMaiusculas(metricaDeductionsSomenteLetrasMaiusculas);

        MetricaDecretementaSomenteLetras metricaDecretementaSomenteLetras = new MetricaDecretementaSomenteLetras();
        metricaDecretementaSomenteLetras.calcula(senha);
        caracteristicasDaSenha.setSomenteLetras(metricaDecretementaSomenteLetras);

        MetricaDecrementaSomenteNumeros metricaDeductionsSomenteNumeros = new MetricaDecrementaSomenteNumeros();
        metricaDeductionsSomenteNumeros.calcula(senha);
        caracteristicasDaSenha.setSomentenumeros(metricaDeductionsSomenteNumeros);

        MetricaDecrementaSomenteSimbolos metricaDeductionsSomenteSimbolos = new MetricaDecrementaSomenteSimbolos();
        metricaDeductionsSomenteSimbolos.calcula(senha);
        caracteristicasDaSenha.setSomenteSimbolos(metricaDeductionsSomenteSimbolos);


        return caracteristicasDaSenha;
    }
}


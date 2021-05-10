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

        MetricaDeductionsSomenteLetrasMinusculas metricaDeductionsSomenteLetrasMinusculas = new MetricaDeductionsSomenteLetrasMinusculas();
        metricaDeductionsSomenteLetrasMinusculas.calcula(senha);
        caracteristicasDaSenha.setSomenteLetrasMinusculas(metricaDeductionsSomenteLetrasMinusculas);

        MetricaDeductionsSomenteLetrasMaiusculas metricaDeductionsSomenteLetrasMaiusculas = new MetricaDeductionsSomenteLetrasMaiusculas();
        metricaDeductionsSomenteLetrasMaiusculas.calcula(senha);
        caracteristicasDaSenha.setSomenteletrasMaiusculas(metricaDeductionsSomenteLetrasMaiusculas);

        MetricaDeductionsSomenteNumeros metricaDeductionsSomenteNumeros = new MetricaDeductionsSomenteNumeros();
        metricaDeductionsSomenteNumeros.calcula(senha);
        caracteristicasDaSenha.setSomentenumeros(metricaDeductionsSomenteNumeros);

        MetricaDeductionsSomenteSimbolos metricaDeductionsSomenteSimbolos = new MetricaDeductionsSomenteSimbolos();
        metricaDeductionsSomenteSimbolos.calcula(senha);
        caracteristicasDaSenha.setSomenteSimbolos(metricaDeductionsSomenteSimbolos);


        return caracteristicasDaSenha;
    }
}


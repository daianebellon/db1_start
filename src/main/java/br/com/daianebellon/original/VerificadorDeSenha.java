package br.com.daianebellon.original;

import br.com.daianebellon.original.metrica.decrementa.MetricaDecrementaQuandoSomenteLetrasMaiusculas;
import br.com.daianebellon.original.metrica.decrementa.MetricaDecrementaQuandoSomenteLetrasMinusculas;
import br.com.daianebellon.original.metrica.decrementa.MetricaDecrementaQuandoSomenteNumeros;
import br.com.daianebellon.original.metrica.decrementa.MetricaDecrementaQuandoSomenteSimbolos;
import br.com.daianebellon.original.metrica.incrementa.*;

public class VerificadorDeSenha {

    public static CaracteristicasDaSenha getCaracteristicas(String senha){
        final CaracteristicasDaSenha caracteristicas = new CaracteristicasDaSenha(senha);

        caracteristicas.adicionaMetrica(new MetricaCaracteres());
        caracteristicas.adicionaMetrica(new MetricaLetrasMinisculas());
        caracteristicas.adicionaMetrica(new MetricaLetrasMaiuscula());
        caracteristicas.adicionaMetrica(new MetricaNumeros());
        caracteristicas.adicionaMetrica(new MetricaSimbolos());
        caracteristicas.adicionaMetrica(new MetricaDecrementaQuandoSomenteLetrasMinusculas());
        caracteristicas.adicionaMetrica(new MetricaDecrementaQuandoSomenteLetrasMaiusculas());
        caracteristicas.adicionaMetrica(new MetricaDecrementaQuandoSomenteNumeros());
        caracteristicas.adicionaMetrica(new MetricaLetrasMinisculas());
        caracteristicas.adicionaMetrica(new MetricaDecrementaQuandoSomenteSimbolos());

        return caracteristicas;
    }
}


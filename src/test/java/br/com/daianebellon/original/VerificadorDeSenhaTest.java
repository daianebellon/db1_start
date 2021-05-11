package br.com.daianebellon.original;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VerificadorDeSenhaTest {

    @Test
    void getCaracteristicas01() {
        CaracteristicasDaSenha caracteristicas = VerificadorDeSenha.getCaracteristicas("@123@");

        assertEquals(3, caracteristicas.getNumeros().getQuantidade());
        assertEquals(2, caracteristicas.getSimbolos().getQuantidade());
        assertEquals(Complexidade.FORTE, caracteristicas.getComplexidade());
        assertEquals(0, caracteristicas.getLetrasMaiuscula().getQuantidade());
        assertEquals(0, caracteristicas.getLetrasMinisculas().getQuantidade());
        assertEquals(0, caracteristicas.getSomentenumeros().getQuantidade());
        assertEquals(0, caracteristicas.getSomenteSimbolos().getQuantidade());
        assertEquals(0, caracteristicas.getSomenteletras().getQuantidade());

    }

    @Test
    void getCaracteristicas02() {

        CaracteristicasDaSenha caracteristicas = VerificadorDeSenha.getCaracteristicas("12345");

        assertEquals(5, caracteristicas.getNumeros().getQuantidade());
        assertEquals(0, caracteristicas.getSimbolos().getQuantidade());
        assertEquals(Complexidade.BOM, caracteristicas.getComplexidade());
        assertEquals(5, caracteristicas.getSomentenumeros().getQuantidade());
        assertEquals(0, caracteristicas.getLetrasMaiuscula().getQuantidade());
        assertEquals(0, caracteristicas.getLetrasMinisculas().getQuantidade());
        assertEquals(0, caracteristicas.getSomenteletras().getQuantidade());

    }
    @Test
    void getCaracteristicas03() {

        CaracteristicasDaSenha caracteristicas = VerificadorDeSenha.getCaracteristicas("A12@34*5Bfj");

        assertEquals(5, caracteristicas.getNumeros().getQuantidade());
        assertEquals(2, caracteristicas.getSimbolos().getQuantidade());
        assertEquals(2, caracteristicas.getLetrasMaiuscula().getQuantidade());
        assertEquals(2, caracteristicas.getLetrasMinisculas().getQuantidade());
        assertEquals(Complexidade.MUITO_FORTE, caracteristicas.getComplexidade());
        assertEquals(0, caracteristicas.getSomentenumeros().getQuantidade());
        assertEquals(0, caracteristicas.getSomenteletrasMaiusculas().getBonus());
        assertEquals(0, caracteristicas.getSomenteLetrasMinusculas().getBonus());
        assertEquals(0, caracteristicas.getSomenteletras().getQuantidade());
    }

    @Test
    void getCaracteristicas04() {

        CaracteristicasDaSenha caracteristicas = VerificadorDeSenha.getCaracteristicas("ABDHU");

        assertEquals(0, caracteristicas.getNumeros().getQuantidade());
        assertEquals(0, caracteristicas.getSimbolos().getQuantidade());
        assertEquals(5, caracteristicas.getLetrasMaiuscula().getQuantidade());
        assertEquals(0, caracteristicas.getLetrasMinisculas().getQuantidade());
        assertEquals(Complexidade.MUITO_FRACO, caracteristicas.getComplexidade());
        assertEquals(0, caracteristicas.getSomentenumeros().getQuantidade());
        assertEquals(10, caracteristicas.getSomenteletrasMaiusculas().getBonus());
        assertEquals(0, caracteristicas.getSomenteLetrasMinusculas().getBonus());
        assertEquals(5, caracteristicas.getSomenteletras().getQuantidade());
    }

    @Test
    void getCaracteristicas05() {

        CaracteristicasDaSenha caracteristicas = VerificadorDeSenha.getCaracteristicas("daianebellon");

        assertEquals(0, caracteristicas.getNumeros().getQuantidade());
        assertEquals(0, caracteristicas.getSimbolos().getQuantidade());
        assertEquals(0, caracteristicas.getLetrasMaiuscula().getQuantidade());
        assertEquals(12, caracteristicas.getLetrasMinisculas().getQuantidade());
        assertEquals(Complexidade.MUITO_FRACO, caracteristicas.getComplexidade());
        assertEquals(0, caracteristicas.getSomentenumeros().getQuantidade());
        assertEquals(0, caracteristicas.getSomenteletrasMaiusculas().getBonus());
        assertEquals(24, caracteristicas.getSomenteLetrasMinusculas().getBonus());
        assertEquals(12, caracteristicas.getSomenteletras().getQuantidade());
    }

    @Test
    void getCaracteristicas06() {

        CaracteristicasDaSenha caracteristicas = VerificadorDeSenha.getCaracteristicas("*@daiane@*");

        assertEquals(0, caracteristicas.getNumeros().getQuantidade());
        assertEquals(4, caracteristicas.getSimbolos().getQuantidade());
        assertEquals(0, caracteristicas.getLetrasMaiuscula().getQuantidade());
        assertEquals(6, caracteristicas.getLetrasMinisculas().getQuantidade());
        assertEquals(Complexidade.MUITO_FORTE, caracteristicas.getComplexidade());
        assertEquals(0, caracteristicas.getSomentenumeros().getQuantidade());
        assertEquals(0, caracteristicas.getSomenteletrasMaiusculas().getBonus());
        assertEquals(0, caracteristicas.getSomenteLetrasMinusculas().getBonus());
        assertEquals(0, caracteristicas.getSomenteletras().getQuantidade());
    }
}


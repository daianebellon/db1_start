package br.com.daianebellon.original;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordMeterV1Test {

    @Test
    void checkPassword() {

        var resultadoEsperado = "Password: @123@\n" +
                "Score: 42\n" +
                "Complexity: Good\n" +
                "Addictions\n" +
                "[C: 5 | B: 20] Number of Characters\n" +
                "[C: 0 | B: 0] Uppercase Letters\n" +
                "[C: 0 | B: 0] Lowercase Letters\n" +
                "[C: 3 | B: 12] Numbers\n" +
                "[C: 2 | B: 12] Symbols\n" +
                "[C: 3 | B: 6] Middle Numbers or Symbols\n" +
                "[C: 2 | B: 0] Requirements\n" +
                "Deductions\n" +
                "[C: 0 | B: 0] Letters Only\n" +
                "[C: 0 | B: 0] Numbers Only\n" +
                "[C: 2 | B: 1] Repeat Characters (Case Insensitive)\n" +
                "[C: 0 | B: 0] Consecutive Uppercase Letters\n" +
                "[C: 0 | B: 0] Consecutive Lowercase Letters\n" +
                "[C: 2 | B: 4] Consecutive Numbers\n" +
                "[C: 0 | B: 0] Sequential Letters\n" +
                "[C: 1 | B: 3] Sequential Numbers\n" +
                "[C: 0 | B: 0] Sequential Symbols";


        PasswordMeterV1 meter = new PasswordMeterV1();

        meter.checkPassword("@123@");

        assertEquals(resultadoEsperado, meter.toString());
    }
}

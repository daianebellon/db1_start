package br.com.daianebellon.original;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComplexidadeTest {

    @Test
    void getComplexidadeTest1() {
        Complexidade complexidade = Complexidade.getComplexidade(30);
        assertEquals(Complexidade.FRACO, complexidade);
    }
    @Test
    void getComplexidadeTest2() {
        Complexidade complexidade = Complexidade.getComplexidade(10);
        assertEquals(Complexidade.MUITO_FRACO, complexidade);
    }
    @Test
    void getComplexidadeTest3() {
        Complexidade complexidade = Complexidade.getComplexidade(47);
        assertEquals(Complexidade.BOM, complexidade);
    }
    @Test
    void getComplexidadeTest4() {
        Complexidade complexidade = Complexidade.getComplexidade(65);
        assertEquals(Complexidade.FORTE, complexidade);
    }
    @Test
    void getComplexidadeTest5() {
        Complexidade complexidade = Complexidade.getComplexidade(80);
        assertEquals(Complexidade.MUITO_FORTE, complexidade);
    }


}

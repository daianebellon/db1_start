package br.com.daianebellon.original;

public enum Complexidade {
    MUITO_FRACO,
    FRACO,
    BOM,
    FORTE,
    MUITO_FORTE;

    /**
     * Metodo que devolve a complexidade com base no score.
     * @param score score calculado a partir da quantidade de bonus.
     * @return complexidade.
     */
    public static Complexidade getComplexidade(int score){

        if (score < 20) {
            return MUITO_FRACO;
        } else if (score < 40) {
           return FRACO;
        } else if (score < 60) {
            return BOM;
        } else if (score < 80) {
            return FORTE;
        } else {
            return MUITO_FORTE;
        }
    }
}

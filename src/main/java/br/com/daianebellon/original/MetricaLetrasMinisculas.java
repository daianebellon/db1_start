package br.com.daianebellon.original;

public class MetricaLetrasMinisculas extends MetricaDaSenha{

    @Override
    void calcula(String senha) { //calcula a quantidade de letras minusculas e o bonus total dessa categoria
        char[] chars = senha.toCharArray(); // cria um arrey de caracteres

        int total = 0; //total = quantidade de caracteres que são letras minusculas
        for (int i = 0; i < chars.length; i++) { //verifica se tem letra minuscula e incrementa no total
            char c = chars[i];
            if (Character.isLowerCase(c)) { //verifica se "c" é uma letra minuscula
                total++;
            }
        }
        quantidade = total;
        bonus = Math.abs((quantidade - senha.length()) * 2); //calcula quantidade total de bonus

    }
}


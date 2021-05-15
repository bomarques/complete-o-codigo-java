package br.com.felixgilioli.exercicios.facil;

import java.util.Arrays;

/**
 * Classe com métodos para calculos matemáticos.
 */
public class Calculadora {

    private Calculadora() {}

    /**
     * Deve calcular a média do array de números inteiros e retorna-la.
     * @param ints array de números inteiros.
     * @return média dos inteiros.
     */
    public static double getMedia(int[] ints) {
        double media ;
        double soma = 0;
        for(int i = 0; i < ints.length;){
            soma += ints[i];
            i++;
        } media = soma / ints.length;
        return media;
    }

    /**
     * Deve retornar qual o maior número dentre {@param a} e {@param b}.
     * @param a primeiro número.
     * @param b segundo número.
     * @return o maior número.
     */
    public static int getMaior(int a, int b) {
        int result;
        if(a < b){
            result = b;
        }else {
            result = a;
        }
        return result;
    }

    /**
     * Deve retornar a raíz quadrada do inteiro recebido.
     * @param n número inteiro.
     * @return raíz quadrada do {@param n}.
     */
    public static double getRaizQuadrada(int n) {
        double raiz = Math.sqrt(n);
        return raiz;
    }

    /**
     * Deve retornar o valor absoluto do inteiro {@param n}, ou seja,
     * se ele for um número negativo deve tranforma-lo para positivo.
     * @param n número inteiro.
     * @return valor absoluto.
     */
    public static int getAbsoluto(int n) {
        double absoluto = Math.abs(n);
        return (int) absoluto;
    }

}

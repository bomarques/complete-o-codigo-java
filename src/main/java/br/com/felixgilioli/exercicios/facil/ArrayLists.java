package br.com.felixgilioli.exercicios.facil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe com métodos para trabalhar com listas do tipo {@link java.util.ArrayList}.
 */
public class ArrayLists {

    private ArrayLists() {}

    /**
     * Deve filtrar os elementos de {@param numeros} e retornar apenas os números que são impares.
     * @param numeros lista de inteiros.
     * @return lista de inteiros apenas com números impares.
     */
    public static List<Integer> getImpares(List<Integer> numeros) {
        List<Integer> impares = new ArrayList<>();
        for(int n = 0; n < numeros.size();){
            if (numeros.get(n) % 2 == 1 ){
                impares.add(numeros.get(n));
                n ++;
            } else {
                n++;
            }
        }
        return impares ;
    }

    /**
     * Deve retornar a quantidade de pessoas que começam com a letra {@param letra}
     * @param pessoas lista contendo o nome das pessoas, ex: ["Felix", "Daiane"].
     * @param letra letra na qual deve você retornar a quantidade dos nomes que começam com ela, ex: "F"
     * @return quantidade de pessoas.
     */
    public static long getQuantidadeDePessoasQueComecamComALetra(List<String> pessoas, String letra) {
        long palavras = 0;
        for (int i = 0; i < pessoas.size();){
            String pessoa = pessoas.get(i);
            char letra1 = pessoa.charAt(0);
            char letraP = letra.charAt(0);
            if (Character.compare(letra1,letraP) == 0){
                palavras ++;
                i++;
            } else {
                i++;
            }

        }
        return palavras;
    }
}

package br.com.felixgilioli.exercicios.facil;

/**
 * Classe com métodos para trabalhar com booleanos.
 */
public class Booleanos {

    private Booleanos() {}

    /**
     * Deve retornar false caso o {@param bool} seja nulo,
     * caso não seja, deve retornar ele mesmo.
     * @param bool valor booleano.
     * @return valor booleano não nulo.
     */
    public static Boolean falseIfNull(Boolean bool) {
        if (bool == null){
            bool = false;
        } else {
            bool = bool;
        }
        return bool;
    }
}

package cc3002.tarea1;
/**
 * Se define la Pokemon a partir de Carta, la cual posee
 * un nombre, puntos de vida, un numero de identificacion,
 * una lista de ataques y la lista de energias equipadas a este.
 */

import java.util.ArrayList;
import java.util.HashMap;

abstract public class Pokemon extends Carta implements IPokemon  {
    protected String name;
    public int healthPoints;
    public int nroPokedex;
    public ArrayList<Ataque> ataques;
    public HashMap<String,Integer> listaEnergias;



    /**
     * Representa la salida de combate de un pokemon cuando este ya no puede continuar
     * debido a que sus puntos de vida se agotaron.
     * este cambia su estado a K.O y es removido del campo de juego para ser reemplazado
     * por un cc3002.tarea1.Pokemon de la banca.
     */
    public void dead(Entrenador entrenador){

        entrenador.pokemonActivo= entrenador.banca.get(0);
        entrenador.banca.remove(entrenador.pokemonActivo);
        entrenador.cementerio.add(this);

    }

    /**
     * Representa cuando un pokemon entra a la banca, siendo removido de la mano del entrenador
     * a menos que la banca este llena.
     */
    @Override
    public void serJugada(Entrenador entrenador){
        entrenador.jugarPkmn(this);
    }

}

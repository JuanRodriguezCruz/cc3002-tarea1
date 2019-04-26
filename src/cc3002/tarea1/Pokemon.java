package cc3002.tarea1; /**
 * Se define la clase cc3002.tarea1.Pokemon a partir de la entidad cc3002.tarea1.Carta, la cual posee
 * un nombre, puntos de vida, un numero de identificacion,
 * debilidades y fortalezas de acuerdo a su elemento
 * 4 ataques y la lista de energias equipadas a este.
 */

import java.util.ArrayList;
import java.util.HashMap;

abstract class Pokemon extends Carta  {
    protected String name;
    public int healthPoints;
    public int nroPokedex;
    public ArrayList<Ataque> ataques;
    protected HashMap<String,Integer> listaEnergias;
    /*Todas las clases que no voy a instancear deben ser abstractas*/

    /**
     * Representa la accion de atacar de un cc3002.tarea1.Pokemon a otro
     * @param ataque es el ataque usado por el pokemon
     * @param pkmn es el pokemon objetivo el cual recibira el ataque
     */
    public void attack(Ataque ataque, Pokemon pkmn) {

    }
    public void recievePsyquicAttack(Ataque ataque){

    }
    public void recieveFireAttack(Ataque ataque){

    }
    public void recieveWaterAttack(Ataque ataque){

    }
    public void recieveLeafAttack(Ataque ataque){

    }
    public void recieveFightAttack(Ataque ataque){

    }
    public void recieveThunderAttack(Ataque ataque){

    }

    /**
     * Representa la salida de combate de un pokemon cuando este ya no puede continuar
     * debido a que sus puntos de vida se agotaron.
     * este cambia su estado a K.O y es removido del campo de juego para ser reemplazado
     * por un cc3002.tarea1.Pokemon de la banca.
     */
    public void dead(){

        entrenador.pokemonActivo= entrenador.banca.get(0);
        entrenador.banca.remove(entrenador.pokemonActivo);
        entrenador.cementerio.add(this);

    }

    /**
     * Representa cuando un pokemon entra a la banca, siendo removido de la mano del entrenador
     * a menos que la banca este llena.
     */
    @Override
    public void serJugada(){
        this.entrenador.jugarPkmn(this);
    }

}

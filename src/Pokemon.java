/**
 * Se define la clase Pokemon a partir de la entidad Carta, la cual posee
 * un nombre, puntos de vida, un numero de identificacion,
 * debilidades y fortalezas de acuerdo a su elemento
 * 4 ataques y la lista de energias equipadas a este.
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Pokemon extends Carta  {
    protected String name;
    private int healthPoints;
    private int nroPokedex;
    private ArrayList<String> debilidades;
    private ArrayList<String> fortalezas;
    protected Ataque ataque1;
    protected Ataque ataque2;
    protected Ataque ataque3;
    protected Ataque ataque4;
    protected HashMap<String,Integer> listaEnergias;
    /*Todas las clases que no voy a instancear deben ser abstractas*/

    /**
     * Representa la accion de atacar de un Pokemon a otro
     * @param ataque es el ataque usado por el pokemon
     * @param objetivo es el pokemon objetivo el cual recibira el ataque
     */
    protected void atacar(Ataque ataque, Pokemon objetivo){
        String enemyElement= objetivo.elemento;
        String element= this.elemento;
        if (ataque.cost<=this.listaEnergias.get(element)){
            /*double dispatch*/
            if (this.debilidades.contains(enemyElement)){
                ataque.damage= ataque.damage-30;
                }
            if (this.fortalezas.contains(enemyElement)){
                ataque.damage= ataque.damage*2;
            }
            objetivo.healthPoints= objetivo.healthPoints-ataque.damage;
            if (objetivo.healthPoints<1){
                objetivo.dead();
            }
        }
        else {
            System.out.println("El pokemon no posee las energias necesarias.");
        }
    }

    /**
     * Representa la salida de combate de un pokemon cuando este ya no puede continuar
     * debido a que sus puntos de vida se agotaron.
     * este cambia su estado a K.O y es removido del campo de juego para ser reemplazado
     * por un Pokemon de la banca.
     */
    private void dead(){
        this.status= "K.O";
        entrenador.pokemonActivo= entrenador.banca.get(0);
        entrenador.banca.remove(entrenador.pokemonActivo);
    }

    /**
     * Representa cuando un pokemon entra a la banca, siendo removido de la mano del entrenador
     * a menos que la banca este llena.
     */
    public void playPokemon(){
        if(this.entrenador.banca.size()<5) {
            this.entrenador.hand.remove(this);
            this.entrenador.banca.add(this);
            this.status = "Banca";
        }
        else{
            System.out.println("La banca esta llena.");
        }
    }

}

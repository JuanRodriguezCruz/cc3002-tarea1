package cc3002.tarea1;

import java.util.ArrayList;

public class FirePkmn extends Pokemon {
    /**
     * Constructor de la clase FirePkmn
     * @param str nombre del pokemon
     * @param hp puntos de vida del pokemon
     * @param id numero de identificacion del pokemon
     * @param atks lista de ataques del pokemon
     */
    public FirePkmn(String str, int hp, int id, ArrayList<Ataque> atks){
        this.name= str;
        this.healthPoints= hp;
        this.nroPokedex=id;
        this.ataques= atks;
    }

    public FirePkmn() {

    }

    /**
     * Double dispatch que manda el mensaje al pokemon enemigo que esta siendo atacado por
     * un pokemon de fuego
     * @param ataque ataque el cual recibe el pokemon enemigo
     * @param pkmn pokemon enemigo que recibira el ataque
     */
    @Override
    public void attack(Ataque ataque, Pokemon pkmn) {
        pkmn.recieveFireAttack(ataque);
    }
    /**
     * Double dispatch que recibe el mensaje que el pokemon esta recibiendo
     * daño del tipo trueno
     * @param ataque ataque que es recibido
     */

    @Override
    public void recieveThunderAttack(Ataque ataque) {
        this.healthPoints=healthPoints-ataque.damage;
        if (this.healthPoints<1){
            this.dead(this.entrenador);
        }
    }
    /**
     * Double dispatch que recibe el mensaje que el pokemon esta recibiendo
     * daño del tipo planta
     * @param ataque ataque que es recibido
     */

    @Override
    public void recieveLeafAttack(Ataque ataque) {
        this.healthPoints=healthPoints-ataque.damage;
        if (this.healthPoints<1){
            this.dead(this.entrenador);
        }
    }
    /**
     * Double dispatch que recibe el mensaje que el pokemon esta recibiendo
     * daño del tipo psiquico
     * @param ataque ataque que es recibido
     */

    @Override
    public void recievePsyquicAttack(Ataque ataque) {
        this.healthPoints=healthPoints-ataque.damage;
        if (this.healthPoints<1){
            this.dead(this.entrenador);
        }
    }
    /**
     * Double dispatch que recibe el mensaje que el pokemon esta recibiendo
     * daño del tipo fuego
     * @param ataque ataque que es recibido
     */

    @Override
    public void recieveFireAttack(Ataque ataque) {
        this.healthPoints=healthPoints-ataque.damage;
        if (this.healthPoints<1){
            this.dead(this.entrenador);
        }
    }
    /**
     * Double dispatch que recibe el mensaje que el pokemon esta recibiendo
     * daño del tipo lucha
     * @param ataque ataque que es recibido
     */

    @Override
    public void recieveFightAttack(Ataque ataque) {
        this.healthPoints=healthPoints-ataque.damage;
        if (this.healthPoints<1){
            this.dead(this.entrenador);
        }
    }
    /**
     * Double dispatch que recibe el mensaje que el pokemon esta recibiendo
     * daño del tipo agua
     * @param ataque ataque que es recibido
     */

    @Override
    public void recieveWaterAttack(Ataque ataque) {
        this.healthPoints=healthPoints-(ataque.damage*2);
        if (this.healthPoints<1){
            this.dead(this.entrenador);
        }
    }
}

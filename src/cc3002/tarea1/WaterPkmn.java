package cc3002.tarea1;

import java.util.ArrayList;

public class WaterPkmn extends Pokemon {
    public WaterPkmn() {

    }


    /**
     * Constructor de la clase WaterPkmn
     * @param str nombre del pokemon
     * @param hp puntos de vida del pokemon
     * @param id numero de identificacion del pokemon
     * @param atks lista de ataques del pokemon
     */
    public WaterPkmn(String str, int hp, int id, ArrayList<Ataque> atks){
        this.name= str;
        this.healthPoints= hp;
        this.nroPokedex=id;
        this.ataques= atks;
    }

    /**
     * Double dispatch que manda el mensaje al pokemon enemigo que esta siendo atacado por
     * un pokemon de agua
     * @param ataque ataque el cual recibe el pokemon enemigo
     * @param pkmn pokemon enemigo que recibira el ataque
     */

    @Override
    public void attack(Ataque ataque, Pokemon pkmn) {
        pkmn.recieveWaterAttack(ataque);
    }

    /**
     * Double dispatch que recibe el mensaje que el pokemon esta recibiendo
     * daño del tipo lucha
     * @param ataque ataque que es recibido, el cual se ve reducido por la resistencia del pokemon
     */

    @Override
    public void recieveFightAttack(Ataque ataque) {
        this.healthPoints=healthPoints-(ataque.damage-30);
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
        this.healthPoints=healthPoints-ataque.damage;
        if (this.healthPoints<1){
            this.dead(this.entrenador);
        }

    }

    /**
     * Double dispatch que recibe el mensaje que el pokemon esta recibiendo
     * daño del tipo fuego
     * @param ataque ataque que es recibido por el pokemon
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
     * daño del tipo psiquico
     * @param ataque ataque que es recibido por el pokemon
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
     * daño del tipo hoja
     * @param ataque ataque que es recibido por el pokemon, el cual se ve duplicado por ser debilidad
     */

    @Override
    public void recieveLeafAttack(Ataque ataque) {
        this.healthPoints=healthPoints-(ataque.damage*2);
        if (this.healthPoints<1){
            this.dead(this.entrenador);
        }
    }

    /**
     * Double dispatch que recibe el mensaje que el pokemon esta recibiendo
     * daño del tipo trueno
     * @param ataque ataque que es recibido por el pokemon, en el cual se ve duplicado por ser debilidad
     */

    @Override
    public void recieveThunderAttack(Ataque ataque) {
        this.healthPoints=healthPoints-(ataque.damage*2);
        if (this.healthPoints<1){
            this.dead(this.entrenador);
        }
    }
}

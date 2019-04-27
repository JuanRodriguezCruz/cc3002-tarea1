package cc3002.tarea1;

import java.util.ArrayList;


public class Entrenador {
     public ArrayList<Carta> hand;
     public ArrayList<Pokemon> banca;
     public ArrayList<Carta> cementerio;
     public Pokemon pokemonActivo;
     public Entrenador(){
         hand = new ArrayList<>();
         banca=new ArrayList<>();
         cementerio = new ArrayList<>();
     }

     public void jugarCarta(int indexOfHand){
         Carta card=this.hand.get(indexOfHand);
         card.serJugada(this);
     }

     /**
      * Representa la seleccion de ataques por parte del cc3002.tarea1.Entrenador
      * para que su cc3002.tarea1.Pokemon activo lo ejecute, teniendo en cuenta que el cc3002.tarea1.Pokemon posee entre 1 y 4 ataques
      * Para que se lleve acabo el ataque el cc3002.tarea1.Entrenador debe escribir un ataque conocido por el cc3002.tarea1.Pokemon activo
      *
      * @param enemy es el cc3002.tarea1.Pokemon enemigo al cual ira dirigido el ataque
      */

     public void selectAtk(Pokemon enemy, int indexOfAttack) {
         if (indexOfAttack > this.pokemonActivo.ataques.size()){
             System.out.println("Ataque no valido.");
         }
         else {
         }

     }

     public void jugarPkmn(Pokemon pkmn) {
         if (this.banca.isEmpty()){
             this.hand.remove(pkmn);
             this.pokemonActivo= pkmn;
         }

         else if (!this.banca.isEmpty()){
            this.hand.remove(pkmn);
            this.banca.add(pkmn);

         }
         else{
             System.out.println("La banca esta llena");
         }
     }
     public void jugarEnergia(Energia energy, Pokemon pkmn){
         if(pkmn.equals(pokemonActivo)){
             if(pkmn.listaEnergias.containsKey(energy.elemento)){
                 pkmn.listaEnergias.put(energy.elemento,pkmn.listaEnergias.get(energy.elemento)+1);
             }
             else{
                 pkmn.listaEnergias.put(energy.elemento,1);
             }
         }
         else{
             System.out.println("Movimiento no valido");
         }

     }
 }
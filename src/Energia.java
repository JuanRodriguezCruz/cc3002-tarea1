/**
 * Clase Energia que se desprende de la entidad Carta
 */
public class Energia extends Carta {
    /**
     * Representa cuando un entrenador le equipa una energia a un Pokemon
     * siendo esta removida de la mano.
     * @param pkmn es el Pokemon al cual se le equipa la energia.
     */
    public void jugarEnergia(Pokemon pkmn){
        this.entrenador.hand.remove(this);
        this.status="Equipped";
        if(pkmn.listaEnergias.containsKey(this.elemento)){
            pkmn.listaEnergias.put(this.elemento,pkmn.listaEnergias.get(this.elemento)+1);
        }
        else{
            pkmn.listaEnergias.put(this.elemento,1);
        }

    }
}

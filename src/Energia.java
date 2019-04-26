public class Energia extends Carta {

    public void jugarEnergia(Pokemon pkmn){
        this.entrenador.hand.remove(this);
        this.status="Battle";
        if(pkmn.listaEnergias.containsKey(this.elemento)){
            pkmn.listaEnergias.put(this.elemento,pkmn.listaEnergias.get(this.elemento)+1);
        }
        else{
            pkmn.listaEnergias.put(this.elemento,1);
        }

    }
}

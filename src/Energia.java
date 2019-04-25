public class Energia extends Carta {

    public void jugarEnergia(Pokemon pkmn){
        this.entrenador.hand.remove(this);
        this.status="Battle";
        pkmn.listaEnergias.add(this);

    }
}

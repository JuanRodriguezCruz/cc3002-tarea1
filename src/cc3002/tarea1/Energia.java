package cc3002.tarea1;

/**
 * Clase cc3002.tarea1.Energia que se desprende de la entidad cc3002.tarea1.Carta
 */
public class Energia extends Carta {
    public String elemento;
    @Override
    public void serJugada(){
        this.entrenador.jugarEnergia(this, this.entrenador.pokemonActivo);
    }
}

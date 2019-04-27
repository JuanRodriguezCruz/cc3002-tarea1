package cc3002.tarea1;

/**
 * Clase cc3002.tarea1.Energia que se desprende de la entidad cc3002.tarea1.Carta
 * @author Juan_Rodriguez
 */
public class Energia extends Carta {
    public String elemento;
    public Energia(){
        this.elemento= "";
    }
    public Energia(String str){
        this.elemento=str;
    }

    /**
     * se implementa el metodo definido en la interfaz ICarta
     * la cual, mediante double dispatch devuelve la llamada del entrenador
     * el cual habia jugado una carta.
     */
    @Override
    public void serJugada(Entrenador entrenador){
        entrenador.jugarEnergia(this, entrenador.pokemonActivo);
    }
}

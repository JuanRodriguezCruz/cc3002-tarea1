package cc3002.tarea1;

/**
 * Se defina la entidad cc3002.tarea1.Carta, que representa las cartas del juego.
 * Las cuales deben pertenecer a un entrenador,
 * poseer un elemento y un status que nos informa donde esta la carta.
 * @author Juan_Rodriguez
 */
abstract class Carta implements ICarta  {
    protected Entrenador entrenador;

    protected String elemento;

}

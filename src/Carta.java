/**
 * Se defina la entidad Carta, que representa las cartas del juego.
 * Las cuales deben pertenecer a un entrenador,
 * poseer un elemento y un status que nos informa donde esta la carta.
 * @author Juan_Rodriguez
 */
public class Carta extends Entidad {
    protected Entrenador entrenador;
    /*interfaz para carta en donde van los contratos de los metodos*/
    /*hacer una subclase de elemento en vez de una variable y ahi definir las fortalezas y debilidades*/
    protected String elemento;
    protected String status;
}

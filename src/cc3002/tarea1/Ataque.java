package cc3002.tarea1;

/**
 * Clase que define el ataque que puede efectuar un cc3002.tarea1.Pokemon
 * cada ataque tiene un nombre, una cantidad de daño, un costo de energias y una descripcion del ataque
 */
public class Ataque {
    public String name;
    public int damage;
    public int cost;
    public String description;

    /**
     * Constructor de Ataque
     * con todos los valores en 0 o "".
     */
    public Ataque(){
        this.name= "";
        this.damage=0;
        this.cost=0;
        this.description="";
    }
}

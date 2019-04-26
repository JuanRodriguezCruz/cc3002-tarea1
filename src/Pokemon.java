import java.util.ArrayList;
import java.util.HashMap;

public class Pokemon extends Carta  {
    protected String name;
    private int healthPoints;
    private int nroPokedex;
    private ArrayList<String> debilidades;
    private ArrayList<String> fortalezas;
    protected Ataque ataque1;
    protected Ataque ataque2;
    protected Ataque ataque3;
    protected Ataque ataque4;
    protected HashMap<String,Integer> listaEnergias;
    protected void atacar(Ataque ataque, Pokemon objetivo){
        String enemyElement= objetivo.elemento;
        String element= this.elemento;
        if (ataque.cost<=this.listaEnergias.get(element)){
            if (this.debilidades.contains(enemyElement)){
                ataque.damage= ataque.damage-30;
                }
            if (this.fortalezas.contains(enemyElement)){
                ataque.damage= ataque.damage*2;
            }
            objetivo.healthPoints= objetivo.healthPoints-ataque.damage;
            if (objetivo.healthPoints<1){
                objetivo.dead();
            }
        }
        else {
            System.out.println("El pokemon no posee las energias necesarias.");
        }
    }
    private void dead(){
        this.status= "K.O";
        entrenador.pokemonActivo= entrenador.banca.get(0);
        entrenador.banca.remove(entrenador.pokemonActivo);
    }
    public void playPokemon(){
        if(this.entrenador.banca.size()<5) {
            this.entrenador.hand.remove(this);
            this.entrenador.banca.add(this);
            this.status = "Banca";
        }
        else{
            System.out.println("La banca esta llena.");
        }
    }

}

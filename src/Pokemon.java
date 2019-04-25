import java.util.ArrayList;

public class Pokemon extends Carta  {
    public int healthPoints;
    public int nroPokedex;
    public ArrayList<String> debilidades;
    public ArrayList<String> fortalezas;
    public ArrayList<Ataque> listaAtaques;
    public ArrayList<Energia> listaEnergias;
    public void atacar(Ataque ataque, Pokemon objetivo){
        String enemyElement= objetivo.elemento;
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
    public void dead(){
        this.status= "K.O";
        entrenador.pokemonActivo= entrenador.banca.get(0);
        entrenador.banca.remove(entrenador.pokemonActivo);
    }
    public void playPokemon(){
        this.entrenador.hand.remove(this);
        this.entrenador.banca.add(this);
        this.status="Banca";
    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class Entrenador extends Entidad{
    protected ArrayList<Carta> hand;
    protected ArrayList<Pokemon> banca;
    public  Pokemon pokemonActivo;
    public void selectAtk(Pokemon enemy) {
        ArrayList<Ataque> listaAtaques = this.pokemonActivo.listaAtaques;

        Scanner atk = new Scanner(System.in);
        System.out.println("Seleccionar Ataque:");
        System.out.print(listaAtaques.get(0).name);
        System.out.print(listaAtaques.get(1).name);
        System.out.print(listaAtaques.get(2).name);
        System.out.print(listaAtaques.get(3).name);
        String attack= atk.nextLine();
        for (int i=0; i<4;i++){
            if (listaAtaques.get(i).name.equals(attack)){
                pokemonActivo.atacar(listaAtaques.get(i),enemy);
            }
        }
    }
}

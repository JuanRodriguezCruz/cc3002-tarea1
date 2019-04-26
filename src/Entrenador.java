import java.util.ArrayList;
import java.util.Scanner;

public class Entrenador extends Entidad{
    protected ArrayList<Carta> hand;
    protected ArrayList<Pokemon> banca;
    public  Pokemon pokemonActivo;
    public void selectAtk(Pokemon enemy) {
        int nAtk=1;
        Scanner atk = new Scanner(System.in);
        System.out.println("Seleccionar Ataque:");
        System.out.print(pokemonActivo.ataque1.name);
        if(!pokemonActivo.ataque2.name.equals("")){
            System.out.print(pokemonActivo.ataque2.name);
            nAtk++;
        }
        if(!pokemonActivo.ataque3.name.equals("")) {
            System.out.print(pokemonActivo.ataque3.name);
            nAtk++;
        }
        if(!pokemonActivo.ataque4.name.equals("")) {
            System.out.print(pokemonActivo.ataque4.name);
            nAtk++;
        }
        String attack= atk.nextLine();
        for (int i=0; i<nAtk;i++){
            if(i==0){
                if (pokemonActivo.ataque1.name.equals(attack)){
                    pokemonActivo.atacar(pokemonActivo.ataque1,enemy);
                }
            }
            if(i==1){
                if (pokemonActivo.ataque2.name.equals(attack)){
                    pokemonActivo.atacar(pokemonActivo.ataque2,enemy);
                }
            }
            if(i==2){
                if (pokemonActivo.ataque3.name.equals(attack)){
                    pokemonActivo.atacar(pokemonActivo.ataque3,enemy);
                }
            }
            if(i==3){
                if (pokemonActivo.ataque4.name.equals(attack)){
                    pokemonActivo.atacar(pokemonActivo.ataque4,enemy);
                }
            }
            else{
                System.out.println(pokemonActivo.name + "no conoce el ataque.");
            }
        }
    }
}

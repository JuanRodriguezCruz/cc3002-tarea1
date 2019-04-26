import java.util.ArrayList;
import java.util.Scanner;

 /**
 * Entidad Entrenador el cual posee una mano de cartas y en su mesa
  * posee una banca con Pokemon y un Pokemon en el campo de batalla
 */
public class Entrenador extends Entidad{
    protected ArrayList<Carta> hand;
    protected ArrayList<Pokemon> banca;
    public  Pokemon pokemonActivo;

     /**
      * Representa la seleccion de ataques por parte del Entrenador
      * para que su Pokemon activo lo ejecute, teniendo en cuenta que el Pokemon posee entre 1 y 4 ataques
      * Para que se lleve acabo el ataque el Entrenador debe escribir un ataque conocido por el Pokemon activo
      * @param enemy es el Pokemon enemigo al cual ira dirigido el ataque
      */
    public void selectAtk(Pokemon enemy) {
        int nAtk=1;
        /* hacerlo sin scanner, con indice*/
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

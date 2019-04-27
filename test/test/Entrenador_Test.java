package test;
import org.junit.*;
import static org.junit.Assert.*;
import cc3002.tarea1.*;
public class Entrenador_Test {
    Entrenador ash=new Entrenador();
    WaterPkmn wpkmn= new WaterPkmn();
    FirePkmn fpkmn= new FirePkmn();
    Energia fireEnergy= new Energia("Fire");
    Entrenador blue= new Entrenador();
    @Before public void setUp(){
        blue.hand.add(wpkmn);
        blue.hand.add(fpkmn);
        blue.hand.add(fireEnergy);
        blue.jugarCarta(0);
        blue.jugarCarta(0);
    }
    @Test public void constructorTest(){
        assertNull(ash.pokemonActivo);
        assertFalse(blue.hand.isEmpty());
        assertEquals(blue.pokemonActivo,wpkmn);


    }


}

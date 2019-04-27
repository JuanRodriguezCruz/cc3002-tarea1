package test;
import org.junit.*;
import static org.junit.Assert.*;
import cc3002.tarea1.*;
public class Ataque_Test {
    Ataque atk= new Ataque();
    @Test
    public void tests(){
        assertEquals(atk.damage,0);
        assertEquals(atk.cost,0);
        assertEquals(atk.name,"");
    }
}

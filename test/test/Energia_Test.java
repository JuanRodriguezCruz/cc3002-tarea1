package test;
import org.junit.*;
import static org.junit.Assert.*;
import cc3002.tarea1.*;

public class Energia_Test {

    private Energia noEnergy = new Energia();
    private Energia fireEnergy = new Energia("Fire");
    private Energia waterEnergy = new Energia("Water");
    private Energia thunderEnergy = new Energia("Thunder");
    private Energia fightEnergy = new Energia("Fight");
    private Energia psyquicEnergy = new Energia("Psyquic");
    private Energia leafEnergy = new Energia("Leaf");


    @Test
    public void testElement(){
        assertEquals(fireEnergy.elemento, "Fire" );
        assertEquals(waterEnergy.elemento, "Water");
        assertEquals(thunderEnergy.elemento, "Thunder");
        assertEquals(leafEnergy.elemento, "Leaf");
        assertEquals(fightEnergy.elemento,"Fight");
        assertEquals(psyquicEnergy.elemento, "Psyquic");
        assertEquals(noEnergy.elemento,"");

    }



}

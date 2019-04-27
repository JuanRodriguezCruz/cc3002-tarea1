package cc3002.tarea1;

public interface IPokemon {
    void attack(Ataque ataque, Pokemon pkmn);
    void recievePsyquicAttack(Ataque ataque);
    void recieveFireAttack(Ataque ataque);
    void recieveWaterAttack(Ataque ataque);
    void recieveLeafAttack(Ataque ataque);
    void recieveFightAttack(Ataque ataque);
    void recieveThunderAttack(Ataque ataque);
}

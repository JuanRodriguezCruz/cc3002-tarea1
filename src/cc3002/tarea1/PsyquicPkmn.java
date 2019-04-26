package cc3002.tarea1;

public class PsyquicPkmn extends Pokemon {


    @Override
    public void recievePsyquicAttack(Ataque ataque) {

        this.healthPoints= (healthPoints-(ataque.damage*2));
        if (this.healthPoints<1){
            this.dead();
        }

    }

    @Override
    public void recieveFightAttack(Ataque ataque) {
        int realDamage= ataque.damage-30;

        this.healthPoints= healthPoints-realDamage;

        if(this.healthPoints<1){
            this.dead();
        }

    }

    @Override
    public void recieveFireAttack(Ataque ataque) {
        this.healthPoints=healthPoints-ataque.damage;
        if (this.healthPoints<1){
            this.dead();
        }
    }

    @Override
    public void recieveLeafAttack(Ataque ataque) {
        this.healthPoints= healthPoints-ataque.damage;
        if (this.healthPoints<1){
            this.dead();
        }
    }

    @Override
    public void recieveWaterAttack(Ataque ataque) {
        this.healthPoints= healthPoints-ataque.damage;
        if (this.healthPoints<1){
            this.dead();
        }
    }

    @Override
    public void recieveThunderAttack(Ataque ataque) {
        this.healthPoints=healthPoints-ataque.damage;
        if (this.healthPoints<1){
            this.dead();
        }
    }

    @Override
    public void attack(Ataque ataque, Pokemon pkmn) {
        pkmn.recievePsyquicAttack(ataque);
    }
}

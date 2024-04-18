package Ejercicio2_Interfaces;

public class Rascal extends BasePersonage implements Personage{

    public Rascal(String name, int level, int health) {
        super(name, level, health);
    }

    public int attack(Personage objetive){
        int damage;
        if (objetive instanceof Rascal){
            damage = 20;
        } else if (objetive instanceof Wizard) {
            damage = 20;
        } else {
            damage = attack();
        }
        objetive.takeDamage(defense(damage));
        return 0;
    }

    @Override
    public int attack() {
        return 9;
    }

    @Override
    public int defense(int damage) {
        int magic_shield = 10;
        return damage - magic_shield;
    }
}

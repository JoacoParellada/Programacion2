package Ejercicio2_Interfaces;

public class Warrior extends BasePersonage implements Personage{

    public Warrior(String name, int level, int health) {
        super(name, level, health);
    }
    public int attack(Personage objetive){
        int damage;
        if (objetive instanceof Rascal){
            damage = 15;
        } else if (objetive instanceof Wizard) {
            damage = 15;
        } else {
            damage = attack();
        }
        objetive.takeDamage(defense(damage));
        return 0;
    }

    @Override
    public int attack() {
        return 12;
    }

    @Override
    public int defense(int damage) {
        int armor = 8;
        return damage - armor;
    }
}

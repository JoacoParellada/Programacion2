package Ejercicio2_Interfaces;

public class Wizard extends BasePersonage implements Personage{
    public Wizard(String name, int level, int health) {
        super(name, level, health);
    }
    public int attack(Personage objetive){
        int damage;
        if (objetive instanceof Rascal){
            damage = 22;
        } else if (objetive instanceof Wizard) {
            damage = 22;
        } else {
            damage = attack();
        }
        objetive.takeDamage(defense(damage));
        return 0;
    }

    @Override
    public int attack() {
        return 10;
    }

    @Override
    public int defense(int damage) {
        int magic_armor = 8;
        return damage - magic_armor;
    }
}

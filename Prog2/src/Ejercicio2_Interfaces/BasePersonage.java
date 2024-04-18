package Ejercicio2_Interfaces;

public abstract class BasePersonage implements Personage{
    protected String name;
    protected int level;
    protected int health;

    public BasePersonage(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int defense(int damage) {
        return 0;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;

        }
    }
}

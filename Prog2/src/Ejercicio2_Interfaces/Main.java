package Ejercicio2_Interfaces;
import Ejercicio2_Interfaces.BasePersonage;
import Ejercicio2_Interfaces.Warrior;
import Ejercicio2_Interfaces.Wizard;
import Ejercicio2_Interfaces.Rascal;


public class Main {
    public static void main(String[] args) {
        Warrior guerrero = new Warrior("Rocco",1,100);
        Wizard mago = new Wizard("Mario",1,110);
        Rascal picaro = new Rascal("Dobby",1,90);


        mago.attack(picaro);
        System.out.println("Salud picaro, luego del ataque del mago: "+picaro.getHealth());
        picaro.attack(mago);
        System.out.println("Salud mago, luego del ataque del picaro: "+mago.getHealth());
        guerrero.attack(mago);
        System.out.println("Salud mago, luego del ataque del guerrero: "+mago.getHealth());
        guerrero.attack(picaro);
        System.out.println("Salud picaro, luego del ataque del guerrero: "+picaro.getHealth());
        guerrero.attack(picaro);
        System.out.println("Salud guerrero, luego del ataque del mago: "+guerrero.getHealth());
        mago.attack(guerrero);
        System.out.println("Salud guerrero, luego del ataque del picaro: "+guerrero.getHealth());
        picaro.attack(guerrero);


    }
}

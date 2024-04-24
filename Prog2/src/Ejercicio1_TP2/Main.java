package Ejercicio1_TP2;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TiendaMascotas tienda = new TiendaMascotas();

        Perro perro1 = new Perro("Roco",2,"Perro",250.0,"Golden",true);
        Gato gato1 = new Gato("Milo",4,"Gato",180.0,"Siamés",true);
        Ave ave1 = new Ave("Blue",2,"Ave",280.0,"Guacamayo",true);
        Pez pez1 = new Pez("Nemo",1,"Pez",300.0,"Payaso","Naranja, negro, blanco");

        //Agregando animales a la lista
        tienda.addAnimal(perro1);
        tienda.addAnimal(gato1);
        tienda.addAnimal(ave1);
        tienda.addAnimal(pez1);

        //Venta de animales
        tienda.venderAnimal("Blue");
        tienda.venderAnimal("Nemo");

        //Alimentando a los animales
        tienda.alimentarAnimal("Roco");
        tienda.alimentarAnimal("Milo");

        //Listando animales restantes
        tienda.listarAnimales();






    }
}

package Ejercicio1_TP2;
import java.util.ArrayList;
import java.util.List;

public class TiendaMascotas{
    private List<Animal> animales;

    public TiendaMascotas() {
        this.animales = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animales.add(animal);
        System.out.println("Has añadido al "+animal.getTipoAnimal()+" "+ animal.getNombre()+" con exito.");
    }
    public void venderAnimal(String nombre) {
        this.animales.removeIf(animal -> animal.getNombre().equals(nombre));
        System.out.println("Has Vendido al animal "+ nombre+" con exito.");
    }

    public void alimentarAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombre)) {
                animal.alimentar(nombre);
            }
        }
    }
    public void listarAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal.toString());
        }
    }
}

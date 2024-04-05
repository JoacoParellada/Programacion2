package Ejercicio_Clase_19_3;

public class Directivo extends Empleado {
    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

package Ejercicio_Clase_19_3;

public class Tecnico extends Operario{
    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

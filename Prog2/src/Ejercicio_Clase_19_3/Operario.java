package Ejercicio_Clase_19_3;

public class Operario extends Empleado {
    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Operario{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

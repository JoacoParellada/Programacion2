package Ejercicio_Clase_19_3;

public class Main{
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Phill Foden");
        Empleado operario1 = new Operario("Julian Alvarez");
        Empleado oficial1 = new Oficial("Lionel Messi");
        Empleado tecnico1 = new Tecnico("Alexis Mac Allister");

        System.out.println(empleado1.toString());
        System.out.println(operario1.toString());
        System.out.println(oficial1.toString());
        System.out.println(tecnico1.toString());
    }
}

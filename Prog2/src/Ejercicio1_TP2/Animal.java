package Ejercicio1_TP2;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String tipoAnimal;
    protected Double precio;

    public Animal(String nombre, int edad, String tipoAnimal, Double precio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void alimentar(String nombre) {
        System.out.println("Alimentando al "+tipoAnimal+" "+ nombre);
    }

    @Override
    public String toString() {
        return "---Animal---\n" +
                "Nombre:" + nombre + '\n' +
                "Edad:" + edad +"\n"+
                "Tipo de Animal:" + tipoAnimal + '\n' +
                "Precio: $" + precio +" ";
    }
}

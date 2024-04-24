package Ejercicio1_TP2;

public class Perro extends Animal{
    private String raza;
    private boolean vacunado;

    public Perro(String nombre, int edad, String tipoAnimal, Double precio, String raza, boolean vacunado) {
        super(nombre, edad, tipoAnimal, precio);
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Raza: "+getRaza()+"\n"+"Vacunado: "+isVacunado();

    }
}

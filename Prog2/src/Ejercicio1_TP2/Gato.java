package Ejercicio1_TP2;

public class Gato extends Animal{
    private String raza;
    private Boolean esterilizado;

    public Gato(String nombre, int edad, String tipoAnimal, Double precio, String raza, Boolean esterilizado) {
        super(nombre, edad, tipoAnimal, precio);
        this.raza = raza;
        this.esterilizado = esterilizado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Boolean getEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(Boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Raza: "+getRaza()+"\n"+"Esterilizado: "+getEsterilizado();
    }
}

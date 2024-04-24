package Ejercicio1_TP2;

public class Pez extends Animal{
    private String tipoPez;
    private String colores;

    public Pez(String nombre, int edad, String tipoAnimal, Double precio, String tipoPez, String colores) {
        super(nombre, edad, tipoAnimal, precio);
        this.tipoPez = tipoPez;
        this.colores = colores;
    }

    public String getTipoPez() {
        return tipoPez;
    }

    public void setTipoPez(String tipoPez) {
        this.tipoPez = tipoPez;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Tipo pez: "+getTipoPez()+"\n"+"Colores: "+getColores();
    }
}

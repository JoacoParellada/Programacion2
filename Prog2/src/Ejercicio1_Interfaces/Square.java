package Ejercicio1_Interfaces;

public class Square implements Figure,Rotatable,Drawable{
    private double lado;

    public Square(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un cuadrado.");
    }

    @Override
    public void area() {
        double area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }

    @Override
    public void rotate() {
        System.out.println("Rotando un cuadrado.");
    }
}

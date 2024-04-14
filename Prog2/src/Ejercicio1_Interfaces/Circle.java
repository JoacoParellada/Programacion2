package Ejercicio1_Interfaces;

public class Circle implements Figure,Drawable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un circulo.");
    }

    @Override
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("El area del circulo es: "+ area);
    }
}

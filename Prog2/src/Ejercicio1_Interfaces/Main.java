package Ejercicio1_Interfaces;

public class Main {
    public static void main(String[] args) {

        //Instanciando objetos
        Circle circulo1 = new Circle(2.5);
        Square cuadrado1 = new Square(3.0);

        System.out.println(" ");
        circulo1.draw();
        circulo1.area();

        System.out.println("----------");

        cuadrado1.draw();
        cuadrado1.rotate();
        cuadrado1.area();


    }
}

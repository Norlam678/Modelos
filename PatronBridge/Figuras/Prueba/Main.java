package Prueba;

import Color.Azul;
import Color.Rojo;
import Color.Verde;
import Forma.Circulo;
import Forma.Cuadrado;
import Forma.Figura;
import Forma.Triangulo;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Cuadrado(new Rojo());
        Figura figura2 = new Triangulo(new Azul());
        Figura figura3 = new Circulo(new Verde());

        System.out.println(figura.dibujar());
        figura.setColor(new Azul());
        System.out.println(figura.dibujar());
        System.out.println();

        System.out.println(figura2.dibujar());
        figura2.setColor(new Rojo());
        System.out.println(figura2.dibujar());
        System.out.println();

        System.out.println(figura3.dibujar());
        figura3.setColor(new Rojo());
        System.out.println(figura3.dibujar());

    }
}
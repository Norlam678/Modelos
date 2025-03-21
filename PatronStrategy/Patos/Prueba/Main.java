package Prueba;
import ComportamientoDeSonido.Quack;
import ComportamientoDeSonido.QuackMuteado;
import ComportamientoDeSonido.Squeak;
import ComportamientoDeVuelo.NoVuela;
import ComportamientoDeVuelo.VuelaConCohete;
import TipoDePato.PatoDeGoma;
import TipoDePato.PatoDeMadera;
public class Main {
    public static void main(String[] args) {
        PatoDeGoma pato1 = new PatoDeGoma();
        PatoDeMadera pato2 = new PatoDeMadera();

        pato1.setComportamientoDeSonido(new Squeak());
        pato2.setComportamientoDeSonido(new QuackMuteado());

        pato1.setComportamientoDeVuelo(new NoVuela());
        pato2.setComportamientoDeVuelo(new NoVuela());

        System.out.println("pato 1: " + pato1.mostrar());
        System.out.println("Sonido pato 1: " + pato1.quack());
        System.out.println("Vuelo pato 1: " + pato1.volar());
        System.out.println();

        System.out.println("pato 2: " + pato2.mostrar());
        System.out.println("Sonido pato 2: " + pato2.quack());
        System.out.println("Vuelo pato 2: " + pato2.volar());
        System.out.println();

        pato1.setComportamientoDeSonido(new Quack());
        pato1.setComportamientoDeVuelo(new VuelaConCohete());

        pato2.setComportamientoDeSonido(new QuackMuteado());
        pato2.setComportamientoDeVuelo(new VuelaConCohete());

        System.out.println("pato 1: " + pato1.mostrar());
        System.out.println("Sonido pato 1: " + pato1.quack());
        System.out.println("Vuelo pato 1: " + pato1.volar());
        System.out.println();

        System.out.println("pato 2: " + pato2.mostrar());
        System.out.println("Sonido pato 2: " + pato2.quack());
        System.out.println("Vuelo pato 2: " + pato2.volar());

    }
}

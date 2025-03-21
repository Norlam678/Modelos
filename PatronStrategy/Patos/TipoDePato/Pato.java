package TipoDePato;

import ComportamientoDeSonido.ComportamientoDeSonido;
import ComportamientoDeVuelo.ComportamientoDeVuelo;

public class Pato {
    private ComportamientoDeVuelo comportamientoDeVuelo;
    private ComportamientoDeSonido comportamientoDeSonido;

    public void setComportamientoDeVuelo(ComportamientoDeVuelo comportamientoDeVuelo) {
        this.comportamientoDeVuelo = comportamientoDeVuelo;
    }

    public void setComportamientoDeSonido(ComportamientoDeSonido comportamientoDeSonido) {
        this.comportamientoDeSonido = comportamientoDeSonido;
    }

    public String volar(){
        return comportamientoDeVuelo.volar();
    }

    public String quack(){
        return comportamientoDeSonido.quack();
    }
}

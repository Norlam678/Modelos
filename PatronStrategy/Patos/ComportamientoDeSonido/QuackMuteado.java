package ComportamientoDeSonido;

public class QuackMuteado implements ComportamientoDeSonido {
    @Override
    public String quack(){
        return "No hace ningun sonido";
    }
}

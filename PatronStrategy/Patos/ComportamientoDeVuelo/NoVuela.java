package ComportamientoDeVuelo;

public class NoVuela implements ComportamientoDeVuelo {
    @Override
    public String volar(){
        return "No vuela";
    }
}

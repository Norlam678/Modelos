package Forma;
import Color.Color;
public class Cuadrado extends Figura{
    public Cuadrado(Color color){
        super(color);
    }
    @Override
    public String dibujar(){
        return "Dibujando un Cuadrado " + color.rellenar();
    }
    
}

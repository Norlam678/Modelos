package Forma;
import Color.Color;

public class Triangulo extends Figura{
    
    public Triangulo(Color color){
        super(color);
    }
    @Override
    public String dibujar(){
        return "Dibujando un Triangulo " + color.rellenar();
    }
    
}

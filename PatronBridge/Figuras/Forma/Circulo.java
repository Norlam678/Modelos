package Forma;
import Color.Color;
public class Circulo extends Figura{
    public Circulo(Color color){
        super(color);
    }
    @Override
    public String dibujar(){
        return "Dibujando un Circulo " + color.rellenar();
    }
    
}

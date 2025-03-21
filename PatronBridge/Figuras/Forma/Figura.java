package Forma;
import Color.Color;

public abstract  class Figura {
    Color color;
    public Figura(Color color){
        this.color = color;
    }   
    public abstract String dibujar();
    public void setColor(Color color){
        this.color = color;
    }
}

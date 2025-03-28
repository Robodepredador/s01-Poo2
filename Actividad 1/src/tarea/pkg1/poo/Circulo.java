package tarea.pkg1.poo;


public class Circulo {
    
    private double radio = 12.5;
    private String color = "Azul";

    public Circulo() {
    }
    
    public Circulo(double radio, String color){
        this.radio = radio;
        this.color = color;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public double getArea() {
        return radio * radio * Math.PI;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }

    

    }
    
    
 


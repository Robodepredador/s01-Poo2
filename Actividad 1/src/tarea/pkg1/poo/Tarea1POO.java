package tarea.pkg1.poo;

public class Tarea1POO {

    public static void main(String[] args) {
        
        Circulo c1 = new Circulo();
        System.out.println("Radio por defecto =" + c1.getRadio());
        System.out.println("Color por defecto =" + c1.getColor());
        
        c1.setRadio(15.25);
        c1.setColor("rojo");
        
        System.out.println("Radio modificado =" + c1.getRadio());
        System.out.println("Color modificado = " + c1.getColor());
        
        
    }
    
}

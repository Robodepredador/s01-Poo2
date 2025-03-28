package tarea.poo.pkg2;

public abstract class FiguraGeometrica {
    
    protected String nombre;

    // Constructores
    public FiguraGeometrica() {
        this.nombre = "Figura Geometrica";
    }

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos
    public abstract double calcularArea();
    public abstract boolean esRegular();

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

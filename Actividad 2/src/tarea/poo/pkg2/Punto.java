package tarea.poo.pkg2;

public class Punto {
    
    private double x;
    private double y;

    // Constructores
    public Punto() {
        this(0, 0);
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos de acceso
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular distancia
    public double calcularDistancia(Punto otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.getX() - this.x, 2) + 
                         Math.pow(otroPunto.getY() - this.y, 2));
    }

    public double calcularDistancia() {
        return calcularDistancia(new Punto(0, 0)); // Distancia al origen
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + x + "," + y + "\n";
    }
}
    


package tarea.poo.pkg2;

public class Triangulo extends FiguraGeometrica {
    
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    // Constructores
    public Triangulo() {
        super("Triangulo ");
        this.punto1 = new Punto();
        this.punto2 = new Punto(1, 0);
        this.punto3 = new Punto(0, 1);
    }

    public Triangulo(String nombre, Punto p1, Punto p2, Punto p3) {
        super(nombre);
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
    }

    // Métodos de acceso
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    // Implementación de métodos abstractos
@Override
public double calcularArea() {
    
    // Calculamos las longitudes de los lados del triángulo
    double ladoA = punto1.calcularDistancia(punto2);
    double ladoB = punto2.calcularDistancia(punto3);
    double ladoC = punto3.calcularDistancia(punto1);
    
    // Fórmula de Herón: Area = √[s(s-a)(s-b)(s-c)] donde s = (a+b+c)/2
    double semiPerimetro = (ladoA + ladoB + ladoC) / 2;
    double area = Math.sqrt(
        semiPerimetro * 
        (semiPerimetro - ladoA) * 
        (semiPerimetro - ladoB) * 
        (semiPerimetro - ladoC)
    );
    
    return area;
}

    @Override
    public boolean esRegular() {
        // Un triángulo es regular si es equilátero
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);

        return Math.abs(lado1 - lado2) < 0.0001 && 
               Math.abs(lado2 - lado3) < 0.0001;
    }

    @Override
    public String toString() {
        return "Triangulo 1: \n" + getNombre() + "tiene 3 Puntos: \n" + 
               getPunto1().toString() + getPunto2().toString() + 
               getPunto3().toString();
    }
}

package tarea.poo.pkg2;

import java.util.List;

public class TareaPOO2 {

    public static void main(String[] args) {
        
         // Crear puntos
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(0, 4);

        // Crear triángulo
        Triangulo triangulo = new Triangulo("Triangulo Rectangulo ", p1, p2, p3);

        // Crear superficie plana
        SuperficiePlana superficie = new SuperficiePlana();
        superficie.agregarFigura(triangulo);

        // Obtener información
        List<Double> areas = superficie.obtenerAreas();
        List<String> info = superficie.obtenerInfoFiguras();

        // Mostrar resultados
        System.out.println("Areas de las figuras:");
        for (Double area : areas) {
            System.out.println(area);
        }

        System.out.println("\nInformacion de las figuras:");
        for (String datos : info) {
            System.out.println(datos);
        }
    }
        
    }
    


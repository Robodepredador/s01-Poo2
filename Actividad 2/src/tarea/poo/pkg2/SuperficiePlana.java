package tarea.poo.pkg2;

import java.util.ArrayList;
import java.util.List;

public class SuperficiePlana {
    
     private List<FiguraGeometrica> figuras;

    public SuperficiePlana() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public List<Double> obtenerAreas() {
        List<Double> areas = new ArrayList<>();
        for (FiguraGeometrica figura : figuras) {
            areas.add(figura.calcularArea());
        }
        return areas;
    }

    public List<String> obtenerInfoFiguras() {
        List<String> info = new ArrayList<>();
        for (FiguraGeometrica figura : figuras) {
            info.add(figura.toString() + " - Area: " + figura.calcularArea() + 
                     " - Regular: " + figura.esRegular());
        }
        return info;
    }
    
}

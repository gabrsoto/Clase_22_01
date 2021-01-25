package Clase_Tarde.Shape;

import java.util.ArrayList;

public class clsFiguraGeometrica {

    public static double Area_Promedio(FiguraGeometrica[] arrFigGeo){
        int count = arrFigGeo.length;
        double areaTotal = 0;
        for (FiguraGeometrica element: arrFigGeo) {
            areaTotal += element.Area();
        }

        return areaTotal / count;
    }

    public static double Area_Promedio(ArrayList<FiguraGeometrica> lstFigGeo){
        FiguraGeometrica[] arrFigGeo = new FiguraGeometrica[lstFigGeo.size()];

        for (int i = 0; i < lstFigGeo.size(); i++) {
            arrFigGeo[i] = lstFigGeo.get(i);
        }

        return Area_Promedio(arrFigGeo);
    }
}

package Clase_Tarde;

import Clase_Tarde.PassWord_1.Password;
import Clase_Tarde.PassWord_1.PasswordFuerte;
import Clase_Tarde.PassWord_1.PasswordIntermedia;
import Clase_Tarde.PassWord_1.PasswordSimple;
import Clase_Tarde.Shape.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //EjecutarClaseMañana();
        EjecutarClaseTarde();
    }

    public static void EjecutarClaseMañana(){
        Password objPass = new PasswordSimple();
        objPass.SetValue("holamundo");

        objPass = new PasswordIntermedia();
        objPass.SetValue("Emmanuel1995");

        objPass = new PasswordFuerte();
        objPass.SetValue("6723SLJDnaqc,,__");
    }

    public static void EjecutarClaseTarde(){
        FiguraGeometrica[] arrFigGeo = new FiguraGeometrica[3];

        Circulo objCirculo = new Circulo();
        objCirculo.SetRadius(10);
        arrFigGeo[0] = objCirculo;

        Rectangulo objRectangulo = new Rectangulo();
        objRectangulo.SetBase(10);
        objRectangulo.SetHeight(3);
        arrFigGeo[1] = objRectangulo;

        Triangulo objTriangulo = new Triangulo();
        objTriangulo.SetBase(15);
        objTriangulo.SetHeight(25);
        arrFigGeo[2] = objTriangulo;

        double areaPromedio = clsFiguraGeometrica.Area_Promedio(arrFigGeo);

        System.out.println("El área promedio es: "+ areaPromedio);
    }
}

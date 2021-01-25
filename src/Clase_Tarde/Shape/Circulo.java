package Clase_Tarde.Shape;

public class Circulo extends FiguraGeometrica{

    private double radius;

    public Circulo(){
        super.nameShape = "Circulo";
    }

    public void SetRadius(double value){
        this.radius = value;
    }

    public double GetRadius(){
        return this.radius;
    }

    @Override
    public double Area(){
        return Math.sqrt((Math.PI * GetRadius()));
    }
}

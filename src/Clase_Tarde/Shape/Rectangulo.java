package Clase_Tarde.Shape;

public class Rectangulo extends FiguraGeometrica{

    private double base;
    private double height;

    public void SetBase(double value){
        this.base = value;
    }
    public double GetBase(){
        return this.base;
    }

    public void SetHeight(double value){
        this.height = value;
    }
    public double GetHeight(){
        return this.height;
    }

    public Rectangulo(){
        super.nameShape = "Rectangulo";
    }

    @Override
    public double Area(){
        return GetBase() * GetHeight();
    }
}

package Clase_Tarde.Shape;

public abstract class FiguraGeometrica {
    protected String nameShape;
    public abstract double Area();

    @Override
    public String toString(){
        return nameShape + "con Area de: " + Area();
    }
}

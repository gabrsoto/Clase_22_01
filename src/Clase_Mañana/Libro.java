package Clase_Mañana;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;

    public void SetTitulo(String value){
        this.titulo = value;
    }

    public String GetTitulo(){
        return this.titulo;
    }

    public void SetIsbn(String value){
        this.isbn = value;
    }

    public String GetIsbn(){
        return this.isbn;
    }

    public void SetAutor(String value){
        this.autor = value;
    }

    public String GetAutor(){
        return this.autor;
    }

    public Libro(String titulo, String isbn, String autor){
        SetTitulo(titulo);
        SetIsbn(isbn);
        SetAutor(autor);
    }

    public void Prestamo(){

    }

    public void Devolucion(){

    }

    //@Override
    // respondiendo el punto que solicita que le cambiemos el nombre del metodo con un override arriba, no se puede realizar
    // ya que el tostring() en minuscula no existe, pero si conservara el nombre como planteo al principio el ejercicio,
    //Override sobreescribe el metodo toString() de la clase Object

    public String tostring(){
        return GetTitulo() + ", " + GetIsbn() + ", " + GetAutor();
    }
}

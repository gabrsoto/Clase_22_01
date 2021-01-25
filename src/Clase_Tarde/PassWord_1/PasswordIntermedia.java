package Clase_Tarde.PassWord_1;

public class PasswordIntermedia extends Password{

    private static final String expression = ".*[A-Z0-9].*[a-zA-Z0-9]{5,10}\\b";
    public PasswordIntermedia(){
        super(expression);
    }
}

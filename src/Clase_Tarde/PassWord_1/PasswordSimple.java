package Clase_Tarde.PassWord_1;

public class PasswordSimple extends Password{

    private static final String expression = "[a-zA-Z]{5,10}";

    public PasswordSimple(){
        super(expression);
    }
}

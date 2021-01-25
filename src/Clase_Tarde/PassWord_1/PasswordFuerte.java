package Clase_Tarde.PassWord_1;

public class PasswordFuerte extends Password {

    private static final String expression = "^.*(?=.{8,})(?=.*\\d)(?=.*[a-zA-Z])|(?=.{8,})(?=.*\\d)(?=.*[!@#$%^&])|(?=.{8,})(?=.*[a-zA-Z])(?=.*[!@#$%^&]).*$";

    public PasswordFuerte(){
        super(expression);
    }
}

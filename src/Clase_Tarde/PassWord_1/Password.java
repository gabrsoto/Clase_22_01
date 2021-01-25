package Clase_Tarde.PassWord_1;
import java.util.regex.*;

public class Password {

    private String value;
    private String expresion;
    private Pattern objPassWorld;

    public void SetValue(String pwd){
        try {
            Matcher objValidate = objPassWorld.matcher(pwd);
            if(objValidate.find())
                this.value = pwd;
            else
                throw new Exception("La contraseña ingresada, no cumple con la condición de seguridad");
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }

    private void SetExpression(String value){
        this.expresion = value;
    }

    private String GetExpression(){
        return this.expresion;
    }

    public Password(String expresion){
        SetExpression(expresion);
        objPassWorld = Pattern.compile(GetExpression());
    }
}

package Clase_Mañana;

public class CuentaCorriente {

    private double saldo;
    private String nroCuenta;
    private String cbu;

    public void SetSaldo(double value){
        this.saldo = value;
    }

    public double GetSaldo(){
        return this.saldo;
    }

    public void SetNroCuenta(String value){
        this.nroCuenta = value;
    }

    public String GetNroCuenta(){
        return this.nroCuenta;
    }

    public void SetCbu(String value){
        this.cbu = value;
    }

    public String GetCbu(){
        return this.cbu ;
    }

    public CuentaCorriente(double saldo, String nroCuenta, String cbu){
        SetSaldo(saldo);
        SetNroCuenta(nroCuenta);
        SetCbu(cbu);
    }

    public CuentaCorriente(CuentaCorriente objCuentaCorriente){
        SetSaldo(objCuentaCorriente.saldo);
        SetNroCuenta(objCuentaCorriente.nroCuenta);
        SetCbu(objCuentaCorriente.cbu);
    }

    public void Ingreso(double importe){
        double Total = GetSaldo() + importe;
        SetSaldo(Total);
    }

    public void Egreso(double importe){
        double Total = GetSaldo() - importe;
        SetSaldo(Total);
    }

    public void Reintegro(double importe){

    }
    public void Transferencia(double importe){

    }
}

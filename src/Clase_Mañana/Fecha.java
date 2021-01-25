package Clase_Mañana;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
    private int day;
    private int month;
    private int year;
    private GregorianCalendar gt;

    public Fecha(){
        gt = new GregorianCalendar();
    }
    public Fecha(int day, int month, int year){
        SetDay(day);
        SetMonth(month);
        SetYear(year);
        gt = new GregorianCalendar(GetYear(),GetMonth() -1,GetDay()); // asigno un menos 1 porque asignando 1 me trae febrero en vez de enero (estimo que es porque es un enumerador base 0)
    }

    public void SetDay(int value){
        this.day = value;
    }
    public int GetDay(){
        return this.day;
    }

    public void SetMonth(int value){
        this.month = value;
    }
    public int GetMonth(){
        return this.month;
    }

    public void SetYear(int value){
        this.year = value;
    }
    public int GetYear(){
        return this.year;
    }

    @Override
    public String toString(){
        if(IsFechaValida())
            return GetDay() + "/" + GetMonth() + "/"+ GetYear();
        else
            return "";
    }

    public boolean IsFechaValida(){
        if(gt == null)
            return false;
        if (gt.getTime().getYear() < 1900) {
            return false;
        }
        return true;
    }

    public void Add_Day(){
        gt.add(Calendar.DAY_OF_MONTH,1);
    }

    public void Add_Day(int CantDays){
        gt.add(Calendar.DAY_OF_MONTH,CantDays);
    }
}

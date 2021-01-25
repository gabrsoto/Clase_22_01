package Clase_Mañana;

import jdk.dynalink.Operation;

import java.util.Enumeration;

public class Fraccion {

    private static int MCM (int denominador, int denominador2){
        int mcm=1;
        int i=2;
        while(i <= denominador || i <= denominador2)
        {
            if(denominador%i==0 || denominador2%i==0)
            {
                mcm=mcm*i;
                if(denominador%i==0) denominador=denominador/i;
                if(denominador2%i==0) denominador2 =denominador2/i;
            }
            else
                i++;
        }

        return mcm;
    }

    public static String Sumar(int numerador, int denominador, int numerador2, int denominador2){

        int mcm = MCM(denominador,denominador2);
        return ((mcm/denominador*numerador )+(mcm/denominador2*numerador2))+ "/"+mcm;
    }

    public static String Sumar(int numerador, int denominador,  int nroNatural){
        return ((denominador/denominador*numerador )+(denominador*nroNatural))+ "/"+denominador;
    }

    public static String Restar(int numerador, int denominador, int numerador2, int denominador2){

        int mcm = MCM(denominador,denominador2);
        return ((mcm/denominador*numerador )-(mcm/denominador2*numerador2))+ "/"+mcm;
    }

    public static String Restar(int numerador, int denominador,  int nroNatural){
        return ((denominador/denominador*numerador )-(denominador*nroNatural))+ "/"+denominador;
    }

    public static String Multiplicar(int numerador, int denominador, int numerador2, int denominador2){
        return (numerador*numerador2) + "/" + (denominador * denominador2);
    }

    public static String Multiplicar(int numerador, int denominador, int nroNatural){
        return (numerador*nroNatural) + "/" + (denominador);
    }

    public static String Dividir(int numerador, int denominador, int numerador2, int denominador2){
        return (numerador * denominador2) + "/" + (denominador * numerador2);
    }

    public static String Dividir(int numerador, int denominador, int nroNatural){
        return (numerador) + "/" + (denominador * nroNatural);
    }
}

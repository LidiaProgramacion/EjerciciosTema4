package com.EjerciciosTema4;

public class EjercicioSwitch {
    public static void main (String[] args) {
        String estacion = "verano";
        switch(estacion) {
            case "invierno":
               System.out.println("es invierno");
            case "primavera":
                System.out.println("es primavera");
            case "otoño":
                System.out.println("es otoño");
            case "verano":
                System.out.println("es verano");
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}

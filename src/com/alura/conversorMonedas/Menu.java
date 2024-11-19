package com.alura.conversorMonedas;

import java.util.Scanner;

public class Menu {
    private Scanner s = new Scanner(System.in);
    private int opcion;
    private double amount;
    private String menu = """
                ***********
                ¡Bienvenido al conversor de monedas!
                Selecciona un tipo de cambio:
                1) Dólares a Soles.
                2) Soles a Dólares.
                3) Pesos Mexicanos a Soles.
                4) Soles a Pesos Mexicanos.
                5) Salir. 
                """;
    public void imprimirMenu(){
        System.out.print(menu);
    }
    public int capturarOpcion(){
        try{
            System.out.println("Ingresa una opción:");
            this.opcion = s.nextInt();
            if (opcion > 0 & opcion < 6){
                s.nextLine();
                return opcion;
            } else {
                return errores();
            }
        } catch (Exception e){
            return errores();
        }
    }
    public double capturarMonto(){
        try {
            System.out.println("Ingresa un monto:");
            this.amount = s.nextDouble();
            if ( amount >= 0 ){
                return amount;
            } else {
                System.out.print("Monto no válido. ");
                s.nextLine();
                return capturarMonto();
            }
        } catch (Exception e){
            System.out.print("Monto no válido. ");
            s.nextLine();
            return capturarMonto();
        }

    }
    public int errores(){
        System.out.print("Ingresa un número válido. ");
        s.nextLine();
        return capturarOpcion();
    }
}

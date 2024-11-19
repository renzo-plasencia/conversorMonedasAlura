package com.alura.conversorMonedas;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            Menu menu = new Menu();
            menu.imprimirMenu();
            int opcion = menu.capturarOpcion();
            if (opcion == 5){
                System.out.println("Gracias por usar el conversor");
                break;
            }
            double amount = menu.capturarMonto();
            if (opcion != 5 && amount >= 0){
                ConversionMonedas conversor = new ConversionMonedas(opcion, amount);
                System.out.println("El monto convertido es: "+conversor.calculaCambio());
            }
        }

    }



}

package com.alura.conversorMonedas;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            Main menu = new Main();
            menu.Menu();
            int opcion = s.nextInt();

            if (opcion == 5){
                System.out.println("Gracias por usar el conversor");
                break;
            }

            System.out.println("Ingresa un monto");
            double amount = s.nextDouble(); //Clase para comprobaciones

            if (opcion != 5 && amount >= 0){
                ConversionMonedas conversor = new ConversionMonedas(opcion, amount);
                System.out.println("El monto convertido es: "+conversor.calculaCambio());
            }
        }

    }

    public void Menu(){
        String menu = """
                ***********
                ¡Bienvenido al conversor de monedas!
                Selecciona un tipo de cambio:
                1) Dólares a Soles.
                2) Soles a Dólares.
                3) Pesos Mexicanos a Soles.
                4) Soles a Pesos Mexicanos.
                5) Salir. 
                
                Ingresa una opción:
                """;
        System.out.print(menu);
    }

}

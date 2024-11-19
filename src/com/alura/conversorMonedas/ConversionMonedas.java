package com.alura.conversorMonedas;

import java.util.Map;

public class ConversionMonedas {
    Map<Integer, ConsultarMonedas> diccionario = Map.of(
            1, new ConsultarMonedas("USD","PEN"),
            2, new ConsultarMonedas("PEN","USD"),
            3, new ConsultarMonedas("MXN","PEN"),
            4, new ConsultarMonedas("PEN","MXN")
    );
    int opcion;
    double amount;
    double result;

    public ConversionMonedas(int opcion, double amount){
        this.opcion = opcion;
        this.amount = amount;
    }

   public Exchange convertirMonedas(){
       ConsultarMonedas conversor = diccionario.get(opcion);
       Exchange resultado = conversor.convertirDosMonedas(amount);
       return  resultado;
   }

   public double tipoCambio(){
       Exchange conversor = convertirMonedas();
       return conversor.conversion_rate();
   }

   public double calculaCambio(){
        return amount*tipoCambio();
   }
}

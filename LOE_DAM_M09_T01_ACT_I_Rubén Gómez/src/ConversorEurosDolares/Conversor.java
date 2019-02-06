package ConversorEurosDolares;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Conversor{

    public static void main(String[] args) {
       // String lineaRecep;
        String lineaEnvio="";
        final double DOLARES = 1.24363;
        double euros, result;

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
            lineaEnvio=br.readLine();
            
            if(lineaEnvio.equals("FIN")) {
            	System.out.println("FIN");
            
            }
            else {
            	euros= Double.parseDouble(lineaEnvio);
                
                result= DOLARES * euros;
                
                System.out.println(euros +" euros son " +String.format("%.2f", result) + " dolares");
            }

           
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
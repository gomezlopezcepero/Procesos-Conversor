package ConversorEurosDolares;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Principal {

    public static void main(String args[]) {
        String line="";
        String filePath = new File("conversor.jar").getAbsolutePath();

        try {
        	
        	
        	int cont=0;
            while(cont==0) {
        	
	            Process hijo = new ProcessBuilder("java", "-jar", filePath).start();
	            
	            BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
	            PrintStream ps = new PrintStream(hijo.getOutputStream(), true);
	            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	            System.out.println("Escribe una cantidad en euros para convertirla a dólares (escribe FIN para salir)");
	           
	            line = in.readLine();
	            ps.println(line);
	            
	            line = br.readLine();
	            
	            
		            if(line.equals("FIN")) {
		            	cont++;
		            	br.close();
		            }
		            else {
		            	System.out.println(line);
		            }
            
            }
            
            System.out.println("Se ha salido correctamente del programa");

           
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}


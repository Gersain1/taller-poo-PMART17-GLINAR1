package utilidades;

import java.util.Scanner;

public class Validacion {
    //se crea constructor para el scanner

    public static void validarOpcion(Scanner opcion){
        while (!opcion.hasNextInt()) {
            System.out.println("Por favor digita una opción valida");
            opcion.next();
            System.out.println("Ingresa la opción");
        }
    }


}

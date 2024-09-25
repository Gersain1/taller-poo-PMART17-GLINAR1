package programas;

import java.util.Scanner;

public class Programas{
    public static void ProgramaElse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el valor de A");
        int a = scanner.nextInt();
        System.out.println("Ingresa el valor de B");
        int b = scanner.nextInt();
        System.out.println("Ingresa el valor de C");
        int c = scanner.nextInt();

        if (a == c && b == c && a == b)
        {
            System.out.println(":::: Por favor ingresa valores diferentes :::: ");
        }
        else if (a < c && b < c) {
            System.out.println("El valor " +c+ " de la variable C es el mayor");
            if (a<b)
            {
                System.out.println("El valor " +a+ " de la variable  A es menor");
            }
            else
            {
                System.out.println("El valor " +b+ " de la variable  B es menor");
            }
        }
        else if (a<b)
        {
            System.out.println("El valor " +b+ " de la variable B es el mayor" );
            if (a<c)
            {
                System.out.println("El valor " +a+ " de la variable A es el menor");
            }
            else
            {
                System.out.println("El valor " +c+ " de la variable C es el menor");
            }
        }
        else
        {
            System.out.println("El valor " +a+ " de la variable A es el mayor");
            if (b<c)
            {
                System.out.println("El valor " +b+ " de la variable  B es el menor");
            }
            else
            {
                System.out.println("El valor " +c+ " de la variable  C es el menor");
            }
        }
    }
}

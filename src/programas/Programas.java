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
    ///Programa Swtich
    public static void ProgramaSwitch (){
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        switch (nota)
        {
            case 1:
                System.out.println("Su calificación es F ");
                break;
            case 2:
                System.out.println("Su calificación es F ");
                break;
            case 3:
            case 4:
                System.out.println("Su calificación es D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificación es C");
                break;
            case 7:
            case 8:
                System.out.println("Su calificación es B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificación es A");
                break;
            default:
                System.out.println("Número no válido, por favor verifique");

        }
    }
    public static void ProgramaTernaria (){
        System.out.println("Ingresa el número ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String respuesta = (num % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es " + respuesta);
    }

}

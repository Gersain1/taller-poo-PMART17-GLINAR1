package programas;

import javax.swing.plaf.PanelUI;
import java.util.Random;
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

    public static void ProgramaDoWhilew(){
        Random magic = new Random();
        int numalea = magic.nextInt(1,10);//numero magico
        Scanner dato= new Scanner(System.in);
        int usuario;
        do {
            System.out.println("¿QUE TANTA SUERTE TIENES...? Vamos averiguarlo");
            System.out.println("Ingresa un número del 1 al 10 ");
            usuario=dato.nextInt();
            if (usuario<numalea){
                System.out.println("El número ingresado es menor al número mágico");
            } else if (usuario>numalea) {
                System.out.println("El número ingresado es mayor al número mágico");
            }else
            {
                System.out.println("Le atinaste al número, el número pensado por el sistema es " +numalea);
            }
        }while (usuario!=numalea);
        System.out.println("*********");

        System.out.println("******************************************************************");
    }
    public static void ProgramaWhile(){
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa el número a sumar ");
        int ing = dato.nextInt();
        int num9 = 1;
        int contador = 0;

        while (num9 <= ing) {
            System.out.println("Incremento del numero                    + " + num9);
            contador = contador + num9;
            num9++;
        }
        System.out.println("_____________________________________________");
        System.out.println("La sumatoria de los números del 1 al " + ing + " es " + contador);
    }
    public static void ProgramaFor(){
        Scanner ingfor = new Scanner(System.in);
        System.out.println("Ingresa el número a sumar");

        int sumfor = ingfor.nextInt();
        int num10 = 1;
        int contador2 = 0;

        for (num10 = 1; num10 <= sumfor; num10++) {
            System.out.println("Incremento del numero " + num10);
            contador2 = contador2 + num10;

        }

        System.out.println("La sumatoria de los números del 1 al " + sumfor + " es " + contador2);
    }
}

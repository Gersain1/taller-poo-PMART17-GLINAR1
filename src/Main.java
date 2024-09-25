import menuPrincipal.*;
import programas.Programas;
import utilidades.Validacion;

import javax.naming.BinaryRefAddr;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerMainFirst = new Scanner(System.in);

        int opcion = 0; // variable utilizada en el menu principal
        int opc1 = 0; // variable utilizada en el menu de datos primitivos
        //int opc3 = 0;
        int opc4 = 0; // variable utilizada en el menu de tipo operadores
        int opc5 = 0;
        int opc6 = 0; // variable utilizada en el menu de switch
        int nota = 0;
        int opc7 = 0; // variable utilizada en el menu de Ternaria
        int opc8 = 0;
        int opc72 = 0; // variable utilizada en el menu de Ternaria - programa
        int num = 0; // variable usada en el programa de la ternaria
        int opc9 = 0; // variable utilizada en el menu de while
        int opc92 = 0; // variable utilizada en el menu de while - programa
        int opc10 = 0; // variable utilizada en el menu de FOR
        int opc102 = 0; // variable utilizada en el menu de FOR - programa
        // int num =0; // variable usada en el programa de la ternaria
        do {
            MenuPrincipal.menuPrincipal();
            Validacion.validarOpcion(scannerMainFirst);
            opcion = scannerMainFirst.nextInt();

            ///se ingresa al menú seleccionado por el usuario

            switch (opcion) {
                case 1:
                    do {
                        MenuDatosPrimitivos.datosPrimitivos();
                        Validacion.validarOpcion(scannerMainFirst);

                        opc1 = scannerMainFirst.nextInt();

                        switch (opc1) {

                            case 1:
                                MenuDatosPrimitivos.datosPrimitivosByte();
                                break;
                            case 2:
                                MenuDatosPrimitivos.datosPrimitivoShort();
                                break;
                            case 3:
                                MenuDatosPrimitivos.datosPrimitivosInt();
                                break;
                            case 4:
                                MenuDatosPrimitivos.datosPrimitivosLong();
                                break;
                            case 5:
                                MenuDatosPrimitivos.datosPrimitivosFloat();
                                break;
                            case 6:
                                MenuDatosPrimitivos.datosPrimitivosDouble();
                                break;
                            case 7:
                                MenuDatosPrimitivos.datosPrimitivosChar();
                                break;
                            case 8:
                                MenuDatosPrimitivos.datosPrimitivosBolean();
                                break;
                            default:
                                //System.out.println("Número no válido, por favor verifique");
                                if (opc1 == 9) {

                                    System.out.println("Si quieres volver al menú Principal presiona enter");
                                    scannerMainFirst.nextLine();
                                    scannerMainFirst.nextLine();
                                }
                        }

                    }
                    while (opc1 != 9);
                    break;
                case 2:
                    MenuPrincipal.MenuPrincipalString();
                    break;
                case 3:
                    MenuPrincipal.MenuPrincipalConstantes();
                    break;
                case 4:
                    do {
                        MenuTipoOperadores.TipoOperadores();
                        Validacion.validarOpcion(scannerMainFirst);

                        opc4 = scannerMainFirst.nextInt();


                        switch (opc4) {

                            case 1:
                                MenuTipoOperadores.TipoOperadoresAritmeticos();
                                break;
                            case 2:
                                MenuTipoOperadores.TipoOperadoresRelacionales();
                                break;
                            case 3:
                                MenuTipoOperadores.TipoOperadoresLogicos();
                                break;
                            case 4:
                                MenuTipoOperadores.TipoOperadoresAsignacion();
                                break;

                            case 5:
                                MenuTipoOperadores.TipoOperadoresIncDec();
                                break;
                            default:
                                if
                                (opc4 == 6) {
                                    System.out.println("Si quieres volver al menú Principal presiona enter");
                                    scannerMainFirst.nextLine();
                                    scannerMainFirst.nextLine();

                                }
                        }
                    } while (opc4 != 6);
                    break;

                case 5:
                    do {
                        MenuIfElse.PrincipalIfElse();
                        Validacion.validarOpcion(scannerMainFirst);
                        opc5 = scannerMainFirst.nextInt();

                        switch (opc5) {
                            case 1:
                                MenuIfElse.ExplicacionIf();
                                break;
                            case 2:
                                MenuIfElse.ExplicacionElseIf();
                                break;

                            case 3:
                               MenuIfElse.ExplicacionElse();
                                break;
                            case 4:
                                MenuIfElse.ExplicacionPrograma();
                                Programas.ProgramaElse();
                                break;

                            default:
                                //System.out.println("Número no válido, por favor verifique");
                                if (opc5 == 5) {

                                    System.out.println("Si quieres volver al menú Principal presiona enter");
                                    scannerMainFirst.nextLine();
                                    scannerMainFirst.nextLine();
                                }
                        }

                    }while (opc5 != 5);
                    break;

                        case 6:
                            do {
                                System.out.println("******************************************************************");
                                System.out.println("*******        6. CONDICIONAL SWITCH                       *******");
                                System.out.println("******************************************************************");
                                System.out.println("******************************************************************");
                                System.out.println("*                                                                *");
                                System.out.println("*  1. Explicación de Switch                                      *");
                                System.out.println("*  2. Programa de Switch                                         *");
                                System.out.println("*  3. Volver menú inicial                                        *");
                                System.out.println("*                                                                *");
                                System.out.println("******************************************************************");
                                System.out.println("Por favor digita tu mejor opción:  ");
                                opc6 = scannerMainFirst.nextInt();
                                switch (opc6) {
                                    case 1:
                                        System.out.println("******************************************************************");
                                        System.out.println("*******         1. EXPLICACIÓN SWITCH                   **********");
                                        System.out.println("******************************************************************");
                                        System.out.println("*                                                                *");
                                        System.out.println("* El condicional switch case es una estructura que evalúa más de *");
                                        System.out.println("* un caso y se caracteriza por: Selección de una opción entre    *");
                                        System.out.println("* varias. Switch recibe un “caso” y lo evalúa hasta encontrar    *");
                                        System.out.println("* el caso que corresponda. Se puede usar la opción “default”     *");
                                        System.out.println("* para cuando no se encuentra el caso dado                       *");
                                        System.out.println("*                                                                *");
                                        System.out.println("******************************************************************");
                                        break;
                                    case 2:
                                        System.out.println("******************************************************************");
                                        System.out.println("*******         2. PROGRAMA SWITCH                      **********");
                                        System.out.println("******************************************************************");
                                        System.out.println("*                                                                *");
                                        System.out.println("* Ingresa la nota que deseas consultar                           *");
                                        Scanner scanner = new Scanner(System.in);
                                        nota = scanner.nextInt();
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
                                        break;
                                    default:
                                        //System.out.println("Número no válido, por favor verifique");
                                        if (opc6 == 3) {

                                            System.out.println("Si quieres volver al menú Principal presiona enter");
                                            scannerMainFirst.nextLine();
                                            scannerMainFirst.nextLine();
                                        }
                                    }
                                }
                            while (opc6 != 3);
                            break;
                        case 7:
                            do {
                                System.out.println("******************************************************************");
                                System.out.println("*******             7. TERNARIA                            *******");
                                System.out.println("******************************************************************");
                                System.out.println("******************************************************************");
                                System.out.println("*                                                                *");
                                System.out.println("*  1. Explicación de Ternaria                                    *");
                                System.out.println("*  2. Programa de Ternaria                                       *");
                                System.out.println("*  3. Volver menú inicial                                        *");
                                System.out.println("*                                                                *");
                                System.out.println("******************************************************************");
                                System.out.println("Por favor digita tu mejor opción:  ");
                                opc7 = scannerMainFirst.nextInt();

                                switch (opc7) {
                                    case 1:
                                        System.out.println("******************************************************************");
                                        System.out.println("*******         1. EXPLICACIÓN TERNARIA                 **********");
                                        System.out.println("******************************************************************");
                                        System.out.println("* El operador ternario en Java es una construcción que permite   *");
                                        System.out.println("* tomar decisiones basadas en una condición booleana de manera   *");
                                        System.out.println("* concisa en una sola línea de código                            *");
                                        System.out.println("*                                                                *");
                                        System.out.println("*     String respuesta = (num % 2 == 0) ? \"Par\" : \"Impar\";   *");
                                        System.out.println("******************************************************************");
                                        break;
                                    case 2:
                                        System.out.println("******************************************************************");
                                        System.out.println("*******           2. PROGRAMA TERNARIA                  **********");
                                        System.out.println("******************************************************************");
                                        System.out.println("*                                                                *");
                                        System.out.println("* ¿Quieres saber si tu número es par o impar?                    *");
                                        System.out.println("*  1. Si                                                         *");
                                        System.out.println("*  2. No                                                         *");
                                        System.out.println("*  Ingresa la opción :                                           *");
                                        System.out.println("******************************************************************");
                                        opc72 = scannerMainFirst.nextInt();

                                        switch (opc72) {
                                            case 1:
                                                System.out.println("Ingresa el número ");
                                                num = scannerMainFirst.nextInt();
                                                String respuesta = (num % 2 == 0) ? "Par" : "Impar";
                                                System.out.println("El número es " + respuesta);
                                                break;
                                            case 2:
                                                System.out.println("Vuelve después..... ");
                                                break;
                                            default:
                                                System.out.println("Número no válido, por favor verifique");
                                        }
                                        break;
                                    default:
                                        //System.out.println("Número no válido, por favor verifique");
                                        if
                                        (opc72 == 3) {
                                            System.out.println("Si quieres volver al menú Principal presiona enter");
                                            scannerMainFirst.nextLine();
                                            scannerMainFirst.nextLine();

                                        }
                                }
                            } while (opc7 != 3);
                            break;
                        case 8:
                            do{
                                MenuDoWhile.PrincipalDoWhile();
                                Validacion.validarOpcion(scannerMainFirst);
                                opc8 = scannerMainFirst.nextInt();

                                switch (opc8){
                                    case 1:
                                      MenuDoWhile.ExplicacionDoWhile();
                                    break;
                                    case 2:
                                        MenuDoWhile.ExplicacionPrograma();
                                        Programas.ProgramaDoWhilew();

                                        break;
                                    default:

                                        if (opc8 == 3) {

                                            System.out.println("Si quieres volver al menú Principal presiona enter");
                                            scannerMainFirst.nextLine();
                                            scannerMainFirst.nextLine();
                                        }

                                }
                            }while (opc8 != 3);
                            break;

                        case 9:
                            do {
                                BucleWhile.PrincipalWhile();
                                Validacion.validarOpcion(scannerMainFirst);
                                opc9 = scannerMainFirst.nextInt();

                                switch (opc9) {
                                    case 1:
                                        BucleWhile.ExplicacionWhile();
                                        break;
                                    case 2:
                                        BucleWhile.ProgramaWhile();
                                        opc92 = scannerMainFirst.nextInt();

                                        switch (opc92) {
                                            case 1:
                                                Programas.ProgramaWhile();
                                                break;
                                            case 2:
                                                System.out.println("Vuelve después..... ");
                                                break;
                                            default:
                                                System.out.println("Número no válido, por favor verifique");
                                        }
                                        break;
                                    default:
                                        //System.out.println("Número no válido, por favor verifique");
                                        if
                                        (opc92 == 3) {
                                            System.out.println("Si quieres volver al menú Principal presiona enter");
                                            scannerMainFirst.nextLine();
                                            scannerMainFirst.nextLine();

                                        }
                                }
                            } while (opc9 != 3);
                            break;

                        case 10:
                            do {
                                BucleFor.PrincipalFor();
                                Validacion.validarOpcion(scannerMainFirst);
                                opc10 = scannerMainFirst.nextInt();

                                switch (opc10) {
                                    case 1:
                                        BucleFor.ExplicacionFor();
                                        break;
                                    case 2:
                                        BucleFor.ExplicacionPrograma();

                                        opc102 = scannerMainFirst.nextInt();

                                        switch (opc102) {
                                            case 1:
                                                Programas.ProgramaFor();
                                                break;
                                            case 2:
                                                System.out.println("Vuelve después..... ");
                                                break;
                                            default:
                                                System.out.println("Número no válido, por favor verifique");
                                        }
                                        break;
                                    default:
                                        //System.out.println("Número no válido, por favor verifique");
                                        if
                                        (opc102 == 3) {
                                            System.out.println("Si quieres volver al menú Principal presiona enter");
                                            scannerMainFirst.nextLine();
                                            scannerMainFirst.nextLine();

                                        }
                                }
                            } while (opc10 != 3);
                            break;
                        case 0:
                            System.out.println("Hasta pronto............");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opción no valida ");
                    } //break;

            }
            while (opcion !=11) ;
            scannerMainFirst.close();
        }
    }
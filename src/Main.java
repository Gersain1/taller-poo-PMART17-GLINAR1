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
            System.out.println("******************************************************");
            System.out.println("*******        TALLER PRE-HACKATON          **********");
            System.out.println("*******     GERSAIN LINARES - GLINAR1       **********");
            System.out.println("*******    PAOLA A. MARTINEZ - PMART17      **********");
            System.out.println("******************************************************");
            System.out.println("******************************************************");
            System.out.println("**                                                  **");
            System.out.println("**    1. Datos primitivos                           **");
            System.out.println("**    2. String                                     **");
            System.out.println("**    3. Constantes                                 **");
            System.out.println("**    4. Tipos de Operadores                        **");
            System.out.println("**    5. Condicional IF, ELSE IF, ELSE              **");
            System.out.println("**    6. Condicional Switch                         **");
            System.out.println("**    7. Condicional Ternaria                       **");
            System.out.println("**    8. Bucle DO WHILE                             **");
            System.out.println("**    9. Bucle WHILE                                **");
            System.out.println("**   10. Bucle FOR                                  **");
            System.out.println("**    0. Salir                                      **");
            System.out.println("******************************************************");
            //el usuario ingresa la opcion
            System.out.println("Por favor digita tu mejor opción:  ");

            while (!scannerMainFirst.hasNextInt()) {
                System.out.println("Por favor digita una opción valida");
                scannerMainFirst.next();
                System.out.println("Ingresa la opción");
            }
            opcion = scannerMainFirst.nextInt();

            ///se ingresa al menú seleccionado por el usuario

            switch (opcion) {
                case 1:
                    do {
                        System.out.println("******************************************************************");
                        System.out.println("*******              1. DATOS PRIMITIVOS                   *******");
                        System.out.println("******************************************************************");
                        System.out.println("******************************************************************");
                        System.out.println("*     1. Explicación byte.                                       *");
                        System.out.println("*     2. Explicación short                                      *");
                        System.out.println("*     3. Explicación int                                         *");
                        System.out.println("*     4. Explicación long                                        *");
                        System.out.println("*     5. Explicación float                                       *");
                        System.out.println("*     6. Explicación double                                      *");
                        System.out.println("*     7. Explicación char                                        *");
                        System.out.println("*     8. Explicación bolean                                      *");
                        System.out.println("*     9. Volver al menu principal                                *");
                        System.out.println("*                                                                *");
                        System.out.println("******************************************************************");
                        System.out.println("Por favor digita tu mejor opción:  ");

                        opc1 = scannerMainFirst.nextInt();

                        switch (opc1) {

                            case 1:
                                System.out.println("*******************************************************************");
                                System.out.println("*******               1. Explicación byte                **********");
                                System.out.println("*******************************************************************");
                                System.out.println("*Un byte es un tipo de dato primitivo que representa un valor     *");
                                System.out.println("*numérico entero de 8 bits.Esto significa que puede almacenar     *");
                                System.out.println("*valores en el rango de -128 a 127.                               *");
                                System.out.println("*******************************************************************");
                                break;
                            case 2:
                                System.out.println("*******************************************************************");
                                System.out.println("*******               2. Explicación short                *********");
                                System.out.println("*******************************************************************");
                                System.out.println("*short es uno de los tipos de datos primitivos que se utiliza para*");
                                System.out.println("*representar números enteros. Es una alternativa a int para cuando*");
                                System.out.println("* necesitas almacenar valores enteros en un rango más pequeño.    *");
                                System.out.println("*******************************************************************");
                                break;
                            case 3:
                                System.out.println("*******************************************************************");
                                System.out.println("*******               3. Explicación int                **********");
                                System.out.println("*******************************************************************");
                                System.out.println("*int es un tipo de dato primitivo que se utiliza para representar *");
                                System.out.println("*números enteros. Es uno de los ocho tipos de datos primitivos    *");
                                System.out.println("*en Java y es conocido por su eficiencia y rapidez en la          *");
                                System.out.println("manipulación de datos.                                            *");
                                System.out.println("*******************************************************************");
                                break;
                            case 4:
                                System.out.println("*******************************************************************");
                                System.out.println("*******               4. Explicación long                **********");
                                System.out.println("*******************************************************************");
                                System.out.println("*long es un tipo de dato primitivo utilizado para representar     *");
                                System.out.println("*números enteros más grandes que los que puede manejar el tipo    *");
                                System.out.println("*int. Es útil cuando necesitas trabajar con valores enteros que   *");
                                System.out.println(" exceden el rango de un int.                                      *");
                                System.out.println("*******************************************************************");
                                break;
                            case 5:
                                System.out.println("********************************************************************");
                                System.out.println("*******               5. Explicación float                **********");
                                System.out.println("********************************************************************");
                                System.out.println("*float es un tipo de dato primitivo que se utiliza para            *");
                                System.out.println("*representar números en punto flotante de precisión simple.        *");
                                System.out.println("********************************************************************");
                                break;
                            case 6:
                                System.out.println("********************************************************************");
                                System.out.println("*******               6. Explicación double                *********");
                                System.out.println("********************************************************************");
                                System.out.println("*double es un tipo de dato primitivo utilizado para representar    *");
                                System.out.println("*números en punto flotante de precisión doble. Esto significa que  *");
                                System.out.println("* puede almacenar números con decimales y ofrece mayor precisión   *");
                                System.out.println("que el tipo float.                                                 *");
                                System.out.println("********************************************************************");
                                break;
                            case 7:
                                System.out.println("*******************************************************************");
                                System.out.println("*******               7. Explicación char                **********");
                                System.out.println("*******************************************************************");
                                System.out.println("*char es un tipo de dato primitivo que se utiliza para representar*");
                                System.out.println("* un solo carácter. Los caracteres en Java están representados    *");
                                System.out.println("*mediante el código Unicode, lo que permite que el tipo char      *");
                                System.out.println(" maneje caracteres de una amplia gama de idiomas y símbolos.      *");
                                System.out.println("*******************************************************************");
                                break;
                            case 8:
                                System.out.println("********************************************************************");
                                System.out.println("*******               8. Explicación bolean                *********");
                                System.out.println("********************************************************************");
                                System.out.println("*boolean es un tipo de dato primitivo que se utiliza para          *");
                                System.out.println("*representar valores lógicos, es decir, valores que pueden ser     *");
                                System.out.println("*solo uno de dos posibles: true (verdadero) o false (falso).       *");
                                System.out.println("*******************************************************************");
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
                    System.out.println("******************************************************************");
                    System.out.println("*******                  2. STRING                      **********");
                    System.out.println("******************************************************************");
                    System.out.println("******************************************************************");
                    System.out.println("* El tipo de dato String es una clase que representa cadenas de  *");
                    System.out.println("* caracteres y se utiliza ampliamente en aplicaciones para       *");
                    System.out.println("* almacenar y manipular texto. En Java, una cadena de texto se   *");
                    System.out.println("* define utilizando comillas dobles (\" \") alrededor del texto    *");
                    System.out.println("*                                                                *");
                    System.out.println("* String mensaje=\"hi you\"se inicializa la variable               *");
                    System.out.println("* String nombre= new String (\"Juan\"); usando constructor         *");
                    System.out.println("*                                                                *");
                    System.out.println("******************************************************************");
                    break;
                case 3:
                    System.out.println("******************************************************************");
                    System.out.println("*******          3. EXPLICACIÓN CONSTANTES                 *******");
                    System.out.println("******************************************************************");
                    System.out.println("******************************************************************");
                    System.out.println("*                                                                *");
                    System.out.println("* Una constante es un valor que no cambia durante la ejecución   *");
                    System.out.println("* del programa. Las constantes se definen utilizando la palabra  *");
                    System.out.println("* clave final, lo cual indica que el valor de esa variable no    *");
                    System.out.println("* puede ser modificado una vez que ha sido asignado.             *");
                    System.out.println("*                                                                *");
                    System.out.println("******************************************************************");
                    break;
                case 4:
                    do {
                        System.out.println("******************************************************************");
                        System.out.println("*******          4. TIPO OPERADORES                        *******");
                        System.out.println("******************************************************************");
                        System.out.println("******************************************************************");
                        System.out.println("*                                                                *");
                        System.out.println("*  1. Aritmeticos                                                *");
                        System.out.println("*  2. Relacionales                                               *");
                        System.out.println("*  3. Logicos                                                    *");
                        System.out.println("*  4. Asignación                                                 *");
                        System.out.println("*  5. Incremento / Decremento                                    *");
                        System.out.println("*  6. Volver al menú inicial                                     *");
                        System.out.println("*                                                                *");
                        System.out.println("******************************************************************");
                        System.out.println("Por favor digita tu opción:  ");
                        opc4 = scannerMainFirst.nextInt();


                        switch (opc4) {

                            case 1:

                                System.out.println("*******************************************************************");
                                System.out.println("*******             1. ARITMETICOS                       **********");
                                System.out.println("*******************************************************************");
                                System.out.println("* Operador ||           Ejemplo      ||            Detalle        *");
                                System.out.println("*--------------------------------------_--------------------------*");
                                System.out.println("*    +     || int suma= 5+3;         || Suma dos operandos.       *");
                                System.out.println("*          ||                        || Resultado: 8              *");
                                System.out.println("*-------------------------------------_---------------------------*");
                                System.out.println("*    -     || int suma= 5-3;         || Resta el segundo operando *");
                                System.out.println("*          ||                        || del primero. Resultado: 2 *");
                                System.out.println("*-----------------------------------------------------------------*");
                                System.out.println("*    *     || int multiplicación 5*3;|| Multiplica dos operadores *");
                                System.out.println("*          ||                        || Resultado: 15             *");
                                System.out.println("*-----------------------------------------------------------------*");
                                System.out.println("*    /     || int división= 6/3;     || Divide el primer operando *");
                                System.out.println("*          ||                        || por el segundo Resultado:2*");
                                System.out.println("*-----------------------------------------------------------------*");
                                System.out.println("*     %    || int modulo = 5 % 3 ;   || Devuelve el resto de la   *");
                                System.out.println("*          ||                        || división del primer       *");
                                System.out.println("*          ||                        || operando por el segundo   *");
                                System.out.println("*          ||                        || Resultado: 2              *");
                                System.out.println("*-----------------------------------------------------------------*");
                                break;
                            case 2:
                                System.out.println("******************************************************************");
                                System.out.println("*******            2. RELACIONALES                      **********");
                                System.out.println("******************************************************************");
                                System.out.println("* Operador  ||           Ejemplo     ||           Detalle        *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    ==     || bolean igual (5==3);  || Comprueba si los valores *");
                                System.out.println("*           ||                       || de dos operandos son =   *");
                                System.out.println("*           ||                       || Resultado: False         *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    !=     || bolean NO es = (5!=3);|| Comprueba si los valores *");
                                System.out.println("*           ||                       || de dos operandos no son  *");
                                System.out.println("*           ||                       || iguales Resultado: true  *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    >      || bolean mayor = (5>3); || Comprueba si el valor    *");
                                System.out.println("*           ||                       || del primer operando es   *");
                                System.out.println("*           ||                       || mayor que el segundo     *");
                                System.out.println("*           ||                       || Resultado: True          *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    <      || bolean menor = (5<3); || Comprueba si el valor    *");
                                System.out.println("*           ||                       || del primer operando es   *");
                                System.out.println("*           ||                       || menor que el segundo     *");
                                System.out.println("*           ||                       || Resultado: False         *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*   >=      || bolean mayor 0 igual  || Comprueba si el valor    *");
                                System.out.println("*           || = (5>=3);             || del primer operando es   *");
                                System.out.println("*           ||                       || mayor o igual que el se- *");
                                System.out.println("*           ||                       || gundo Resultado: True    *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*   <=      || bolean menor 0 igual  || Comprueba si el valor    *");
                                System.out.println("*           || = (5<=3);             || del primer operando es   *");
                                System.out.println("*           ||                       || menor o igual que el se- *");
                                System.out.println("*           ||                       || gundo Resultado: False   *");
                                System.out.println("******************************************************************");

                                break;
                            case 3:
                                System.out.println("******************************************************************");
                                System.out.println("*******                  3. LOGICOS                     **********");
                                System.out.println("******************************************************************");
                                System.out.println("* Operador  ||           Ejemplo     ||           Detalle        *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    &&     || bolean resultado      || Devuelve true si ambos   *");
                                System.out.println("*           || =(5>3 && 3<4);        || operandos son True       *");
                                System.out.println("*           ||                       || Resultado: True          *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    ||     || bolean resultado      || Devuelve true si al menos*");
                                System.out.println("*           || =(5>3 || 3<4);        || una de ellas es tru      *");
                                System.out.println("*           ||                       || Resultado: true          *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    !      || bolean resultado      || Invierte el valor de un  *");
                                System.out.println("*           || =!(5>3);              || operando booleano.       *");
                                System.out.println("*           ||                       || Resultado: False         *");
                                System.out.println("******************************************************************");

                                break;
                            case 4:
                                System.out.println("******************************************************************");
                                System.out.println("*******            4. ASIGNACIÓN                        **********");
                                System.out.println("******************************************************************");
                                System.out.println("* Operador  ||           Ejemplo     ||           Detalle        *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    =      || int a=5;              || Asigna el valor del      *");
                                System.out.println("*           ||                       || operando derecho al ope- *");
                                System.out.println("*           ||                       || rando izquierdo          *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    +=     || int a=5; a+=3;        || Suma el operando derecho *");
                                System.out.println("*           ||                       || al operando izquierdo y  *");
                                System.out.println("*           ||                       || asigna el resultado al   *");
                                System.out.println("*           ||                       || operando izquierdo. Res 8*");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    -=     || int a=5; a-=3;        || Resta el operando derecho*");
                                System.out.println("*           ||                       || del operando izquierdo y *");
                                System.out.println("*           ||                       || asigna el resultado al   *");
                                System.out.println("*           ||                       || operando izquierdo. Res 2*");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    *=     || int a=5; a*=3;        || Multiplica el operando   *");
                                System.out.println("*           ||                       || derecho por el operando  *");
                                System.out.println("*           ||                       || izquierdo y asigna el re-*");
                                System.out.println("*           ||                       || sultado al operando      *");
                                System.out.println("*           ||                       || izquierdo. Resultado 15  *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    /=     || int a=6; a/=3;        || Divide el operando       *");
                                System.out.println("*           ||                       || izquierdo por el operando*");
                                System.out.println("*           ||                       || derecho y asigna el      *");
                                System.out.println("*           ||                       || resultado al operando    *");
                                System.out.println("*           ||                       || izquierdo. Resultado 2   *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    %=     || int a=5; a%=3;        || Calcula el módulo del    *");
                                System.out.println("*           ||                       || operando izquierdo por el*");
                                System.out.println("*           ||                       || operando derecho y asigna*");
                                System.out.println("*           ||                       || el resultado al operando *");
                                System.out.println("*           ||                       || izquierdo. Resultado 2   *");
                                System.out.println("******************************************************************");
                                break;

                            case 5:
                                System.out.println("******************************************************************");
                                System.out.println("*******         5. INCREMENTO / DECREMENTO              **********");
                                System.out.println("******************************************************************");
                                System.out.println("* Operador  ||           Ejemplo     ||           Detalle        *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    ++     || int a=5; a++;         || Incrementa el valor del  *");
                                System.out.println("*           ||                       || operando en 1.           *");
                                System.out.println("*           ||                       || Resultado: 6             *");
                                System.out.println("*----------------------------------------------------------------*");
                                System.out.println("*    --     || int a=5; a--;         || Decrementa el valor del  *");
                                System.out.println("*           ||                       || operando en 1.           *");
                                System.out.println("*           ||                       || Resultado: 4             *");
                                System.out.println("******************************************************************");
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
                        System.out.println("*********************************************************************");
                        System.out.println("*******            IF, ELSE IF, ELSE                         ********");
                        System.out.println("*********************************************************************");
                        System.out.println("*********************************************************************");
                        System.out.println("*                                                                   *");
                        System.out.println("*  1. Explicación IF                                                *");
                        System.out.println("*  2. Explicación ELSE IF                                           *");
                        System.out.println("*  3. Explicación ELSE                                              *");
                        System.out.println("*  4. Programa                                                      *");
                        System.out.println("*  5. Volver al menu principal                                      *");
                        System.out.println("*                                                                   *");
                        System.out.println("*********************************************************************");
                        System.out.println("Por favor digita tu mejor opción:                                   ");
                        opc5 = scannerMainFirst.nextInt();

                        switch (opc5) {
                            case 1:
                                System.out.println("******************************************************************");
                                System.out.println("*******         1. EXPLICACIÓN  IF                     ***********");
                                System.out.println("******************************************************************");
                                System.out.println("*                                                                *");
                                System.out.println("* IF es una estructura de control de flujo que permite ejecutar  *");
                                System.out.println("* un bloque de código solo si se cumple una condición específica *");
                                System.out.println("* Es fundamental para tomar decisiones en la pr                  *");
                                System.out.println("* permitiendo que tu programa realice diferentes acciones en     *");
                                System.out.println("* función de si una condición es verdadera o falsa.              *");
                                System.out.println("*                                                                *");
                                System.out.println("******************************************************************");
                                break;
                            case 2:
                                System.out.println("*******************************************************************");
                                System.out.println("*******         2. EXPLICACIÓN ELSE IF                  ***********");
                                System.out.println("*******************************************************************");
                                System.out.println("*else if es una extensión de la estructura de control if que      *");
                                System.out.println("*permite manejar múltiples condiciones de manera secuencial.      *");
                                System.out.println("* Es útil cuando necesitas evaluar varias condiciones distintas   *");
                                System.out.println("* y ejecutar diferentes bloques de código en función de cuál      *");
                                System.out.println("*condición se cumple.                                             *");
                                System.out.println("*******************************************************************");
                                break;

                            case 3:
                                System.out.println("********************************************************************");
                                System.out.println("*******         3. Explicación ELSE                     ************");
                                System.out.println("********************************************************************");
                                System.out.println("*else es una estructura de control que se utiliza junto con if     *");
                                System.out.println("*para manejar el caso en el que la condición del if no se cumple   *");
                                System.out.println("* Es una forma de proporcionar una alternativa o una acción a      *");
                                System.out.println("* realizar cuando la condición evaluada en el if resulta ser false.*");
                                System.out.println("********************************************************************");
                                break;
                            case 4:
                                System.out.println("********************************************************************");
                                System.out.println("*******         4. PROGRAMA IF, ELSE, ELSE IF           ************");
                                System.out.println("********************************************************************");

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
                                System.out.println("******************************************************************");
                                System.out.println("*******             DO WHILE                               *******");
                                System.out.println("******************************************************************");
                                System.out.println("******************************************************************");
                                System.out.println("*                                                                *");
                                System.out.println("*  1. Explicación DO WHILE                                       *");
                                System.out.println("*  2. Programa DO WHILE                                          *");
                                System.out.println("*  3. Volver menú inicial                                        *");
                                System.out.println("******************************************************************");
                                System.out.println("Por favor digita tu mejor opción:  ");
                                opc8 = scannerMainFirst.nextInt();

                                switch (opc8){
                                    case 1:
                                        System.out.println("******************************************************************");
                                        System.out.println("*******         1. EXPLICACIÓN DO WHILE                 **********");
                                        System.out.println("******************************************************************");
                                        System.out.println("* Un bucle do while es una estructura de control de flujo que    *");
                                        System.out.println("* permite ejecutar un bloque de código repetidamente mientras se *");
                                        System.out.println("* cumple una condición. La característica distintiva del bucle   *");
                                        System.out.println("* do while es que el bloque de código se ejecuta al menos        *");
                                        System.out.println("* una vez antes de que se evalúe la condición.                   *");
                                        System.out.println("******************************************************************");
                                        break;
                                    case 2:
                                        System.out.println("******************************************************************");
                                        System.out.println("*******          2. PROGRAMA DO WHILE                   **********");
                                        System.out.println("******************************************************************");

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
                                        break;
                                    default:
                                        //System.out.println("Número no válido, por favor verifique");
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
                                System.out.println("******************************************************************");
                                System.out.println("*******              9. BUCLE WHILE                        *******");
                                System.out.println("******************************************************************");
                                System.out.println("******************************************************************");
                                System.out.println("*                                                                *");
                                System.out.println("*  1. Explicación de WHILE                                       *");
                                System.out.println("*  2. Programa de While                                          *");
                                System.out.println("*  3. Volver menú inicial                                        *");
                                System.out.println("*                                                                *");
                                System.out.println("******************************************************************");
                                System.out.println("Por favor digita tu mejor opción:  ");
                                opc9 = scannerMainFirst.nextInt();

                                switch (opc9) {
                                    case 1:
                                        System.out.println("******************************************************************");
                                        System.out.println("*******         1. EXPLICACIÓN WHILE                    **********");
                                        System.out.println("******************************************************************");
                                        System.out.println("* Como su nombre indica (while significa mientras), repetir una  *");
                                        System.out.println("* acción en un bucle siempre y cuando se cumpla una condición    *");
                                        System.out.println("* booleana de control.                                           *");
                                        System.out.println("*                                                                *");
                                        System.out.println("*     while (condición) {// bloque de codigo que se repite       *");
                                        System.out.println("*     mientras la condición sea verdadera }                      *");
                                        System.out.println("*                                                                *");
                                        System.out.println("******************************************************************");
                                        break;
                                    case 2:
                                        System.out.println("******************************************************************");
                                        System.out.println("*******           2. PROGRAMA WHILE                     **********");
                                        System.out.println("******************************************************************");
                                        System.out.println("*                                                                *");
                                        System.out.println("* ¿Quieres saber cuanto es la sumatoria desde el número 1 hasta  *");
                                        System.out.println("*  llegar al número ingresado?                                   *");
                                        System.out.println("*  1. Si                                                         *");
                                        System.out.println("*  2. No                                                         *");
                                        System.out.println("*  Ingresa la opción :                                           *");
                                        System.out.println("******************************************************************");
                                        opc92 = scannerMainFirst.nextInt();

                                        switch (opc92) {
                                            case 1:
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
                                System.out.println("******************************************************************");
                                System.out.println("*******             10. BUCLE FOR                          *******");
                                System.out.println("******************************************************************");
                                System.out.println("******************************************************************");
                                System.out.println("*                                                                *");
                                System.out.println("*  1. Explicación de FOR                                         *");
                                System.out.println("*  2. Programa de For                                            *");
                                System.out.println("*  3. Volver menú inicial                                        *");
                                System.out.println("*                                                                *");
                                System.out.println("******************************************************************");
                                System.out.println("Por favor digita tu mejor opción:  ");
                                opc10 = scannerMainFirst.nextInt();

                                switch (opc10) {
                                    case 1:
                                        System.out.println("******************************************************************");
                                        System.out.println("*******         1. EXPLICACIÓN FOR                      **********");
                                        System.out.println("******************************************************************");
                                        System.out.println("* La sentencia “for” en Java es una estructura de control de     *");
                                        System.out.println("* ciclo que se utiliza para ejecutar un bloque de código una     *");
                                        System.out.println("* cantidad determinada de veces.                                 *");
                                        System.out.println("*                                                                *");
                                        System.out.println("*     for (inicialización;condición;expresion_de_interacción) {  *");
                                        System.out.println("*     bloque de código que se ejecuta en cada interacción}       *");
                                        System.out.println("*                                                                *");
                                        System.out.println("******************************************************************");
                                        break;
                                    case 2:
                                        System.out.println("******************************************************************");
                                        System.out.println("*******           2. PROGRAMA FOR                       **********");
                                        System.out.println("******************************************************************");
                                        System.out.println("*                                                                *");
                                        System.out.println("* ¿Quieres saber cuanto es la sumatoria desde el número 1 hasta  *");
                                        System.out.println("*  llegar al número ingresado?                                   *");
                                        System.out.println("*  1. Si                                                         *");
                                        System.out.println("*  2. No                                                         *");
                                        System.out.println("*  Ingresa la opción :                                           *");
                                        System.out.println("******************************************************************");
                                        opc102 = scannerMainFirst.nextInt();

                                        switch (opc102) {
                                            case 1:
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
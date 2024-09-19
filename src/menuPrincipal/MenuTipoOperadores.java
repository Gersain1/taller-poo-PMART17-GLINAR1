package menuPrincipal;

public class MenuTipoOperadores {

    public static void TipoOperadores (){
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
    }
    public static void TipoOperadoresAritmeticos () {
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

    }
    public static void TipoOperadoresRelacionales() {
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

    }
    public static void TipoOperadoresLogicos (){
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

    }
         public static void TipoOperadoresAsignacion () {
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

         }
         public static void TipoOperadoresIncDec(){
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

         }
}

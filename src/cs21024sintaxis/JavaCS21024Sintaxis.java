package cs21024sintaxis;

// @author Iván Alexander Carranza Sánchez

public class JavaCS21024Sintaxis {
        final int MAXIMO = 15; //Declaración de una variable constante
    public static void main(String[] args) {
        /*
             ||===============================================||
             ||    DECLARACIÓN Y INICIALIZACIÓN DE VARIABLES  ||
             ||          (TIPOS DE VARIABLES Y CONVERSIÓN)    ||
             ||===============================================||
        */
        
         //---------DECLARACIÓN DE VARIABLES Y INICIALIZACIÓN---------
            //Númericas
               //Enteros
               byte bit = 0; // 1 Byte
               short numeroCorto = 9999; // 2 Byte
               int entero = 9999; // 4 Byte
               long largo = 949494L; // 8 Byte

               //Decimales
               float flotante = 4.4f; // 4 Byte 
               double real = 4.4; // 8 Byte

            //Alfanumericos
               char caracter = 'C'; // 2 Byte (Codigo Unicode)

            // Logico
               boolean logico = false; // 1 Byte (true or false)
               System.out.println("LOS BOOLEAN NO SE PUEDE CONVERTIR A NINGUN OTRO TIPO DE DATO "+logico);
               
        //---------CONVERSIÓN DE UN VALOR A OTRO---------
            //Conversión de menor a mayor byte (Directa)
                real = flotante + real; // 8 Byte = 4 y 8 Byte (Suma Decimal)
                real = real + largo;     // 8 Byte = 8 y 4 Byte (Suma Enteros y Decimal)
                real = entero;             // 4 a 8 Byte (Entero a Decimal)
                largo = largo + bit + numeroCorto; // 8 Byte = 8, 1 y 2 Byte (Suma Enteros)
                System.out.println("El resultado final de conversiones directas en DOUBLE es: "+ real);
                System.out.println("El resultado final de conversiones directas en LONG es: "+ largo);
                
            //Conversión de mayor a menor byte (Cast)
                real = (double)caracter; //Se convierte el caracter en equivalencia codigo ASCII
                flotante = (float)real;     // 8 Byte a 4 Byte
                numeroCorto= (short)flotante;    // 4 Byte a 2 Byte
                caracter = (char)numeroCorto;  // 2 Byte a 2 Byte
                System.out.println("El resultado final de conversiones con casting en DOUBLE es: "+ real);
                System.out.println("El resultado final de conversiones con casting en CHAR es: "+ caracter);
       
        //---------CARACTERES ESPECIALES (SECUENCIA DE ESCAPE)---------
                //Escape BACKSPACE
                 System.out.println("ESTO ES RETROCESO\b");
                //Escape TABULADOR
                System.out.println("ESTO ES \t TABULADOR");
                //Escape NUEVA LINEA
                System.out.println("ESTO ES NUEVA LINEA\n");
                //Escape SALTO DE PAGINA
                System.out.println("ESTO ES SALTO\f DE PAGINA");
                //Escape RETORNO DE CARRO: mueve el cursor al comienzo de la línea sin avanzar a la siguiente linea.
                System.out.println("ESTO ES \rRETORNO DE CARRO");
                //Escape DOBLE COMILLA
                System.out.println("ESTO ES DOBLE COMILLA\"");
                //Escape COMILLA SIMPLE
                System.out.println("ESTO ES COMILLA SIMPLE\'");
    }
    
}

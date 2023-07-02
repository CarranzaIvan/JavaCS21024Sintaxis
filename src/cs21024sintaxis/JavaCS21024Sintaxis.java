package cs21024sintaxis;

// @author Iván Alexander Carranza Sánchez

public class JavaCS21024Sintaxis {
    public static void main(String[] args) {
        /*
             ||===============================================||
             ||    DECLARACIÓN Y INICIALIZACIÓN DE VARIABLES      ||
             ||          (TIPOS DE VARIABLES Y CONVERSIÓN)                 ||
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
            
        //---------CONVERSIÓN DE UN VALOR A OTRO---------
            //Conversión de menor a mayor byte (Directa)
                real = entero; // 4 a 8 Byte (Entero a Decimal)
                real = flotante + real; // 8 Byte = 4 y 8 Byte (Suma Decimal)
                largo = largo + bit + numeroCorto; // 8 Byte = 8, 1 y 2 Byte (Suma Enteros)
                real = real + largo; // 8 Byte = 8 y 4 Byte (Suma Enteros y Decimal)
                System.out.println("El resultado final de conversiones directas es: "+ real);
            
            //Conversión de mayor a menor byte (Cast)
                
    }
    
}

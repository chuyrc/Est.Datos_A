package practicas_clase_u3;

public class UsoDeExcepciones_Pila {
    
    public static void main(String[] args) {
        try {
            metodo1();
        }catch(Exception e) {
            System.err.printf("%s\n\n",e.getMessage());
            //  Imprime el rastreo de la pila de la excepción
            e.printStackTrace();
            //  Obtiene la información del ratreo de la pila
            StackTraceElement[] elementosRastreo = e.getStackTrace();
            System.out.println("\nRastreo de la pila getStrackTrace()");
            System.out.println("Clase\t\t\tArchivo\t\t\tLinea\tMétodo");
        }
    }
    
}
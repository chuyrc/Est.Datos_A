/*
    PRACTICA 1 DE LA UNIDAD 3
    Uso de los metodos de la clase stack sin usar la clase definida (stack)
*/

package practicas_clase_u3;
import java.util.Scanner;

public class PC_1 {
    
    public static void main(String[] args) {
        Pila_Sin_Stack objeto = new Pila_Sin_Stack();
        Scanner opcion = new Scanner(System.in);
        int seleccion;
        
        do{
            //  Se crea un menú sencillo para la pila
            System.out.println("Menu de pila: ");
            //  Se llama al metodo para insertar el tope
            System.out.println("1.- Push: ");
            //  Se llama al metodo para sacar del tope de la pila
            System.out.println("2.- Pop: ");
            //  Ver pila completa
            System.out.println("3.- Mostrar completa: ");
            System.out.println("4.- Salida: ");
            System.out.println("Por favor seleccione la opcion: ");
            seleccion = opcion.nextInt();
            
            switch(seleccion) {
                case 1: objeto.push();
                    break;
                case 2: objeto.push();
                    break;
                case 3: objeto.push();
                    break;
                default:
                    System.err.println("ERROR\n Opción invalida");
            }
        }while(seleccion != 4);
    }
    
}
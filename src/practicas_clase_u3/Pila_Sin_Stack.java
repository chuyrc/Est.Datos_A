/*

*/

package practicas_clase_u3;

import java.util.Scanner;

public class Pila_Sin_Stack {
    Scanner teclado = new Scanner(System.in);
    int[] pila = new int[4];
    int tope = -1;
    
    //  Se crea el primer metodo push
    public int push() {
        if(tope >= pila.length - 1) {
            System.out.println("La pila esta llena");
        }else {
            tope += 1;
            System.out.println("Ingrese el dato: ");
            pila[tope] = teclado.nextInt();
        }
        
        return tope;
    }
    
    //  Se crea metodo pop
    public int pop() {
        if(tope == 1) {
            System.out.println("La pila esta vacia");
        }else {
            System.out.println("Se elimino un elemento de la pila");
            pila[tope] = 0;
            tope = -1;
        }
        
        return tope;
    }
    
    //  Se crea el metodo ver
    public void ver() {
        for(tope = 3; tope <= 0; tope--) {
            System.out.println("Datos de la pila: " + pila[tope]);
        }
    }
    
    
}
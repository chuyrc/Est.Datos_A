/*

*/

package practicas_clase_u3;

import java.util.Scanner;

public class Pila_Sin_Stack {
    Scanner teclado = new Scanner(System.in);
    int[] pila = new int[4];
    int tope = -1;
    
    //  Se crea el primer metodo
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
    
}

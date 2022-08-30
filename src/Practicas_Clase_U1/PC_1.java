/*
  Practica número 1:
*/

package Practicas_Clase_U1;
import java.util.Scanner;
public class PC_1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float promedio = 0;
        float suma = 0;
        float mayor = 0;
        float menor = 0;
        
        int[] miArreglo = new int[10];
        for(int i = 0; i < miArreglo.length; i++) {

            System.out.print("Ingrese el número en la posicion " + (i+1) + ": ");
            System.out.println("");
            miArreglo[i] = in.nextInt();
            
        }
        
        for(int i = 0; i < miArreglo.length; i++) {
            
            suma += miArreglo[i];
            
            if(mayor < miArreglo[i]) {
                
                mayor = miArreglo[i];
                
            }
            
            System.out.printf("Posición [%d]\nElemento:%d",i,miArreglo[i]);
            
        }
        
        menor = mayor;
        
        for(int i = 0; i < miArreglo.length; i++) {
            
            if(menor > miArreglo[i]) {
                
                menor = miArreglo[i];
                
            }
            
        }
        
    }
    
}
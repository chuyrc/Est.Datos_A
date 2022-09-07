/*
 Practica clase 3: Notación matematica
*/
package Practicas_Clase_U1;
import javax.swing.JOptionPane;

public class PC_3 {

    public static void main(String args[])  {
     
        PC_3 objeto = new PC_3();
     
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos del array"));
        int[] array = new int[tamanio];
     
        for(int i = 0; i < array.length; i++) {
         
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posición: " + (i+1)));
         
        }
     
        objeto.printSumaYProducto(array);
        objeto.printPares(array);
        objeto.printPares(array,1);
     
    }

    public void printSumaYProducto(int[] array) {
     
        int suma = 0;
        int producto = 1;
     
        for(int i = 0; i < array.length; i++) {
         
            suma += array[i];
            producto *= array[i];
         
        }
     
        System.out.println("Suma:" + suma + "\nProducto: " + producto);
     
    }

    public void printPares(int[] array) {
     
        for(int i = 0; i < array.length; i++) {
         
            for(int j = 0; j < array.length; j++) {
             
                System.out.println(array[i] + ", " + array[j]);
             
            }
         
        }
     
    }

    public void printPares(int[] array, int num) {
     
        for(int i = 0; i < array.length; i++) {
         
            for(int j = i + 1; j < array.length; j++) {
             
                System.out.println(array[i] + ", " + array[j]);
             
            }
         
        }
     
    }
    
    public void printArrays(int[] arrayA,int[] arrayB) {
     
        for(int a:arrayA) {
          
            for(int b:arrayB) {
             
                if(a > b) {
                
                    System.out.println(a + "," + b);
                
                }
             
            }
          
        }
     
    }
 
    //  Se utiliza la notación o(n) pero a la inversa
    public static void reverse(int[] array) {
    
        for(int i = 0; i < array.length/2; i++) {
        
            int other = array.length - i - 1;
            int temp = array[i];
         
            array[i] = array[other];
            array[other] = temp;
         
        }
    /*
      ¿El resultado es el mismo, si o no y porque?
      ¿Se podria generar una constante que NO se necesita?
    */
    }
    /*
      Cual de las siguientes lineas es igual a O(n):
      1. o(n+p) en donde p=n/2
      2. o(2n)
      3. o(n+m)
      Encontrar la(s) expresión(es) similar(es) a o(n)
    */
}
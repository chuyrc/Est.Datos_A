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

}

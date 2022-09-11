/*
 Practica clase 3: Notación matematica
*/

package practicas_clase_u1;
import javax.swing.JOptionPane;

public class PC_3 {

    public static void main(String args[])  {
        PC_3 objeto = new PC_3();
     
        int[] array = new int[Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos del primer array"))];
     
        for(int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posición: " + (i+1) + " del primer array"));
        }
     
        int[] array2 = new int[Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos del segundo array"))];
     
        for(int i = 0; i < array.length; i++) {
            array2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la posición: " + (i+1) + " del segundo array"));
        }
     
        System.out.println("METODO SUMA Y PRODUCTO");
        objeto.printSumaYProducto(array);
        System.out.println("\nMETODO PARES 1");
        objeto.printPares(array);
        System.out.println("\nMETODO PARES 2");
        objeto.printPares(array,1);
        System.out.println("\nMETODO CON DOS ARRAYS");
        objeto.printArrays(array,array2);
        System.out.println("\nMETODO REVERSE");
        reverse(array);
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
        //  Imprime el arreglo como se introduce
        System.out.print("Array normal\n [");
        for(int arreglo:array) {
            System.out.print(arreglo + ",");
        }
        System.out.println("]");
     
        for(int i = 0; i < array.length/2; i++) {
            int other = array.length - i - 1;
            int temp = array[i];
         
            array[i] = array[other];
            array[other] = temp;
        }
     
        // Imprime el arreglo al reves
        System.out.print("Array al reves\n [");
        for(int arreglo:array) {
            System.out.print(arreglo + ",");
        }
        System.out.println("]");
     
        /*
            ¿El resultado es el mismo, si o no y porque?
                El resultado será diferente, ya que el codigo va a intercambiar
                los elementos del array al reves.
            ¿Se podria generar una constante que NO se necesita?
                Si se podría, pero por lo que hace el algoritmo, no
                tendría ningún tipo de sentido.
        */
    }
    /*
        Cual de las siguientes lineas es igual a O(n):
        1. o(n+p) en donde p=n/2
        2. o(2n)
        3. o(n+m)  
        Encontrar la(s) expresión(es) similar(es) a o(n)
            La expresión similar es la tercera o(n+m).
    */

}

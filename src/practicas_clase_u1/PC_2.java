/*
  Practica clase 2: Llenar una matriz de 3x3 y calcular el promedio y la suma de cada fila/renglon
*/

package practicas_clase_u1;
import javax.swing.JOptionPane;


public class PC_2 {

    public static void main(String agrs[]) {
        int matriz[][] = new int[3][3];
      
        //  Se solicita al usuario el ingreso de datos
        float sumaFila = 0;
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                int k = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número en la fila " + i + " Columna " + j + ": "));
                matriz[i][j] = k;
            }
        }
     
      
        for(int i = 0; i < matriz.length; i++) {
            sumaFila = 0;
          
            for(int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
                System.out.print(String.format("%d  ",matriz[i][j]));
            }
         
            System.out.print(String.format("Suma fila: %.2f, Promedio fila: %.2f",sumaFila,sumaFila/matriz.length));
            System.out.println();
        }
    }

}

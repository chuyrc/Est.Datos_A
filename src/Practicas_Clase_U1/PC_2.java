package Practicas_Clase_U1;
import java.util.Scanner;

public class PC_2 {

    public static void main(String agrs[]) {
        int matriz[][] = new int[3][3];
      
        //  Se solicita al usuario el ingreso de datos
        Scanner in = new Scanner(System.in);
        float sumaFila = 0;
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                System.out.print("Ingrese el número en la fila " + i + " Columna " + j + ": ");
                matriz[i][j] = in.nextInt();
            }
        }
     
        in.close();
      
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

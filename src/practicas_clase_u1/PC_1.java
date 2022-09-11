/*
  Practica número 1: Calcular el promedio, la suma, el mayor y el menor de 10 numeros
*/

package practicas_clase_u1;
import javax.swing.JOptionPane;

public class PC_1 {
    
    public static void main(String[] args) {
        float promedio = 0;
        float suma = 0;
        float mayor = 0;
        float menor = 0;
        
        int[] miArreglo = new int[10];
     
        for(int i = 0; i < miArreglo.length; i++) {
            int j = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: " + (i+1) + ": "));
            miArreglo[i] = j;
        }
     
        System.out.println("\nARREGLO");
        
        for(int i = 0; i < miArreglo.length; i++) {
            suma += miArreglo[i];
            
            if(mayor < miArreglo[i]) {
                mayor = miArreglo[i];
            }
            
            System.out.printf("Posición [%d] Elemento: %d\n",i,miArreglo[i]);
        }
        
        menor = mayor;
        
        for(int i = 0; i < miArreglo.length; i++) {
            if(menor > miArreglo[i]) {
                menor = miArreglo[i];
            }
        }
     
        promedio = suma/miArreglo.length;
        System.out.println("\nNUMEROS IGUALES");
        int cont;
     
        for (int i = 0; i < miArreglo.length; i++){
            cont = 0;
         
            for(int j = 0; j < miArreglo.length ; j++){
                if(miArreglo[i] == miArreglo[j]){
                    cont++;
                }
            }
            System.out.println(String.format("El numero %d se repite %d veces ", miArreglo[i], cont));
        }
        System.out.println("\nPROMEDIO/SUMA/MAYOR/MENOR");
        System.out.println(String.format("Suma: %.2f\nPromedio: %.2f\nMayor: %.2f\nMenor: %.2f",suma,promedio,mayor,menor));
    }
    
}

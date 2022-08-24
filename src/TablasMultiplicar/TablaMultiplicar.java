package TablasMultiplicar;
import javax.swing.JOptionPane;

public class TablaMultiplicar {

    public static void main(String args[]) {
     
        System.out.println("\nTABLAS DE MULTIPLICAR POR METODO\n");
        multiplicar(Integer.parseInt(JOptionPane.showInputDialog("INGRESE POR CUAL NUMERO MULTIPLICAR (1-10)")));
        
        System.out.println("\nTABLAS DE MULTIPLICAR DEL 1 AL 10 POR CICLO FOR\n");
        for(int i = 1; i <= 10; i++) {
         
            System.out.println("TABLA DEL " + i);
         
            for(int j = 1; j <= 10; j++) {
             
                System.out.println("  " + i + " X " + j + " = " + i * j);
             
            }
         
            System.out.println();
         
        }
     
    }
    
    private static void multiplicar(int n) {
        
        System.out.println("1 x " + n +": = " + 1 * n);
        System.out.println("1 x " + n +": = " + 1 * n);
        System.out.println("1 x " + n +": = " + 1 * n);
        System.out.println("1 x " + n +": = " + 1 * n);
        System.out.println("1 x " + n +": = " + 1 * n);
        System.out.println("1 x " + n +": = " + 1 * n);
        System.out.println("1 x " + n +": = " + 1 * n);
        System.out.println("1 x " + n +": = " + 1 * n);
        System.out.println("1 x " + n +": = " + 1 * n);
        System.out.println("1 x " + n +": = " + 1 * n);

    }

}
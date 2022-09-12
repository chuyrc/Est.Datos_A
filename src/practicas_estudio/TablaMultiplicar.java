package practicas_estudio;

public class TablaMultiplicar {

    public static void main(String args[]) {    
        TablaMultiplicar p = new TablaMultiplicar();
     
        System.out.println("TABLAS DE MULTIPLICAR POR METODO\n");
        p.multiplicar(1);
        
        System.out.println("\nTABLAS DE MULTIPLICAR DEL 1 AL 10 POR CICLO FOR\n");
     
        for(int i = 1; i <= 10; i++) {
            System.out.println("TABLA DEL " + i);
         
            for(int j = 1; j <= 10; j++) {
                System.out.println(" " + i + " X " + j + " = " + i * j);
            }         
            System.out.println();
        }
    }

    public void multiplicar(int n) {
        if(n <= 10){
            System.out.println("TABLA DEL " + n);
            System.out.println(" " + n + " x 1 = " + 1 * n);
            System.out.println(" " + n + " x 2 = " + 2 * n);
            System.out.println(" " + n + " x 3 = " + 3 * n);
            System.out.println(" " + n + " x 4 = " + 4 * n);
            System.out.println(" " + n + " x 5 = " + 5 * n);
            System.out.println(" " + n + " x 6 = " + 6 * n);
            System.out.println(" " + n + " x 7 = " + 7 * n);
            System.out.println(" " + n + " x 8 = " + 8 * n);
            System.out.println(" " + n + " x 9 = " + 9 * n);
            System.out.println(" " + n + " x 10 = " + 10 * n + "\n");
            multiplicar(n + 1);
        }
    }
    
}

package TablasMultiplicar;

public class TablaMultiplicar {

    public static void main(String args[]) {
     
        System.out.println("1 x 1: = " + 1 * 1);
        System.out.println("1 x 2: = " + 1 * 2);
        System.out.println("1 x 3: = " + 1 * 3);
        System.out.println("1 x 4: = " + 1 * 4);
        System.out.println("1 x 5: = " + 1 * 5);
        System.out.println("1 x 6: = " + 1 * 6);
        System.out.println("1 x 7: = " + 1 * 7);
        System.out.println("1 x 8: = " + 1 * 8);
        System.out.println("1 x 9: = " + 1 * 9);
        System.out.println("1 x 10: = " + 1 * 10 + "\n");
     
        for(int i = 1; i <= 10; i++) {
         
            System.out.println("TABLA DEL " + i);
         
            for(int j = 1; j <= 10; j++) {
             
                System.out.println("  " + i + " X " + j + " = " + i * j);
             
            }
         
            System.out.println();
         
        }
     
    }

}

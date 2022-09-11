package practicas_clase_u2;

public class PC_1 {

    public static void main(String args[]) {
        PC_1 objeto = new PC_1();
     
        try {
            System.out.println(objeto.factorialRecursividad(-4));
        }catch(IllegalArgumentException e) {
            System.err.println("No se puede calcular el factorial de un número negativo");
        }
     
        try {
            System.out.println(objeto.factorialCiclo(5));
        }catch(IllegalArgumentException e) {
            System.err.println("No se puede calcular el factorial de un número negativo");
        }
    }

    public int factorialRecursividad(int n) {
        if(n < 0)
            throw new IllegalArgumentException("NO SE PUEDE CALCULAR EL FACTORIAL A UN NÚMERO NEGATIVO");
        if(n == 0)
            return 1;
     
        return n * factorialRecursividad(n-1);
    }

    public int factorialCiclo(int n) {
        if(n < 0)
            throw new IllegalArgumentException("NO SE PUEDE CALCULAR EL FACTORIAL A UN NÚMERO NEGATIVO");
        if(n == 0)
            return 1;
     
        int factorial = 1;
     
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }

}


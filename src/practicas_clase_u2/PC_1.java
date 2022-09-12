package practicas_clase_u2;

public class PC_1 {

    public static void main(String args[]) {
        PC_1 objeto = new PC_1();
         
        System.out.println(objeto.factorialRecursividad(5));
        System.out.printf("El factorial es: %d\n",objeto.factorialCiclo(5));
    }

    public int factorialRecursividad(int n) {
        if(n < 0)
            throw new IllegalArgumentException("NO SE PUEDE CALCULAR EL FACTORIAL DE UN NÚMERO NEGATIVO");
        if(n == 0 || n == 1)
            return 1;
        if(n == 2)
            return 2;
         
        return n * factorialRecursividad(n-1);
    }

    public int factorialCiclo(int n) {
        if(n < 0)
            throw new IllegalArgumentException("NO SE PUEDE CALCULAR EL FACTORIAL A UN NÚMERO NEGATIVO");
        if(n == 0)
            return 1;
        int factorial = 1;
        int suma = 0;
        
        for(int i = 1; i <= n; i++) {
            factorial *= i;
            suma += i;
        }
        System.out.printf("Suma de los factoriales desde cero hasta %d es: %d%n",n,suma);
        
        return factorial;
    } 

}


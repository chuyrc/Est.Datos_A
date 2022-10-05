/*
  Se analizan expresiones algebraicas:
    Postfija: AB+
    Prefija: +AB
*/

package practicas_clase_u3;
import java.util.Scanner;
import java.util.Stack;

public class Infija {
    
    public static void main(String[] args) {
        System.out.print("Escribe una expresion algebraica: ");
        Scanner sc = new Scanner(System.in);
        
        //  Depurar la expresión algebraica
        String expr = depurar(sc.nextLine());
        String[] arrayInfix = expr.split("");
        
        //  Declaración de pilas (Se hace uso de clase predefinida)
        Stack<String> e = new Stack();  //Pila de entrada
        Stack<String> p = new Stack();  //Pila temporal de operadores
        Stack<String> s = new Stack();  //Pila de salida
        
        //  Añadir el arreglo a la pila de entrada (e)
        for(int i = arrayInfix.length - 1; i >= 0; i--){
            e.push(arrayInfix[i]);
        }
        
        //  Se considera como excepción infijo o posfijo
        try {
            
            //  Algoritmo de una expresión infija/posfija
            while(!e.isEmpty()) {
                
                //  peek examina el ultimo elemento de la pila
                switch(pref(e.peek())) {
                    case 1:
                        p.push(e.pop());
                        break;                        
                    case 3:
                    case 4:               
                        while(pref(p.peek()) >= pref(e.peek())) {
                            s.push(p.pop());
                        }
                        
                        //  Desapila los elementos
                        p.push(e.pop());
                        break;
                    case 2:
                        while(!p.peek().equals("(")) {
                            s.push(p.pop());
                        }
                        p.pop();
                        e.pop();
                        break;
                    default:
                        s.push(e.pop());
                }
            }
            
            //  Eliminación de impurezas en las expresiones algebraicas
            String infix = expr.replace("","");
            String postFix = s.toString().replaceAll("[\\]\\[,]"," ");
            
            //  Mostrar resultados
            System.out.println("Expresión INFIJA:" + infix);
            System.out.println("Expresión POSTFIJA:" + postFix);
            
        }catch(Exception ex){
            System.err.println("Se ha producido un error");
            System.out.println(ex);
        }
    }
    
    //  Depurar la expresión algebraica
    private static String depurar(String s) {
        s = s.replaceAll("\\s+","");
        s = "(" + s + ")";
        String simbols = "+-*/()";
        String str = "";
     
        //  Dejar espacio entre los operadores
        for(int i = 0; i < s.length(); i++) {
            if(simbols.contains("" + s.charAt(i))) 
                str += "" + s.charAt(i) + "";
            else 
                str += s.charAt(i);
        }
      
        return str.replaceAll("\\s+","");
    }
  
    //  Método para validar la jerarquia de los operadores
    private static int pref(String op) {
        int prf = 99;
     
        if(op.equals("^"))
            prf = 5;
        if(op.equals("*") || op.equals("/"))
            prf = 4;
        if(op.equals("+") || op.equals("-"))
            prf = 3;
        if(op.equals(")"))
            prf = 2;
        if(op.equals("("))
            prf = 1;
        
        return prf;
    }  

}

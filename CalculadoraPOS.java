// TODO: Auto-generated Javadoc
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The Class CalculadoraPOS.
 *
 * @author Mejia
 */
/**
 * @author jiio2
 *1/03/2021 - 23:47:29
 * 
 */
public class CalculadoraPOS {
    
    
    
    /**
     * Checks if is operator.
     *
     * @param c the c
     * @return true, if is operator
     */
    private boolean isOperator(char c){// definimos los posibles operadores
        return (c=='+'|c=='-'|c=='*'|c=='/');
    }
    
    /**
     * Sumar.
     *
     * @param stack the stack
     * @return the double
     */
    private double sumar(PILA stack){// definimos la suma
        double b = Double.parseDouble(stack.pop().toString());
        double a = Double.parseDouble(stack.pop().toString());
        return a+b;
    }
    
    /**
     * Restar.
     *
     * @param stack the stack
     * @return the double
     */
    private double restar(PILA stack){// definimos la resta
        double b = Double.parseDouble(stack.pop().toString());
        double a = Double.parseDouble(stack.pop().toString());
        return a-b;
    }
    
    /**
     * Multiplicar.
     *
     * @param stack the stack
     * @return the double
     */
    private double multiplicar(PILA stack){// definimos el producto
        double b = Double.parseDouble(stack.pop().toString());
        double a = Double.parseDouble(stack.pop().toString());
        return a*b;
    }
    
    /**
     * Dividir.
     *
     * @param stack the stack
     * @return the double
     */
    private double dividir(PILA stack){// definimos la divisiñon
        double b = Double.parseDouble(stack.pop().toString());
        double a = Double.parseDouble(stack.pop().toString());
        return a/b;
    }
    
    /**
     * Resolver.
     *
     * @param input the input
     * @param stack the stack
     * @return the double
     */
    public double resolver(String input,PILA stack){// resolvemos el problema
        double res = 0;// la variable resultado
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);// leemos lo que está en el .txt
            if(c!=' '){
                if(!isOperator(c)){
                    stack.push(Character.getNumericValue(c));
                } else{
                    switch(c){// revisamos los posibles casos
                        case '+':
                            stack.push(sumar(stack));
                            break;
                        case '-':
                            stack.push(restar(stack));
                            break;
                        case '*':
                            stack.push(multiplicar(stack));
                            break;
                        case '/':
                            stack.push(dividir(stack));
                            break;
                    }
                }
            }
        }
        res = (double) stack.pop();
        return res;// regresamos el resultado
    }
    
}

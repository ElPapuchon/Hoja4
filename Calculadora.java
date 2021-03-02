/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
    import java.util.Stack; 
import javax.swing.JOptionPane;
    
// TODO: Auto-generated Javadoc
/**
 * The Class Calculadora.
 *
 * @author Mejia
 */
/**
 * @author jiio2
 *1/03/2021 - 22:50:50
 * 
 */
public class Calculadora implements Icalculadora{
    
    /**
     * Prec.
     *
     * @param ch the ch
     * @return the int
     */
    public int Prec(char ch) 
    { 
        switch (ch) // hacemos un switch case para los siguiente casos 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    }
    
    /**
     * In to pos.
     *
     * @param op the op
     * @param stack the stack
     * @return the string
     */
    public String inToPos(String op, PILA stack){
        String pos = "";
          
        for (int i = 0; i<op.length(); ++i) 
        { 
            char c = op.charAt(i); 
            // si el caracter escaneado es un operando, lo agregamos a la salida

            if (Character.isLetterOrDigit(c)) 
                pos += c; 
            // si el caracter escaneado es un paréntesis "(" lo pusheamos a la pila   
            else if (c == '(') 
                stack.push(c); 
            // si el caracter  escaneado es un paréntesis ")" lo sacamos de la pila hasta que se encuentre "("
            else if (c == ')') 
            { 
                while (!stack.empty() &&  
                        (char) stack.peek() != '(') 
                    pos += stack.pop(); 
                  
                    stack.pop(); 
            } 
            else // encontramos un operador
            { 
                while (!stack.empty() && Prec(c)  
                         <= Prec((char) stack.peek())){ 
                    
                    pos += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
       
        // sacamos todos los operadores de la pila
        while (!stack.empty()){ 
            if((char) stack.peek() == '(') 
                return "Invalid Expression"; 
            pos += stack.pop(); 
         } 
        return pos; 
    }
    
    /**
     * Select.
     *
     * @param type the type
     * @return the pila
     */
    public PILA select(int type){
        switch(type){// hacemos los respectivos casos si la lista es un arraylist o un vector
            case 0:
                return new ARRAYLIST();
            case 1:
                return new VECTOR();
            case 2:
                Object[] options = {"Simplemente enlazada",
                    "Doblemente enlazada"};
                return new LISTA(JOptionPane.showOptionDialog(null,
                    "Â¿QuÃ© tipo de lista quiere usar?",
                    "Tipo de lista",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]));
            default:
                return null;
        }
        
    }
    
    /**
     * Resolver.
     *
     * @param input the input
     * @param stack the stack
     * @return the double
     */
    @Override
    public double resolver(String input,PILA stack) {
        CalculadoraPOS c = new CalculadoraPOS();// instanciamos una calculadoraPOs
        return c.resolver(inToPos(input,stack),stack);// resolvemos el problema
    }
    
}

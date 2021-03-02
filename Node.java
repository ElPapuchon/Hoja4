// TODO: Auto-generated Javadoc
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The Class Node.
 *
 * @author Mejia
 * @param <E> the element type
 */
/**
 * @author jiio2
 *1/03/2021 - 21:45:36
 * clase genérica nodo
 */
public class Node<E> {
    
    /** The item. */
    E item;  //creamos un objeto genérico
        
        /** The previous. */
        Node previous;  //para ir al nodo anterior
        
        /** The next. */
        Node next;  // para ir al siguiente
   
        /**
         * Instantiates a new node.
         *constructor
         * @param item the item
         */
        public Node(E item) {  
            this.item = item;  
        }  
}

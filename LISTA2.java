// TODO: Auto-generated Javadoc
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The Class LISTA2.
 *
 * @author Mejia
 * @param <E> the element type
 */
/**
 * @author jiio2
 *1/03/2021 - 22:14:37
 * 
 */
public class LISTA2<E> extends Listas<E>{
    
    /** The tail. */
    //la cabeza y la cola del nodo son nulos
    Node head, tail = null;  
   
    /**
     * Adds the node.
     *
     * @param item the item
     */
    //agrega un nodo a la lista 
    @Override
    public void addNode(E item) {  
        //Crea un nodo
        Node newNode = new Node(item);  
        // si la lista está vacía, la cabeza y la cola apunta al nuevo nodo
        if(head == null) {  
            head = tail = newNode;  
            //la cabeza anterior será nula 
            head.previous = null;  
            //la cola siguiente es nula
            tail.next = null;  
        }  
        else {  
            //agrega un nodo nuevo al final de la lista
            tail.next = newNode;  
            //el nuevo nodo apunta a la cola del anterior  
            newNode.previous = tail;  
            //el nuevo nodo se convierte en la nueva cola 
            tail = newNode;  
            //la cola del siguiente aputna a nulo  
            tail.next = null;  
        }  
    }  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejia
 */
/**
 * @author jiio2
 *1/03/2021 - 22:23:47
 * 
 */
public class LISTA1<E> extends Listas<E>{
    Node head; //cabea de la lista
   
    // m�todo para inserta un nodo nuevo
    @Override
    public void addNode(E data) 
    { 
        // crea un nuevo nodo con los datos brindados
        Node new_node = new Node(data); 
        new_node.next = null; 
   
        // si la lista enlazada est� vaci�a, entonces usa el nodo nuevo como cola
        if (head == null) { 
            head = new_node; 
        } 
        else { 
        	// de otra forma continua hasta el �ltimo nodo he inserta el nuevo nodo en esa posici�n.
            Node last = head; 
            while (last.next != null) { 
                last = last.next; 
            } 
   
            // inserta el nuevo nodo en el �ltimo
            last.next = new_node; 
        }  
    }
}

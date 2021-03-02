
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mejia
 * 
 */
/**
 * @author jiio2
 *1/03/2021 - 23:41:46
 * 
 */
public class LISTA<E> extends PILA<E>{
    /** The vector. */
	private Listas<E> vector;
        Node top;
	/**
	 * Instantiates a new vector.
	 */
	LISTA(int type) {
            if(type == 1){
                vector = new LISTA1();
            } else {
                vector = new LISTA2();
            }
            this.top = null;
	}

        @Override
	public void push(E x) // lo insertaamos al inicio
    {	// cramos un nuevo nodo
        Node temp = new Node(x);
        // verificamos que la lista esté llena. Si eso ocurre, insertar un elemento ocasionará uan sobrecarga
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        // ponemos las referencias en temp
        temp.next = top;
 
        // actualizamos al referencia
        top = temp;
    }

	/**
	 * Pop.
	 *
	 * @return the e
	 */
	@Override
	public E pop() {
		// verificamos una underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return null;
        }
 
        // actualizamos el puntero
        E temp = (E) top.item;
        top = (top).next;
        return temp;
	}

	/**
	 * Peek.
	 *
	 * @return the e
	 */
	@Override
	public E peek() {// selecciona un elemento del de la lista
		if (!empty()) {
            return (E) top.item;
        }
        else {
            System.out.println("Stack is empty");
            return null;
        }
	}

	/**
	 * Empty.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		// Nos indica si el vector es es vacï¿½a (True)/(False)
		return top == null;
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		// devuelve del vector
            int size = 0;
            for(Node n = top; n.next != null; n = n.next)
                size++; 
            return size;
	}
}

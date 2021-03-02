
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The Class ARRAYLIST.
 *
 * @author Mejia
 * @param <E> the element type
 */
/**
 * @author jiio2
 *1/03/2021 - 22:30:42
 * 
 */
public class ARRAYLIST<E> extends PILA<E>{
    /** The vector. */
	private ArrayList<E> vector;
	
	/**
	 * Instantiates a new vector.
	 */
	ARRAYLIST() {
		
		vector = new ArrayList<E>();
		
	}

	/**
	 * Push.
	 *
	 * @param item the item
	 */
	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		//agrega el "item" al final del vector
		vector.add(item);
			
	}

	/**
	 * Pop.
	 *
	 * @return the e
	 */
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		// guardamos el elemento que nos interesa
		E a = (E)vector.get(vector.size() - 1);
		
		vector.remove(vector.size() - 1);
		// remueve el �ltimo elemento del vector
		
		//regresa el elemento guardado
		return a;
	}

	/**
	 * Peek.
	 *
	 * @return the e
	 */
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		//selecciona el �ltimo elemento del vector
		return vector.get(vector.size()-1);
	}

	/**
	 * Empty.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		// Nos indica si el vector es es vac�a (True)/(False)
		return vector.isEmpty();
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
		return vector.size();
	}
}

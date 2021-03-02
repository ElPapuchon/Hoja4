import java.util.*;


// TODO: Auto-generated Javadoc
/**
 * The Class VECTOR.
 *
 * @param <E> the element type
 */

/**
 * @author jiio2
 *2/02/2021 - 12:06:57
 * 
 */
public class VECTOR<E> extends PILA<E>{
	
	/** The vector. */
	private Vector<E> vector;
	
	/**
	 * Instantiates a new vector.
	 */
	VECTOR() {
		
		vector = new Vector<E>();
		
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
		return vector.lastElement();
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

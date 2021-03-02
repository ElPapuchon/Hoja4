// TODO: Auto-generated Javadoc
/**
 * The Interface Stack.
 *
 * @param <E> the element type
 */

/**
 * @author jiio2
 *2/02/2021 - 11:36:22
 * 
 */
// es una interfaz gen�rica
public interface Stack<E>{
	
	   /**
   	 * Push.
   	 *
   	 * @param item the item
   	 */
   	public void push(E item); // agrega un elemento al stack
	   // pre: 
	   // post: item is added to stack
	   // will be popped next if no intervening push
	   
	   /**
   	 * Pop.
   	 *
   	 * @return the e
   	 */
   	public E pop(); // devuelve el �ltimo elemento agregado al stack y luego lo elimina
	   // pre: stack is not empty
	   // post: most recently pushed item is removed and returned
	   
	   /**
   	 * Peek.
   	 *
   	 * @return the e
   	 */
   	public E peek();// devuelve el �ltimo elemento agregado al stack
	   // pre: stack is not empty
	   // post: top value (next to be popped) is returned
	   
	   /**
   	 * Empty.
   	 *
   	 * @return true, if successful
   	 */
   	public boolean empty();// indica si el stack est� vac�o o no
	   // post: returns true if and only if the stack is empty
	   
	   /**
   	 * Size.
   	 *
   	 * @return the int
   	 */
   	public int size(); // nos da el tama�o del stack
	   // post: returns the number of elements in the stack

}

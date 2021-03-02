import static org.junit.Assert.assertEquals;

import org.junit.Test;


// TODO: Auto-generated Javadoc
/**
 * The Class LISTATest.
 */

/**
 * @author jiio2
 *2/03/2021 - 00:18:20
 * 
 */
public class LISTATest {
	
	/** The testlista. */
	LISTA testlista = new LISTA<Integer>(1);

	/**
	 * Test.
	 */
	@Test
	public void test() {
		
		boolean respuesta1 = (boolean) testlista.empty();
		assertEquals(true, respuesta1);
		
	}
	
	/**
	 * Sizetest.
	 */
	@Test
	public void sizetest() {
		
		testlista.push(1);
		testlista.push(2);
		
		int largo = testlista.size();
		
		assertEquals(1, largo);

	}


	/**
	 * Peektest.
	 */
	@Test
	public void peektest() {
		
		testlista.push(1);
		
		int last = (int) testlista.peek();
		
		assertEquals(1, last);

	}

}

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class VECTORTest.
 */

/**
 * @author jiio2
 *1/03/2021 - 23:54:23
 * 
 */
public class VECTORTest {
	

	/** The test vector. */
	private VECTOR testVector = new VECTOR<Integer>();
	
	
	/**
	 * Emptytest.
	 */
	@Test
	public void emptytest() {
		
		
		boolean respuesta1 = (boolean) testVector.empty();
		assertEquals(true, respuesta1);
		

	}
	
	/**
	 * Sizetest.
	 */
	@Test
	public void sizetest() {
		
		testVector.push(1);
		
		int largo = testVector.size();
		
		assertEquals(1, largo);

	}

	/**
	 * Peektest.
	 */
	@Test
	public void peektest() {
		
		testVector.push(1);
		
		int last = (int) testVector.peek();
		
		assertEquals(1, last);

	}
	
	
	
	
	
	
}

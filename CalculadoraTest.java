/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import javax.swing.JOptionPane;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculadoraTest.
 *
 * @author Mejia
 */
/**
 * @author jiio2
 *2/03/2021 - 01:20:38
 * 
 */
public class CalculadoraTest {
    
    /** The calculadora. */
    private Calculadora calculadoratest = new Calculadora();
    
    Object[] options = {"ArrayList",// creamos un array de opciones
            "Vector", "Lista"};
    
    PILA stack = calculadoratest.select(JOptionPane.showOptionDialog(null,
            "¿Qué tipo de pila quiere usar?",// pregunamos el tipo de pila
            "Tipo de pila",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]));
    
    /**
     * Instantiates a new calculadora test.
     */
    public CalculadoraTest() {
    }
    
    /**
     * Sets the up class.
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     * Tear down class.
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Sets the up.
     */
    @Before
    public void setUp() {
        calculadoratest = new Calculadora();
    }
    
    /**
     * Tear down.
     */
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    /**
     * Test suma.
     */
    // public void hello() {}
    @Test
    public void testSuma(){
        assertEquals(12,(int) calculadoratest.resolver("7+5", stack));
    }
    
    /**
     * Test resta.
     */
    @Test
    public void testResta(){
        assertEquals(2,(int) calculadoratest.resolver("7-5", stack));
    }
    
    /**
     * Test mult.
     */
    @Test
    public void testMult(){
        assertEquals(35,(int) calculadoratest.resolver("7*5", stack));
    }
    
    /**
     * Test div.
     */
    @Test
    public void testDiv(){
        assertEquals(3,(int) calculadoratest.resolver("9/3", stack));
    }
    
}

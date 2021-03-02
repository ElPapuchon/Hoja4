/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import javax.swing.JOptionPane;
// TODO: Auto-generated Javadoc

/**
 * The Class Main.
 *
 * @author Mejia
 */
/**
 * @author jiio2
 *1/03/2021 - 21:47:41
 * 
 */
public class Main {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String args[]){
        Calculadora calculadora = new Calculadora();// instancia,os un objeto de tipo calculadora
        Object[] options = {"ArrayList",// creamos un array de opciones
                    "Vector", "Lista"};
        PILA stack = calculadora.select(JOptionPane.showOptionDialog(null,
                    "¿Qué tipo de pila quiere usar?",// pregunamos el tipo de pila
                    "Tipo de pila",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]));
        try {
      File myObj = new File("datos.txt");// cargamos el .txt
      Scanner myReader = new Scanner(myObj);// creamos el scanner
      while (myReader.hasNextLine()) {//leemos el .txt
        String data = myReader.nextLine();
        System.out.println(calculadora.resolver(data,stack));// damos la respuesta
      }
      myReader.close();// cerramos el proceso
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");// esto es por si ocurre un error a la hora de leer el objeto
      e.printStackTrace();
    }

    }
}

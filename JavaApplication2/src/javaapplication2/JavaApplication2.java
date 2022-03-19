/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Yosmeri C. Cruz
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Calculadora miCalculadora = new Calculadora (10,7);
       //10 op 1 y 7 op 2
       int suma = miCalculadora.suma();
       System.out.println("la suma es: " + suma);
    }
                 
    
}

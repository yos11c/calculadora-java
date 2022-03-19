/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Yosmeri C. Cruz
 */
public class calculadora1 {
    private int operando1;
    private int operando2;
    
    public calculadora (){
        
    }
    public calculadora (int operando1, int operando2){
    this.operando1= operando1;
    this.operando2 = operando2;
    }
    
    //procedimientos
    public int sumar(){
        int suma = this.operando1 + this.operando2;
        return suma;
    }
    
    public int restar (){
        int restar = this.operando1 - this.operando2;
        return restar;
    }
    public int multiplicar (){
        int multiplicar = this.operando1 * this.operando2;
        return multiplicar;
    }
    public int dividir (){
        int dividir = this.operando1 / this.operando2;
        return dividir;
    }
    
    
     
}

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
    private int op1;
    private int op2;
    
    public calculadora (){
        
    }
    public calculadora (int op1, int op2){
    this.op1= op1;
    this.op2 = op2;
    }
    
    //procedimientos
    public int suma (){
        int suma = this.op1 + this.op2;
        return suma;
    }
    
    public int restar (){
        int restar = this.op1 - this.op2;
        return restar;
    }
    public int multiplicar (){
        int multiplicar = this.op1 * this.op2;
        return multiplicar;
    }
    public double dividir (){
        double dividir = (double)this.op1 / (double)this.op2;
        return dividir;
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author javam2018
 */
public class Calculadora {
    private int Valor1;
    private int Valor2;
    private double Resultado;

    public int getValor1() {
        return Valor1;
    }

    public void setValor1(int Valor1) {
        this.Valor1 = Valor1;
    }

    public int getValor2() {
        return Valor2;
    }

    public void setValor2(int Valor2) {
        this.Valor2 = Valor2;
    }

   public double getSuma(){
       this.Resultado=this.Valor1+this.Valor2;
       return this.Resultado;
   }
   public double getResta(){
   this.Resultado=this.Valor1-this.Valor2;
   return this.Resultado;
   }
   public double getMulti(){
   this.Resultado=this.Valor1*this.Valor2;
   return this.Resultado;
   }
   public double getDivision(){
   this.Resultado=this.Valor1/this.Valor2;
   return this.Resultado;
   }
}

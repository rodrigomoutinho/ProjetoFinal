/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author Rodrigo
 */
public class Calculadora extends Operacoes{
    
    private double valor1;
    private double valor2;
    
    public Calculadora(){
    }
    
    public Calculadora (double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
  public double getValor (){
      return valor1;
  }
  
  public void setValor1 (double valor1){
      this.valor1 = valor1;
  }
  
  public double getValor2(){
      return valor2;
  }
  
  public void setValor2(double valor2){
      this.valor2 = valor2;
  }

    String getValor1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



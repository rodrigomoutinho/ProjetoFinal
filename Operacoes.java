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
public abstract class Operacoes implements IOperacoes {
    
    @Override
    public double soma(double a, double b){
        return a + b;
    }
        @Override
    public double subtrair(double a, double b){
        return a - b;
    }
    
        @Override
    public double multiplicar(double a, double b){
        return a * b;
    }
    
        @Override
    public double dividir(double a, double b){
        return a / b;
    }
    
    
    @Override
    public double porcentagem(double a, double b){
        return a * b / 100;
    }
    
    
}

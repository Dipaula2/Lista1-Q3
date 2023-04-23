/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Saldo;

/**
 *
 * @author Gui
 */
public class Fornecedor extends Pessoa {
    
    private double valorCredito;
    private double valorDivida; 

    public Fornecedor(String nome, String endereço, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereço, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
    
    
    
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    
    
    public double obterSaldo(){
    double saldo = valorCredito - valorDivida;
    if (saldo < 0) {
        System.out.println("Saldo negativo: " + saldo);
    }
    return saldo;
}
    
   
    @Override
    public String toString(){
        return super.toString()
                + "\nValor Credito: " +valorCredito
                + "\nValor Divida: " +valorDivida
                + "\nSaldo: " + obterSaldo();
                
    }
    
    
}

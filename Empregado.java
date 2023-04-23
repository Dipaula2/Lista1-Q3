/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Saldo;

/**
 *
 * @author Gui
 */
public class Empregado extends Pessoa {
    
    private int codigoSetor;
    private double salarioBase;
    double imposto = 0.27;
   

    public Empregado(String nome, String endereço, String telefone,int codigoSetor,double salarioBase) {
        super(nome, endereço, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
   public double calcularSalario(){
       return  salarioBase * imposto ;
   } 
    
    @Override
    public String toString(){
        return super.toString()
                + "\nCodigo do Setor: " +codigoSetor
                + "\nSalario Base: " +salarioBase
                + "\nSalario: " + calcularSalario();
    
}
    
    
    
}
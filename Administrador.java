/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Saldo;

/**
 *
 * @author Gui
 */
public class Administrador extends Empregado {
    
  private double ajudaDeCusto;  
  
    
    public Administrador(String nome, String endereço, String telefone, int codigoSetor, double salarioBase,double ajudaDeCusto) {
        super(nome, endereço, telefone, codigoSetor, salarioBase);
        this.ajudaDeCusto = ajudaDeCusto;
        
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    
    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + ajudaDeCusto - super.getSalarioBase() * imposto;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + "\nAjuda de custo: " + ajudaDeCusto;
            
                
    }
    
    
    
    
    
    
    
    
}

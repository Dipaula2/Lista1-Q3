/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Saldo;

/**
 *
 * @author Gui
 */
public class Operario extends Empregado {
    
    private double valorProduçao;
    private double comissao;

    public Operario(String nome, String endereço, String telefone, int codigoSetor, double salarioBase,double valorProduçao,double comissao) {
        super(nome, endereço, telefone, codigoSetor, salarioBase);
        this.comissao = comissao;
        this.valorProduçao = valorProduçao;
    }

    public double getValorProduçao() {
        return valorProduçao;
    }

    public void setValorProduçao(double valorProduçao) {
        this.valorProduçao = valorProduçao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
   @Override
    public double calcularSalario() {
        double salarioBase = super.getSalarioBase();
        double salarioComComissao = salarioBase + (valorProduçao * comissao/100);
        return salarioComComissao;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nValor da Producao: " + valorProduçao +
                "\nComissso: " + comissao;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

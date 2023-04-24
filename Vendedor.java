/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Saldo;

/**
 *
 * @author Gui
 */
public class Vendedor extends Empregado{
    
    private double valorVendas;
    private double Comissao;

    public Vendedor(String nome, String endereço, String telefone, int codigoSetor, double salarioBase,double valorVendas,double Comissao) {
        super(nome, endereço, telefone, codigoSetor, salarioBase);
        this.Comissao = Comissao;
        this.valorVendas = valorVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return Comissao;
    }

    public void setComissao(double Comissao) {
        this.Comissao = Comissao;
    }
    
       @Override
    public double calcularSalario() {
        return super.getSalarioBase() + (valorVendas * (Comissao / 100));
        
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nValor de Vendas: " + valorVendas +
                "\nComissao: " + Comissao + "%";
                
                
    }
    
    
}

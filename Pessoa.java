/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Saldo;

/**
 *
 * @author Gui
 */
public class Pessoa {
    
    private String nome;
    private String endereço;
    private String telefone;

    public Pessoa(String nome,String endereço,String telefone){
        this.endereço = endereço;
        this.nome = nome;
        this.telefone = telefone;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
     @Override
    public String toString(){
        return "Nome: " +nome
                +"\nEndereço: "+endereço
                +"\nTelefone: " +telefone;
                
    }
    
}

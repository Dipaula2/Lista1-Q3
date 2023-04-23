/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Saldo;

/**
 *
 * @author Gui
 */
public class TesteSaldo {

    public static void main(String args[]) {
        
        
        Fornecedor fornecedor = new Fornecedor("Guilherme","Rua 21","81633008",4000,3000);
        Empregado empregado = new Empregado("Fernando","Rua 32","81632048",121,4000);
        Administrador adm = new Administrador("Alonso","Rua 33","81947068",11,1900,1500);
        Operario operario = new Operario("Augusto","Rua 42","21634048",21,2000,8000,6.0);
        Vendedor vendedor = new Vendedor("Davi","Rua 2","89702048",58,3000,500,5);
        
        
        
        System.out.println(fornecedor.toString());
        
        System.out.println("_____________________________");
        
        System.out.println(empregado.toString());
        
        System.out.println("_____________________________");
        
        System.out.println(adm.toString());
        
        System.out.println("_____________________________");
        
        System.out.println(operario.toString());
        
        System.out.println("_____________________________");
        
       System.out.println(vendedor.toString()); 
        
        
        
        
    }
}

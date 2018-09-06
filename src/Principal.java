/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Principal {
    
    
    public static void main(String[] args){
    
        System.out.println("Alicacion Mostrar Datos");
    
        
        System.out.println("Auto 1 tiene las Caracteristicas: ");
        Auto auto1 = new Auto();
        
        auto1.id = 101;
        auto1.matricula = "jkl265";
        auto1.marca = "BMW";
        auto1.año = 2010;
        auto1.vendido = true;
        
       auto1.mostrarAuto();
       
       Auto auto2 = new Auto();
       
        System.out.println("Auto 2 tiene las Caracteristicas: ");
       
        auto2.id = 102;
        auto2.matricula = "ryh265";
        auto2.marca = "Chevrolet";
        auto2.año = 2018;
        auto2.vendido = false;
        
        auto2.mostrarAuto();
        
        
        
    
    }
 
    
}

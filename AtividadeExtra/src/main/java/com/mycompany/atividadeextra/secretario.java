/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividadeextra;

/**
 *
 * @author italodell
 */
public class secretario extends funcionario{
    
    public secretario(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }

    public secretario(String nome, String cargo) {
        super(nome, cargo);
    }
    
    @Override
    public String Cargo(){
        return"Secretario";
    }

    @Override
    public double salario(double dinheiro) {
        salario = dinheiro + (dinheiro * 0.03);
        return salario;
    }
    
}

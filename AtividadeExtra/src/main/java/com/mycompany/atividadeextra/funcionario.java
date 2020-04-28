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
public abstract class funcionario {
    
    protected String nome;
    protected double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
    protected String cargo;
    
    public abstract String Cargo();
    
    public abstract double salario(double dinheiro);

    public funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    
    
    
}

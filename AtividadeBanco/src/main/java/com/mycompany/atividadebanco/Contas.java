/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividadebanco;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author italodell
 */
public abstract class Contas {
    
    protected int NumConta;
    protected String Nome;
    protected int Senha;
    protected double Saldo;
    protected int Tipoconta;

    public Contas(int NumConta, String Nome, int Senha, double Saldo, int Tipoconta) {
        this.NumConta = NumConta;
        this.Nome = Nome;
        this.Senha = Senha;
        this.Saldo = Saldo;
        this.Tipoconta = Tipoconta;
    }

    public Contas(int NumConta, String Nome, int Senha, int Tipoconta) {
        this.NumConta = NumConta;
        this.Nome = Nome;
        this.Senha = Senha;
        this.Tipoconta = Tipoconta;
    }
    
    public abstract void Sacar(double dinheiro);
    
    public void Depositar(double dinheiro){
        if(dinheiro <= 0){
            JOptionPane.showMessageDialog(null, "Operacao falhou!", "Falha!", INFORMATION_MESSAGE);
        
        }else{
            Saldo += dinheiro;
            JOptionPane.showMessageDialog(null, "Operação foi um sucesso!", "Concluido!", INFORMATION_MESSAGE);
        }

    }
    
    public abstract String TipoConta();

    public int getNumConta() {
        return NumConta;
    }

    public void setNumConta(int NumConta) {
        this.NumConta = NumConta;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int Senha) {
        this.Senha = Senha;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public int getTipoconta() {
        return Tipoconta;
    }

    public void setTipoconta(int Tipoconta) {
        this.Tipoconta = Tipoconta;
    }
    
    
    
    
    
    
}

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
public class Especial extends Contas{
    
    protected double especial;

    public double getEspecial() {
        return especial;
    }

    public void setEspecial(double especial) {
        this.especial = especial;
    }
    
    public Especial(int NumConta, String Nome, int Senha, double Saldo, int Tipoconta) {
        super(NumConta, Nome, Senha, Saldo, Tipoconta);
    }
    
    @Override
    public String TipoConta(){
        return "Conta Especial"; 
    }

    public Especial(int NumConta, String Nome, int Senha, int Tipoconta) {
        super(NumConta, Nome, Senha, Tipoconta);
    }
    
    public void sacar(double dinheiro, int i){
        if(dinheiro <= 0){
            JOptionPane.showMessageDialog(null, "Operacao falhou!", "Falha!", INFORMATION_MESSAGE);
        
        }else{
            especial = especial + dinheiro;
            JOptionPane.showMessageDialog(null, "Operação foi um sucesso!", "Concluido!", INFORMATION_MESSAGE);
        }
    }

    @Override
    public void Sacar(double dinheiro) {
        if(dinheiro > Saldo){
            JOptionPane.showMessageDialog(null, "Operacao falhou!", "Falha!", INFORMATION_MESSAGE);
        }
        
        else if(dinheiro <= 0){
            JOptionPane.showMessageDialog(null, "Operacao falhou!", "Falha!", INFORMATION_MESSAGE);
        
        }
        
        else{
            Saldo -= dinheiro;
            JOptionPane.showMessageDialog(null, "Operação foi um sucesso!", "Concluido!", INFORMATION_MESSAGE);
        }
    
    }
    
    
    
    
    
    
}

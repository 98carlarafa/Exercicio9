package Num1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ifnmg
 */
public class Animal {
    private String nome;
    
    public Animal(String n){    
        setNome(n);
    }
        
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void imprime(){
        System.out.println("Nome: " + getNome());
    }
    
    public void talk(){
    }
}

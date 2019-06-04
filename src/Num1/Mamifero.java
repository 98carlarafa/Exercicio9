/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Num1;

/**
 *
 * @author ifnmg
 */
public class Mamifero extends Animal{
    private int patas;
    
    public Mamifero(String n, int p){
        super(n);
        setPatas(p);
    }
    
    public int getPatas(){
        return patas;
    }
    
    public void setPatas(int p){
        this.patas = p;
    }
    
}

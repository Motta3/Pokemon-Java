/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;


/**
 *
 * @author motta
 */
class Poke { 
    private String nome;
    private int forca;
    private int ataque;
    private int defesa;
    private int agilidade;
        
    public void setNome(String a){
        this.nome = a;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setForca(int a){
        this.forca = a;
    }
    public int getForca(){
        return this.forca;
    }
    
    public void setAtaque(int a){
        this.ataque = a;
    }
    public int getAtaque(){
        return this.ataque;
    }
    
    public void setDefesa(int a){
        this.defesa = a;
    }
    public int getDefesa(){
        return this.defesa;
    }
    
    public void setAgilidade(int a){
        this.agilidade = a;
    }
    public int getAgilidade(){
        return this.agilidade;
    }
    
}

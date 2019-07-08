/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ramom Karllos
 */
public class Produto {
    
    private String codigo;
    private String nome;
    private double preco;
    private int quantidade;


    Produto(){

    }

    public Produto(String codigo, String nome, double preco, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DAO.interfaces.iProdutoDAO;
import Model.Produto;
import View.MenuPrincipalP;
import java.util.ArrayList;

/**
 *
 * @author Juan Nunes
 */
public class ProdutoDAO implements iProdutoDAO{
    
    MenuPrincipalP view = new MenuPrincipalP();
    
    /**
     * Insere um produto dentro do banco de dados
     * @param produto exige que seja passado um objeto do tipo produto
     */
    @Override
    public void insert(Produto produto){
        try{
            Banco.produto.add(produto);
            view.exibeMensagem("Produto Adicionado com Sucesso");
        }catch(NullPointerException e){
            view.exibeMensagem("Falha ao Inserir Produto");
        }
            
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param produto
     * @return 
     */
    @Override
    public boolean update(Produto produto){
        
        for (int i = 0; i < Banco.produto.size(); i++) {
            if(codigoSaoIguais(Banco.produto.get(i),produto)){
                Banco.produto.set(i, produto);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo codigo do produto passado
     * @param produto
     * @return 
     */
    @Override
    public boolean delete(Produto produto){
        for (Produto produtoLista : Banco.produto) {
            if(codigoSaoIguais(produtoLista,produto)){
                Banco.produto.remove(produtoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os produtos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    @Override
    public ArrayList<Produto> selectAll(){
        return Banco.produto;
    }
    
    @Override
    public Produto selectPorNome(Produto produto){
        try{
            for (Produto produtoLista : Banco.produto) {
                if(nomeSaoIguais(produtoLista,produto)){
                    return produtoLista;
                }
            }
        }catch(NullPointerException e){
            System.out.println("O Produto não existe!");
        }
        
        return null;
    }
    
    @Override
    public Produto selectPorNomeOuCodigo(String value){

       try{
           System.out.println("Meu Value "+value);
           for(Produto produtoValue : Banco.produto){
               if(produtoValue.getNome().contains(value) || produtoValue.getCodigo().contains(value)){
                   System.out.println("Pronto achei");
                   return produtoValue;
               }
               System.out.println("Estou tentando encontrar o Produto [Agurade...]");
               System.out.println("Acho que esse: "+produtoValue.getNome()+". Ainda não é o seu produto [Agurade...]");
           }
        }catch(NullPointerException e){
            System.out.println("O Produto não Foi Encontrado!");
        }
        System.out.println("Só Ignorei");
        return null;
    }
    
    
    /**
     * Compara se dois objetos tem a propriedade codigo igual
     * @param produto
     * @param produtoAComparar
     * @return verdadeiro caso os produtos forem iguais e falso se nao forem
     */
    @Override
    public boolean codigoSaoIguais(Produto produto, Produto produtoAComparar) {
        return produto.getCodigo().equals(produtoAComparar.getCodigo());
    }
    @Override
    public boolean nomeSaoIguais(Produto produto, Produto produtoAComparar) {
        return produto.getNome().equals(produtoAComparar.getNome());
    }
    @Override
    public int retorno(String value){
        for(Produto produtoValue : Banco.produto){
            if(produtoValue.getNome().contains(value) || produtoValue.getCodigo().contains(value)){
                return Banco.produto.indexOf(produtoValue);
            }
        }
        return -1;
    }

    
}

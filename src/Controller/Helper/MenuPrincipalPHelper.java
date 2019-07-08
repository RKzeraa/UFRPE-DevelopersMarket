/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Produto;
import View.MenuPrincipalP;

/**
 *
 * @author Ramom Karllos
 */
public class MenuPrincipalPHelper {
    
    private final MenuPrincipalP view;
    
    private String codigo;
    private String nome;
    private Double preco;
    private Integer quantidade;
    
    public MenuPrincipalPHelper(MenuPrincipalP view){
        this.view = view;
    }
    
    public Produto obterModelo(){
        try{
            this.codigo = view.getTextCodigo().getText();
            this.nome = view.getTextNome().getText();
            this.preco = Double.parseDouble(view.getTextPreco().getText());
            this.quantidade = Integer.parseInt(view.getTextQuantidade().getText());
        }catch(NullPointerException e){
            view.exibeMensagem("Não foi possivel obter dados do Modelo");
        }
        
       
        
        Produto modelo = new Produto(codigo, nome, preco, quantidade);
        
        return modelo;
    }
    
    public void setarModelo(Produto modelo){
        
        String codigo = modelo.getCodigo();
        String nome = modelo.getNome();
        Integer quantidade = modelo.getQuantidade();
        Double preco = modelo.getPreco();
        
        view.getTextCodigo().setText(codigo);
        view.getTextNome().setText(nome);
        view.getTextQuantidade().setText(quantidade.toString());
        view.getTextPreco().setText(preco.toString());
    }
    
    public void limparTela(){
        
        view.getTextCodigo().setText("");
        view.getTextNome().setText("");
        view.getTextQuantidade().setText("");;
        view.getTextPreco().setText("");
        
    }
}

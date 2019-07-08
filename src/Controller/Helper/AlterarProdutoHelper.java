/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Produto;
import View.AlterarProduto;

/**
 *
 * @author Ramom Karllos
 */
public class AlterarProdutoHelper {
    private final AlterarProduto view;
    
    private String value;

    
    public AlterarProdutoHelper(AlterarProduto view){
        this.view = view;
    }
    
    public String obterModelo(){
        String modelo = view.getTextNomeOuCodigo().getText();
        return modelo;
    }
    
    public void setarModelo(Produto modelo){
        
        if(modelo.getCodigo().matches("[0-9]+")){
            String value = modelo.getCodigo();
            view.getTextNomeOuCodigo().setText(value);
        }else{
            String value = modelo.getNome();
            view.getTextNomeOuCodigo().setText(value);
        }
        
    }
    
    public void limparTela(){
        
        view.getTextNomeOuCodigo().setText("");

        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AlterarProdutoHelper;
import Controller.Helper.ConsultarPrecoHelper;
import Controller.Helper.ExcluirProdutoHelper;
import Controller.Helper.MenuPrincipalCHelper;
import Controller.Helper.MenuPrincipalPHelper;
import Model.DAO.Banco;
import Model.DAO.ProdutoDAO;
import Model.DAO.UsuarioDAO;
import Model.Produto;
import Model.Usuario;
import View.AlterarProduto;
import View.ConsultarPreco;
import View.ExcluirProduto;
import View.MenuPrincipal;
import View.MenuPrincipalC;
import View.MenuPrincipalP;


/**
 *
 * @author Ramom Karllos
 */
public class MenuPrincipalController {
    
    private  MenuPrincipalC view;
    private  MenuPrincipalCHelper helper;
    
    private  MenuPrincipalP viewP;
    private  MenuPrincipalPHelper helperP;
    
    private  ConsultarPreco viewPreco;
    private  ConsultarPrecoHelper helperPreco;
    
    private AlterarProduto viewProduto;
    private AlterarProdutoHelper helperProduto;
    
    private ExcluirProduto viewProd;
    private ExcluirProdutoHelper helperProd;

    
    public MenuPrincipalController(MenuPrincipalC view) {
       
        this.view = view;
        this.helper = new MenuPrincipalCHelper(view);


    }
    
    public MenuPrincipalController(MenuPrincipalP view) {

        this.viewP = view;
        this.helperP = new MenuPrincipalPHelper(view); 


    }
    
    public MenuPrincipalController(ConsultarPreco view) {

        this.viewPreco = view;
        this.helperPreco = new ConsultarPrecoHelper(view);

    }
    
    public MenuPrincipalController(ExcluirProduto view) {
       
        this.viewProd = view;
        this.helperProd = new ExcluirProdutoHelper(view);        

    }
    
    public MenuPrincipalController(AlterarProduto view) {

        this.viewProduto = view;
        this.helperProduto = new AlterarProdutoHelper(view);

    }

    public void CadastrarFuncionario(){
        
        MenuPrincipal menu = new MenuPrincipal();
        MenuPrincipalC menuc = new MenuPrincipalC();
        
        menuc.setVisible(true);
        
        
        Usuario usuario = this.helper.obterModelo();
        //Pesquisar um Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        
        if(usuarioAutenticado != null){
            //Navegar para o menu principal
            this.view.exibeMensagem("Usuario Já está Cadastrado");
            this.helper.limparTela();
            
        }else{
            try{
                usuarioDAO.insert(usuario);
                menuc.dispose();
            }catch(UnsupportedOperationException e){
                this.view.exibeMensagem("Não Foi Possivel Cadastrar o Usuario");
            }
            
            this.helper.limparTela();
            menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }
    }
        
    public void CadastrarProduto(){
        
        MenuPrincipal menu = new MenuPrincipal();
        MenuPrincipalP menup = new MenuPrincipalP();
        
        menup.setVisible(true);
        
        
        Produto produto = this.helperP.obterModelo();
        //Pesquisar um Usuario no Banco
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produtoAutenticado = produtoDAO.selectPorNome(produto);
        
        
        if(produtoAutenticado != null){
            //Navegar para o menu principal
            this.viewP.exibeMensagem("Produto Já está Cadastrado");
            this.helperP.limparTela();
            
        }else{
            try{
                produtoDAO.insert(produto);
                menup.dispose();
            }catch(UnsupportedOperationException e){
                this.viewP.exibeMensagem("Não Foi Possivel Cadastrar o Produto");
            }
            
            this.helperP.limparTela();
            menu = new MenuPrincipal();
            menu.setVisible(true);
            this.viewP.dispose();
        }
    }
    
    public void BuscarProduto(){
        MenuPrincipal menu = new MenuPrincipal();
        
        
        //consultarp.setVisible(true);
        
        
        String consultarPreco = this.helperPreco.obterModelo();
        System.out.println("Este é meu modelo: "+consultarPreco);
        //Pesquisar um Usuario no Banco
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produtoAutenticado = produtoDAO.selectPorNomeOuCodigo(consultarPreco);
        
        
        if(produtoAutenticado != null){
            //Navegar para o menu principal]
            this.viewPreco.getjLabelNome().setText("Nome: "+produtoAutenticado.getNome());
            this.viewPreco.getjLabelPreco().setText("R$ "+Double.toString(produtoAutenticado.getPreco()));
            this.viewPreco.exibeMensagem("Já Achei o Produto");
            
        }else{
            this.viewPreco.exibeMensagem("Desculpa Não Achei o Produto");
            this.helperPreco.limparTela();
        }
        
    }
    
    public void ExcluirProduto(){

        MenuPrincipal menu = new MenuPrincipal();
        String consultarProd = this.helperProd.obterModelo();
        System.out.println("Este é meu modelo: "+consultarProd);
        //Pesquisar um Usuario no Banco
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produtoAutenticado = produtoDAO.selectPorNomeOuCodigo(consultarProd);
        if(produtoAutenticado != null){
            //Navegar para o menu principal]
            this.viewProd.getjLabelNome().setText("Nome: "+produtoAutenticado.getNome());
            this.viewProd.getjLabelPreco().setText("R$ "+Double.toString(produtoAutenticado.getPreco()));
            this.viewProd.exibeMensagem("Já Achei o Produto");
            if(produtoDAO.delete(produtoAutenticado)){
                this.viewProd.exibeMensagem("O Produto foi excluido!");
            }
            this.helperProd.limparTela();
            
        }else{
            this.viewProd.exibeMensagem("Desculpa Não Achei o Produto");
            this.helperProd.limparTela();
        }
    }
    
    public void AlterarProduto(){

        MenuPrincipal menu = new MenuPrincipal();
        String consultarProd = this.helperProduto.obterModelo();
        System.out.println("Este é meu modelo: "+consultarProd);
        //Pesquisar um Usuario no Banco
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produtoAutenticado = produtoDAO.selectPorNomeOuCodigo(consultarProd);
        if(produtoAutenticado != null){
            //Navegar para o menu principal]
            produtoAutenticado.setPreco(Double.parseDouble(this.viewProduto.getTextNovoValor().getText()));
            this.viewProduto.getjLabelNome().setText("Nome: "+produtoAutenticado.getNome());
            this.viewProduto.getjLabelPreco().setText("R$ "+Double.toString(produtoAutenticado.getPreco()));
            this.viewProduto.exibeMensagem("Já Achei o Produto");
            if(produtoDAO.update(produtoAutenticado)){
                this.viewProduto.exibeMensagem("O Produto foi Alterado!");
            }
            
        }else{
            this.viewProduto.exibeMensagem("Desculpa Não Achei o Produto");
            this.helperProduto.limparTela();
        }
    }
    
    
    
}

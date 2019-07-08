/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.AlterarProduto;
import View.ConsultarPreco;
import View.ExcluirProduto;
import View.Login;
import View.MenuPrincipal;
import View.MenuPrincipalC;
import View.MenuPrincipalP;

/**
 *
 * @author Ramom Karllos
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //Pegar um Usuario da View
        Usuario usuario = helper.obterModelo();
        //Pesquisar um Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se o Usuario e Senha da view for igual ao Usuario e Senha do Banco direcionar para o Menu Principal
        //Se não exibir mensagem de "Usuario ou Senha Invalidos"
        if(usuarioAutenticado != null){
            //Navegar para o menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuario ou Senha Invalidos");
            helper.limparTela();
        }
        
    }
    
    public boolean verificarIdentidade(int value){
        //Pegar um Usuario da View
        Usuario usuario = helper.obterModelo();
        //Pesquisar um Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se o Usuario e Senha da view for igual ao Usuario e Senha do Banco direcionar para o Menu Principal
        //Se não exibir mensagem de "Usuario ou Senha Invalidos"
        if(usuarioAutenticado != null){
            //Navegar para o menu principal
            switch(value){
                case 0:
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.setVisible(true);
                    this.view.dispose();
                    return true;
                    
                case 2:
                    MenuPrincipalC menuc = new MenuPrincipalC();
                    menuc.setVisible(true);
                    this.view.dispose();
                    return true;
                    
                case 3:
                    MenuPrincipalP menup = new MenuPrincipalP();
                    menup.setVisible(true);
                    this.view.dispose();
                    return true;
                case 4:
                    ExcluirProduto excluirProduto = new ExcluirProduto();
                    excluirProduto.setVisible(true);
                    this.view.dispose();
                    return true;
                case 5:
                    AlterarProduto alterarProduto = new AlterarProduto();
                    alterarProduto.setVisible(true);
                    this.view.dispose();
                    return true;
                default:
                    System.out.println("Value Not Is Valid");
            }
            
        }else{
            view.exibeMensagem("Usuario ou Senha Invalidos");
            helper.limparTela();
        }
        return false;
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do Banco de Dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
}

package Controller;

import Controller.Helper.MenuPrincipalCHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.MenuPrincipal;
import View.MenuPrincipalC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramom Karllos
 */
public class MenuPrincipalCController {
    
    private final MenuPrincipalC view;
    private MenuPrincipalCHelper helper;
    
    public MenuPrincipalCController(MenuPrincipalC view) {
        this.view = view;
        this.helper = new MenuPrincipalCHelper(view);
    }
    
    public void CadastrarFuncionario(){
        
        MenuPrincipal menu = new MenuPrincipal();
        MenuPrincipalC menuc = new MenuPrincipalC();
        
        menuc.setVisible(true);
        
        
        Usuario usuario = helper.obterModelo();
        //Pesquisar um Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        
        if(usuarioAutenticado != null){
            //Navegar para o menu principal
            view.exibeMensagem("Usuario Já está Cadastrado");
            helper.limparTela();
            
        }else{
            System.out.println("Entrei");
            try{
                usuarioDAO.insert(usuario);   
            }catch(UnsupportedOperationException e){
                view.exibeMensagem("Não Foi Possivel Cadastrar o Usuario");
            }
            
            helper.limparTela();
            menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }
    }
    
    
}

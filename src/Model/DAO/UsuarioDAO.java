/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DAO.interfaces.iUsuarioDAO;
import Model.Usuario;
import View.MenuPrincipalC;
import java.util.ArrayList;

/**
 *
 * @author Ramom Karllos
 */
public class UsuarioDAO implements iUsuarioDAO{
    
        MenuPrincipalC view = new MenuPrincipalC();
    
    /**
     * Insere um usuario dentro do banco de dados
     * @param usuario exige que seja passado um objeto do tipo usuario
     */
        @Override
    public void insert(Usuario usuario){
        try{
            Banco.usuario.add(usuario);
            view.exibeMensagem("Usuario Adicionado com Sucesso");
        }catch(NullPointerException e){
            view.exibeMensagem("Falha ao Inserir Usuario");
        }
            
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param usuario
     * @return 
     */
        @Override
    public boolean update(Usuario usuario){
        
        for (int i = 0; i < Banco.usuario.size(); i++) {
            if(cpfSaoIguais(Banco.usuario.get(i),usuario)){
                Banco.usuario.set(i, usuario);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo cpf do usuario passado
     * @param usuario
     * @return 
     */
        @Override
    public boolean delete(Usuario usuario){
        for (Usuario usuarioLista : Banco.usuario) {
            if(cpfSaoIguais(usuarioLista,usuario)){
                Banco.usuario.remove(usuarioLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
        @Override
    public ArrayList<Usuario> selectAll(){
        return Banco.usuario;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param usuario
     * @return Usuario encontrado no banco de dados
     */
        @Override
    public Usuario selectPorNomeESenha(Usuario usuario){
        try{
            for (Usuario usuarioLista : Banco.usuario) {
                if(nomeESenhaSaoIguais(usuarioLista,usuario)){
                    return usuarioLista;
                }
            }
        }catch(NullPointerException e){
            System.out.println("O Usuario não existe!");
        }
        
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param usuario
     * @param usuarioAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
        @Override
    public boolean nomeESenhaSaoIguais(Usuario usuario, Usuario usuarioAPesquisar) {
        return usuario.getNome().equals(usuarioAPesquisar.getNome()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade cpf igual
     * @param usuario
     * @param usuarioAComparar
     * @return verdadeiro caso os cpf forem iguais e falso se nao forem
     */
        @Override
    public boolean cpfSaoIguais(Usuario usuario, Usuario usuarioAComparar) {
        return usuario.getCpf().equals(usuarioAComparar.getCpf());
    }
    
    
    
}

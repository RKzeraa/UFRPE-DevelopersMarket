/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.interfaces;

import Model.Usuario;
import View.MenuPrincipalC;
import java.util.ArrayList;

/**
 *
 * @author Juan Nunes
 */
public interface iUsuarioDAO {
        MenuPrincipalC view = new MenuPrincipalC();
	    
	    /**
	     * Insere um usuario dentro do banco de dados
	     * @param usuario exige que seja passado um objeto do tipo usuario
	     */
	    public void insert(Usuario usuario);
	    
	    /**
	     * Atualiza um Objeto no banco de dados
	     * @param usuario
	     * @return 
	     */
	    public boolean update(Usuario usuario);
	    
	    /**
	     * Deleta um objeto do banco de dados pelo cpf do usuario passado
	     * @param usuario
	     * @return 
	     */
	    public boolean delete(Usuario usuario);
	    
	    /**
	     * Retorna um arraylist com todos os usuarios do banco de dados
	     * @return uma lista com todos os registros do banco
	     */
	    public ArrayList<Usuario> selectAll();
	    
	    /**
	     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
	     * @param usuario
	     * @return Usuario encontrado no banco de dados
	     */
	    public Usuario selectPorNomeESenha(Usuario usuario);

	    /**
	     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
	     * @param usuario
	     * @param usuarioAPesquisar
	     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
	     */
	    public boolean nomeESenhaSaoIguais(Usuario usuario, Usuario usuarioAPesquisar);

	    /**
	     * Compara se dois objetos tem a propriedade cpf igual
	     * @param usuario
	     * @param usuarioAComparar
	     * @return verdadeiro caso os cpf forem iguais e falso se nao forem
	     */
	    public boolean cpfSaoIguais(Usuario usuario, Usuario usuarioAComparar);
	    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.interfaces;

import Model.Produto;
import View.MenuPrincipalP;
import java.util.ArrayList;

/**
 *
 * @author Juan Nunes
 */
public interface iProdutoDAO {
    
    MenuPrincipalP view = new MenuPrincipalP();
	    
	    /**
	     * Insere um produto dentro do banco de dados
	     * @param produto exige que seja passado um objeto do tipo produto
	     */
	    public void insert(Produto produto);
	    
	    /**
	     * Atualiza um Objeto no banco de dados
	     * @param produto
	     * @return 
	     */
	    public boolean update(Produto produto);
	    
	    /**
	     * Deleta um objeto do banco de dados pelo codigo do produto passado
	     * @param produto
	     * @return 
	     */
	    public boolean delete(Produto produto);
	    
	    /**
	     * Retorna um arraylist com todos os produtos do banco de dados
	     * @return uma lista com todos os registros do banco
	     */
	    public ArrayList<Produto> selectAll();
	    
	    public Produto selectPorNome(Produto produto);
	    
	    public Produto selectPorNomeOuCodigo(String value);
	    
	    
	    /**
	     * Compara se dois objetos tem a propriedade codigo igual
	     * @param produto
	     * @param produtoAComparar
	     * @return verdadeiro caso os produtos forem iguais e falso se nao forem
	     */
	    public boolean codigoSaoIguais(Produto produto, Produto produtoAComparar);
	    
	    public boolean nomeSaoIguais(Produto produto, Produto produtoAComparar);
	    
	    public int retorno(String value);
	    
    
}

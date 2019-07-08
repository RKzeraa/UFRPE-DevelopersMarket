/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.interfaces;

import Model.Venda;
import java.util.ArrayList;

/**
 *
 * @author Juan Nunes
 */
public interface iVendaDAO {
    /**
     * Insere um venda dentro do banco de dados
     * @param venda exige que seja passado um objeto do tipo venda
     */
    public void insert(Venda venda);
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param venda
     * @return 
     */
    public boolean update(Venda venda);
    
    /**
     * Deleta um objeto do banco de dados pelo id do venda passado
     * @param venda
     * @return 
     */
    public boolean delete(Venda venda);
    
    /**
     * Retorna um arraylist com todos os vendas do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Venda> selectAll();
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param venda
     * @param vendaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    public boolean idSaoIguais(Venda venda, Venda vendaAComparar);
    
    public int proximoId();
    
}

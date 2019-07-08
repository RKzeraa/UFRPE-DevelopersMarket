/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DAO.interfaces.iVendaDAO;
import Model.Venda;
import java.util.ArrayList;

/**
 *
 * @author Juan Nunes
 */
public class VendaDAO implements iVendaDAO{
    
    /**
     * Insere um venda dentro do banco de dados
     * @param venda exige que seja passado um objeto do tipo venda
     */
    @Override
    public void insert(Venda venda){
          
        if(venda.getId() == 0){
            venda.setId(proximoId());
            Banco.venda.add(venda);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param venda
     * @return 
     */
    @Override
    public boolean update(Venda venda){
        
        for (int i = 0; i < Banco.venda.size(); i++) {
            if(idSaoIguais(Banco.venda.get(i),venda)){
                Banco.venda.set(i, venda);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do venda passado
     * @param venda
     * @return 
     */
    @Override
    public boolean delete(Venda venda){
        for (Venda vendaLista : Banco.venda) {
            if(idSaoIguais(vendaLista,venda)){
                Banco.venda.remove(vendaLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os vendas do banco de dados
     * @return uma lista com todos os registros do banco
     */
    @Override
    public ArrayList<Venda> selectAll(){
        return Banco.venda;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param venda
     * @param vendaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    @Override
    public boolean idSaoIguais(Venda venda, Venda vendaAComparar) {
        return venda.getId() ==  vendaAComparar.getId();
    }
    
    @Override
    public int proximoId(){
        
        int maiorId = 0;
        
        for (Venda venda : Banco.venda) {           
           int id = venda.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }

}

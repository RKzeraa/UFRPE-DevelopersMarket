/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Venda;
import Model.Produto;
import Model.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ramom Karllos
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Produto> produto;
    public static ArrayList<Venda> venda;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        produto = new ArrayList<Produto>();
        venda = new ArrayList<Venda>();
        
        //criando elementos
        
        //Abrir arquivo para leitura Usuario.txt tudo que estiver entre "+cpf<113.716.154-03>" é um usuario
        
        Usuario usuario1 = new Usuario("1", "Adm", "Masculino", "09/05/1996", "30212121", "administrador@developersmarket.com", "521454123", "adm", "administrador");
        Usuario usuario2 = new Usuario("2", "Func", "Masculino", "09/05/1996", "30212122", "funcionario@developersmarket.com", "451244123", "func", "funcionario");
        
        Produto produto1 = new Produto("1", "Arroz", 1.30, 10);
        Produto produto2 = new Produto("2", "Feijão", 3.0, 10);
        Produto produto3 = new Produto("3", "Açucar", 1.5, 10);
        Produto produto4 = new Produto("4", "Sal", 1.0, 10);
        Produto produto5 = new Produto("5", "Água", 1.0, 10);
        Produto produto6 = new Produto("6", "Macarrão", 2.5, 10);
        
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
  
        
        produto.add(produto1);
        produto.add(produto2);
        produto.add(produto3);
        produto.add(produto4);
        produto.add(produto5);
        produto.add(produto6);
        
    }
    
    
}

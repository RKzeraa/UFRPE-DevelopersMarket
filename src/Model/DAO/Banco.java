package Model.DAO;

import Model.Venda;
import Model.Produto;
import Model.Usuario;
import java.util.ArrayList;

public class Banco {

	public static ArrayList<Usuario> usuario;
    public static ArrayList<Produto> produto;
    public static ArrayList<Venda> venda;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        produto = new ArrayList<Produto>();
        venda = new ArrayList<Venda>();
        
        //Criando elementos
        
        Usuario usuario1 = new Usuario("1", "Adm", 'M', "09/05/1996", "30212121", "administrador@developersmarket.com", "521454123", "adm", "administrador");
        Usuario usuario2 = new Usuario("2", "Func", 'M', "09/05/1996", "30212122", "funcionario@developersmarket.com", "451244123", "func", "funcionario");
        
        Produto produto1 = new Produto("1", "Arroz", 18);
        Produto produto2 = new Produto("2", "Feijão", 30);
        Produto produto3 = new Produto("3", "Açucar", 15);
        Produto produto4 = new Produto("4", "Sal", 25);
        Produto produto5 = new Produto("5", "Água", 10);
        Produto produto6 = new Produto("6", "Macarrão", 3);
        
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

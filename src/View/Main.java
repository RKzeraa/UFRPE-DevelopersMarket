/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Model.Produto;
import Model.Usuario;
import Model.Venda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import View.MenuPrincipalC;



/**
 *
 * @author Ramom Karllos
 */
public class Main {
    
    private final MenuPrincipalC view;

    public Main(MenuPrincipalC view){
        this.view = view;
    }
    
    public static void main(String[] args){
        
        Date date = new Date();
        
        
        ArrayList<Produto> produto = new ArrayList();
        Produto Arroz = new Produto("123", "Arroz", 3.0, 10);
        
        produto.add(Arroz);
        
        Usuario usuario = new Usuario("Funcionario-n1", "n1");
        System.out.println(usuario.getNome());
        
        Venda venda = new Venda(1, produto, 3, 30, date);
        System.out.println(venda.toString());
        System.out.println();
        
    }
}

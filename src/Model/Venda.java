package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Venda {

	private int id;
    private ArrayList<Produto> produto = new ArrayList<Produto>();
    private float valor;
    private int quantidade;
    private Date data;
    
    public Venda(){
    }

    public Venda(int id, ArrayList<Produto> produto, float valor, int quantidade, Date data) {
        this.id = id;
        this.produto = produto;
        this.valor = valor;
        this.quantidade = quantidade;
        this.data = data;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String getData() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formato.format(this.data);
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
   @Override
   public String toString(){
       return ""+produto.toString()+" Valor:"+getValor()+" Quantidade:"+getQuantidade()+" ";
   }
	
}

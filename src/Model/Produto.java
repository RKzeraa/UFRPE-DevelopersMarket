package Model;

public class Produto {

	private String codigo;
    private String nome;
    private float preco;


    Produto(){

    }

    public Produto(String codigo, String nome, float preco){
            this.codigo = codigo;
            this.nome = nome;
            this.preco = preco;
    }

    public void setCodigo(String codigo){
            this.codigo = codigo;
    }

    public String getCodigo(){
            return this.codigo;
    }

    public void setNome(String nome){
            this.nome = nome;
    }

    public String getNome(){
            return this.nome;
    }

    public void setPreco(float preco){
            this.preco = preco;
    }

    public float getPreco(){
            return this.preco;
    }
	
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



/**
 *
 * @author Ramom Karllos
 */
public class Usuario extends Pessoa {
    
    private String senha;
    private String nivelAcesso;

    
    
    public Usuario(String nome, String senha) {
        super(nome);
        this.senha = senha;
    }
    
    public Usuario(String cpf, String nome, String telefone, String email, String rg, String senha) {
        super(cpf, nome, telefone, email, rg);
        this.senha = senha;
    }

    public Usuario(String cpf, String nome, String sexo, String dataNascimento, String telefone, String email, String rg, String senha, String nivelAcesso) {
        super(cpf, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
    
}

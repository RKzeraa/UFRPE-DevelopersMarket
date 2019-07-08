/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramom Karllos
 */
abstract public class Pessoa {
    
    protected String cpf;
    protected String nome;
    protected String sexo;
    protected Date dataNascimento;
    protected String telefone;
    protected String email;
    protected String rg;
    
    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public Pessoa(String cpf, String nome, String telefone, String email, String rg) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

    public Pessoa(String cpf, String nome, String sexo, String dataNascimento, String telefone, String email, String rg) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        SimpleDateFormat formato = new SimpleDateFormat();
        return formato.format(dataNascimento);
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}

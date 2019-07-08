/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Usuario;
import View.MenuPrincipalC;

/**
 *
 * @author Ramom Karllos
 */
public class MenuPrincipalCHelper {
    
    private final MenuPrincipalC view;
    
    private String cpf;
    private String nome;
    private String sexo;
    private String dataNascimento;
    private String telefone;
    private String email;
    private String rg;
    private String senha;
    private String nivelAcesso;
    
    public MenuPrincipalCHelper(MenuPrincipalC view){
        this.view = view;
    }
    
    public Usuario obterModelo(){
        try{
            this.cpf = view.getjFormattedTextFieldCpf().getText();
            this.nome = view.getTextNome().getText();
            this.sexo = view.getComboBoxSexo().getSelectedItem().toString();
            this.dataNascimento = view.getjFormattedTextFieldData().getText();
            this.telefone = view.getjFormattedTextFieldTel().getText();
            this.email = view.getTextEmail().getText();
            this.rg = view.getjFormattedTextFieldRg().getText();
            this.senha = view.getTextSenha().getText();
            this.nivelAcesso = "adm"; //view.getComboBoxSexo().getToolTipText();
        }catch(NullPointerException e){
            view.exibeMensagem("Não foi possivel obter dados do Modelo");
        }
        
        Usuario modelo = new Usuario(cpf, nome, sexo, dataNascimento, telefone, email, rg, senha, nivelAcesso);
        
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String cpf = modelo.getCpf();
        String nome = modelo.getNome();
        String sexo = modelo.getSexo();
        String data = modelo.getDataNascimento();
        String telefone = modelo.getTelefone();
        String email = modelo.getEmail();
        String rg = modelo.getRg();
        String senha = modelo.getSenha();
        
        view.getjFormattedTextFieldCpf().setText(cpf);
        view.getTextNome().setText(nome);
        view.getComboBoxSexo().setSelectedItem(sexo);
        view.getjFormattedTextFieldData().setText(data);
        view.getjFormattedTextFieldTel().setText(telefone);
        view.getTextEmail().setText(email);
        view.getjFormattedTextFieldRg().setText(rg);
        view.getTextSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getjFormattedTextFieldCpf().setText("");
        view.getTextNome().setText("");
        view.getComboBoxSexo().setSelectedIndex(0);
        view.getjFormattedTextFieldData().setText("");
        view.getjFormattedTextFieldTel().setText("");
        view.getTextEmail().setText("");
        view.getjFormattedTextFieldRg().setText("");
        view.getTextSenha().setText("");
    }
}

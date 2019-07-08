/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MenuPrincipalController;
import Model.DAO.Banco;
import com.sun.glass.events.KeyEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ramom Karllos
 */
public class MenuPrincipalP extends javax.swing.JFrame {
    
    private final MenuPrincipalController controller;

    /**
     * Creates new form MenuPrincipalP
     */
    public MenuPrincipalP() {
        initComponents();
        controller = new MenuPrincipalController(this);
        Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodigo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        TextNome = new javax.swing.JTextField();
        TextPreco = new javax.swing.JTextField();
        TextQuantidade = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelCdPessoa = new javax.swing.JLabel();
        jLabelFundoCadastro = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jMenuOperacao = new javax.swing.JMenu();
        jMenuItemConsultarPreco = new javax.swing.JMenuItem();
        jMenuItemRealizarVenda = new javax.swing.JMenuItem();
        jMenuItemExcluirProduto = new javax.swing.JMenuItem();
        jMenuItemAlterarPreco = new javax.swing.JMenuItem();
        jMenuItemRelatorioDeEstoque = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCodigo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setText("CODIGO");
        getContentPane().add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 60, -1));

        jLabelNome.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("NOME");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 60, -1));

        jLabelPreco.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreco.setText("PREÇO");
        getContentPane().add(jLabelPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 60, -1));

        jLabelQuantidade.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuantidade.setText("QUANTIDADE");
        getContentPane().add(jLabelQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 110, -1));

        TextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCodigoActionPerformed(evt);
            }
        });
        TextCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(TextCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 170, -1));

        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });
        TextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextNomeKeyPressed(evt);
            }
        });
        getContentPane().add(TextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 470, 170, -1));

        TextPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPrecoActionPerformed(evt);
            }
        });
        TextPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextPrecoKeyPressed(evt);
            }
        });
        getContentPane().add(TextPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, 170, -1));

        TextQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextQuantidadeActionPerformed(evt);
            }
        });
        TextQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextQuantidadeKeyPressed(evt);
            }
        });
        getContentPane().add(TextQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, 170, -1));

        jButtonCancelar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jButtonCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCancelarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, 110, -1));

        jButtonCadastrar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jButtonCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCadastrarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 630, 110, -1));

        jLabelCdPessoa.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabelCdPessoa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCdPessoa.setText("CADASTRO DE PRODUTOS");
        getContentPane().add(jLabelCdPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 210, -1));

        jLabelFundoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/background.jpg"))); // NOI18N
        jLabelFundoCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelFundoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 710, 480));

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/naom_5982f96d4ab62.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/cliente-icon.png"))); // NOI18N
        jMenuItemFuncionario.setText("Funcionario");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemFuncionario);

        jMenuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItemProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/shopping-bag_1.png"))); // NOI18N
        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemProduto);

        jMenuBar1.add(jMenuCadastrar);

        jMenuOperacao.setText("Operação");

        jMenuItemConsultarPreco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItemConsultarPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/Consultar Preço.png"))); // NOI18N
        jMenuItemConsultarPreco.setText("Consultar Preço");
        jMenuItemConsultarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarPrecoActionPerformed(evt);
            }
        });
        jMenuOperacao.add(jMenuItemConsultarPreco);

        jMenuItemRealizarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemRealizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/Realizar Venda.png"))); // NOI18N
        jMenuItemRealizarVenda.setText("Realizar Venda");
        jMenuItemRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRealizarVendaActionPerformed(evt);
            }
        });
        jMenuOperacao.add(jMenuItemRealizarVenda);

        jMenuItemExcluirProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItemExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/Excluir Produto.png"))); // NOI18N
        jMenuItemExcluirProduto.setText("Excluir Produto");
        jMenuItemExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirProdutoActionPerformed(evt);
            }
        });
        jMenuOperacao.add(jMenuItemExcluirProduto);

        jMenuItemAlterarPreco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItemAlterarPreco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/Alterar Preço.png"))); // NOI18N
        jMenuItemAlterarPreco.setText("Alterar Preço");
        jMenuItemAlterarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlterarPrecoActionPerformed(evt);
            }
        });
        jMenuOperacao.add(jMenuItemAlterarPreco);

        jMenuItemRelatorioDeEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItemRelatorioDeEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Icons/Relatorio de Estoque.png"))); // NOI18N
        jMenuItemRelatorioDeEstoque.setText("Relatorio de Estoque");
        jMenuItemRelatorioDeEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioDeEstoqueActionPerformed(evt);
            }
        });
        jMenuOperacao.add(jMenuItemRelatorioDeEstoque);

        jMenuBar1.add(jMenuOperacao);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        MenuPrincipalC menuc = new MenuPrincipalC();
        menuc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRealizarVendaActionPerformed

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeActionPerformed

    private void TextQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextQuantidadeActionPerformed

    private void TextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCodigoActionPerformed

    private void TextPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPrecoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE || evt.getKeyCode() == KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_ENTER){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        this.controller.CadastrarProduto();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCadastrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){   
            this.controller.CadastrarProduto();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCadastrarKeyPressed

    private void TextCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_TextCodigoKeyPressed

    private void TextNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_TextNomeKeyPressed

    private void TextPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextPrecoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_TextPrecoKeyPressed

    private void TextQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.dispose();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){   
            this.controller.CadastrarProduto();
        }
    }//GEN-LAST:event_TextQuantidadeKeyPressed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        Login login = new Login(3);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

    private void jMenuItemConsultarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarPrecoActionPerformed
        ConsultarPreco consultarPreco = new ConsultarPreco();
        consultarPreco.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultarPrecoActionPerformed

    private void jMenuItemExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirProdutoActionPerformed
        Login login = new Login(4);
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItemExcluirProdutoActionPerformed

    private void jMenuItemAlterarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlterarPrecoActionPerformed
        Login login = new Login(5);
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItemAlterarPrecoActionPerformed

    private void jMenuItemRelatorioDeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioDeEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRelatorioDeEstoqueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextCodigo;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextPreco;
    private javax.swing.JTextField TextQuantidade;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelCdPessoa;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelFundoCadastro;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuItemAlterarPreco;
    private javax.swing.JMenuItem jMenuItemConsultarPreco;
    private javax.swing.JMenuItem jMenuItemExcluirProduto;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemRealizarVenda;
    private javax.swing.JMenuItem jMenuItemRelatorioDeEstoque;
    private javax.swing.JMenu jMenuOperacao;
    // End of variables declaration//GEN-END:variables

    public JTextField getTextCodigo() {
        return TextCodigo;
    }

    public void setTextCodigo(JTextField TextCodigo) {
        this.TextCodigo = TextCodigo;
    }

    public JTextField getTextNome() {
        return TextNome;
    }

    public void setTextNome(JTextField TextNome) {
        this.TextNome = TextNome;
    }

    public JTextField getTextQuantidade() {
        return TextQuantidade;
    }

    public void setTextQuantidade(JTextField TextQuantidade) {
        this.TextQuantidade = TextQuantidade;
    }

    public JTextField getTextPreco() {
        return TextPreco;
    }

    public void setTextPreco(JTextField TextPreco) {
        this.TextPreco = TextPreco;
    }

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    
    
}

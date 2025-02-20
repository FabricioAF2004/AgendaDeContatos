/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.listecontado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tela extends javax.swing.JFrame {
    
    private JTextField nomeField, telefoneField, emailField;
    private DefaultListModel<String> listaContatos;
    private JList<String> listaExibida;

    /**
     * Creates new form Tela
     */
    public Tela() {
        
       // Configurações da janela
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Inicialização dos campos de entrada
        nomeField = new JTextField(15);
        telefoneField = new JTextField(15);
        emailField = new JTextField(15);
        
        // Painel para os campos
        JPanel painelCampos = new JPanel();
        painelCampos.setLayout(new GridLayout(3, 2));
        painelCampos.add(new JLabel("Nome:"));
        painelCampos.add(nomeField);
        painelCampos.add(new JLabel("Telefone:"));
        painelCampos.add(telefoneField);
        painelCampos.add(new JLabel("E-mail:"));
        painelCampos.add(emailField);
        add(painelCampos, BorderLayout.NORTH);
        
        // Lista de contatos
        listaContatos = new DefaultListModel<>();
        listaExibida = new JList<>(listaContatos);
        add(new JScrollPane(listaExibida), BorderLayout.CENTER);
        
        // Painel de botões
        JPanel painelBotoes = new JPanel();
        AdicionarBtn = new JButton("Adicionar");
        EditarBtn = new JButton("Editar");
        RemoverBtn = new JButton("Remover");
        VisualizarBtn = new JButton("Visualizar");
        LimparBtn = new JButton("Limpar");
        
        AdicionarBtn.addActionListener(this::AdicionarBtnActionPerformed);
        EditarBtn.addActionListener(this::EditarBtnActionPerformed);
        RemoverBtn.addActionListener(this::RemoverBtnActionPerformed);
        VisualizarBtn.addActionListener(this::VisualizarBtnActionPerformed);
        LimparBtn.addActionListener(this::LimparBtnActionPerformed);
        
        painelBotoes.add(AdicionarBtn);
        painelBotoes.add(EditarBtn);
        painelBotoes.add(RemoverBtn);
        painelBotoes.add(VisualizarBtn);
        painelBotoes.add(LimparBtn);
        add(painelBotoes, BorderLayout.SOUTH);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        AdicionarBtn = new javax.swing.JButton();
        EditarBtn = new javax.swing.JButton();
        RemoverBtn = new javax.swing.JButton();
        VisualizarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        LimparBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdicionarBtn.setText("Adicionar");
        AdicionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarBtnActionPerformed(evt);
            }
        });

        EditarBtn.setText("Editar");
        EditarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBtnActionPerformed(evt);
            }
        });

        RemoverBtn.setText("Remover");
        RemoverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverBtnActionPerformed(evt);
            }
        });

        VisualizarBtn.setText("Visualizar");
        VisualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        LimparBtn.setText("Limpar");
        LimparBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VisualizarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoverBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdicionarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(LimparBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdicionarBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(EditarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(RemoverBtn)
                        .addGap(18, 18, 18)
                        .addComponent(VisualizarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(LimparBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarBtnActionPerformed
         String nome = nomeField.getText();
        String telefone = telefoneField.getText();
        String email = emailField.getText();
        if (!nome.isEmpty() && !telefone.isEmpty() && !email.isEmpty()) {
            listaContatos.addElement(nome + " - " + telefone + " - " + email);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
        }
    }//GEN-LAST:event_AdicionarBtnActionPerformed

    private void EditarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBtnActionPerformed
           int index = listaExibida.getSelectedIndex();
        if (index != -1) {
            String novoNome = JOptionPane.showInputDialog("Editar nome:", nomeField.getText());
            String novoTelefone = JOptionPane.showInputDialog("Editar telefone:", telefoneField.getText());
            String novoEmail = JOptionPane.showInputDialog("Editar e-mail:", emailField.getText());
            if (novoNome != null && novoTelefone != null && novoEmail != null) {
                listaContatos.set(index, novoNome + " - " + novoTelefone + " - " + novoEmail);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um contato para editar.");
        }
    }//GEN-LAST:event_EditarBtnActionPerformed

    private void RemoverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverBtnActionPerformed
         int index = listaExibida.getSelectedIndex();
        if (index != -1) {
            listaContatos.remove(index);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um contato para remover.");
        }
    }//GEN-LAST:event_RemoverBtnActionPerformed

    private void VisualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarBtnActionPerformed
             int index = listaExibida.getSelectedIndex();
        if (index != -1) {
            String contato = listaContatos.getElementAt(index);
            JOptionPane.showMessageDialog(null, "Contato: " + contato);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um contato para visualizar.");
        }     
    }//GEN-LAST:event_VisualizarBtnActionPerformed

    private void LimparBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparBtnActionPerformed
        limparCampos();
    }//GEN-LAST:event_LimparBtnActionPerformed

     private void limparCampos() {
        nomeField.setText("");
        telefoneField.setText("");
        emailField.setText("");
    }
     
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarBtn;
    private javax.swing.JButton EditarBtn;
    private javax.swing.JButton LimparBtn;
    private javax.swing.JButton RemoverBtn;
    private javax.swing.JButton VisualizarBtn;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}

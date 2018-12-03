/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frotaveiculos.telas;

/**
 *
 * @author Adilson
 */
import java.sql.*;
import com.frotaveiculos.dal.ModuloConexao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GTelaCadastroVeiculo extends javax.swing.JFrame {

    int idVeiculo;
    String modelo_veiculo;
    String placa_veiculo;
    float km_atual;
    String marca_veiculo;
    float capacidade_tanque;
    String situacao_veiculo;
    String data_hora_registro_veiculo;
    
    //atributos
    Connection conexao = null;
    PreparedStatement pst = null;//PreparedStatement: conjunto de bibliotecas - Variavel pst
    ResultSet rs = null; //exibir o resultado das instruções slq

    /**
     * Creates new form GTelaCadastroVeiculo
     */
    public GTelaCadastroVeiculo() { //Trecho de código construtor
	initComponents();
	setBounds(300, 50, 700, 650);
	try {
	    conexao = ModuloConexao.conector();
	} catch (ClassNotFoundException ex) {
	    Logger.getLogger(GTelaCadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
	}
    }

    private void consultar() {//método para pesquisar
	String sql = "select * from tb_cadastro_veiculo where idveiculo=? ";
	try {
	    pst = conexao.prepareStatement(sql);
	    pst.setInt(1, jTextFieldCadastroVeiculoPesquisarID.getColumns());//obter o valor digitado no campo
	    //pst.setString(1, jTextFieldCadastroVeiculoPesquisarID.getText());//obter o valor digitado no campo
	    
	    rs = pst.executeQuery();
	    //Linha abaixo caso tenha placa correspondente preencher os campos
	    if (rs.next()) {
		jTextFieldCadastroVeiculoModeloVeiculo.setActionCommand(rs.getString(2));// O Número 2 significa que vai pegar o segundo campo da tabela no banco de dados que corresponde ao Modelo do Veiculo.
		jTextFieldCadastroVeiculoPlacaVeiculo.setText(rs.getString(3));//Placa veiculo
		jTextFieldCadastroVeiculoMarcaVeiculo.setText(rs.getString(4));//MarcaVeiculo
		jTextFieldCadastroVeiculoKmAtual.setText(rs.getString(5));//KmAtual
		jTextFieldCadastroVeiculoCapacidadeTanque.setText(rs.getString(6));//CapacidadeTanque
		jComboBoxCadastroVeiculoSituacaoVeiculo.setSelectedItem(rs.getString(7));//SituacaoVeiculo
	    } else {
		JOptionPane.showMessageDialog(null, "Veículo não Cadastrado.");//caso não encontre nenhum veiculo cadastrado exibe a mensagem.
		//As linhas abaixo iram apagar os campos após msg "Veículo não Cadastrado.".
		jTextFieldCadastroVeiculoModeloVeiculo.setText(null);
		jTextFieldCadastroVeiculoPlacaVeiculo.setText(null);
		jTextFieldCadastroVeiculoMarcaVeiculo.setText(null);
		jTextFieldCadastroVeiculoKmAtual.setText(null);
		jTextFieldCadastroVeiculoCapacidadeTanque.setText(null);
		jComboBoxCadastroVeiculoSituacaoVeiculo.setSelectedItem(null);
	    }
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, e);//Caso ocorra alguma excessão será exibido na tela.
	}
    }

    private void limpar() {// método para limpar campos e entrar com novos dados
	JOptionPane.showMessageDialog(null, "Tem certeza que deseja limpar os campos?");
	//As linhas abaixo iram apagar os campos após msg "Veículo não Cadastrado.".
	jTextFieldCadastroVeiculoPesquisarID.setText(null);
	jTextFieldCadastroVeiculoModeloVeiculo.setText(null);
	jTextFieldCadastroVeiculoPlacaVeiculo.setText(null);
	jTextFieldCadastroVeiculoMarcaVeiculo.setText(null);
	jTextFieldCadastroVeiculoKmAtual.setText(null);
	jTextFieldCadastroVeiculoCapacidadeTanque.setText(null);
	jComboBoxCadastroVeiculoSituacaoVeiculo.setSelectedItem(null);
    }

    private void salvar() {//adicionando veiculo no banco de dados.
	String sql = "INSERT INTO TB_cadastro_veiculo VALUES(modelo_veiculo, placa_veiculo, km_atual, marca_veiculo, capacidade_tanque, situacao_veiculo) VALUES (?,?,?,?,?,?)";
	try {
	    pst = conexao.prepareStatement(sql);
	    pst.setString(2, jTextFieldCadastroVeiculoModeloVeiculo.getText());
	    pst.setString(3, jTextFieldCadastroVeiculoPlacaVeiculo.getText());
	    pst.setString(4, jTextFieldCadastroVeiculoKmAtual.getText());
	    pst.setString(5, jTextFieldCadastroVeiculoMarcaVeiculo.getText());
	    pst.setString(6, jTextFieldCadastroVeiculoCapacidadeTanque.getText());
	    pst.setString(7, jComboBoxCadastroVeiculoSituacaoVeiculo.getSelectedItem().toString());
	    
	    //A linha abaixo atualiza a tabela de Veiculo com os dados do formulario - digitado.
	    int adicionado = pst.executeUpdate();
	    System.out.println(adicionado);//apenas para apoio ao entendimento da lógica
	    if (adicionado > 0) {
		JOptionPane.showMessageDialog(null, "Veículo adicionado com sucesso! ");
		//As linhas abaixo iram apagar os campos após msg "Veículo adicionado com sucesso! ".
		jTextFieldCadastroVeiculoModeloVeiculo.setText(null);
		jTextFieldCadastroVeiculoPlacaVeiculo.setText(null);
		jTextFieldCadastroVeiculoMarcaVeiculo.setText(null);
		jTextFieldCadastroVeiculoKmAtual.setText(null);
		jTextFieldCadastroVeiculoCapacidadeTanque.setText(null);
		jComboBoxCadastroVeiculoSituacaoVeiculo.setSelectedItem(null);
	    }

	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, e);//Caso ocorra alguma excessão será exibido na tela.
	}

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastroVeiculoModeloVeiculo = new javax.swing.JLabel();
        jLabelCadastroVeiculoPlacaVeiculo = new javax.swing.JLabel();
        jLabelCadastroVeiculoMarcaVeiculo = new javax.swing.JLabel();
        jLabelCadastroVeiculoKmAtual = new javax.swing.JLabel();
        jLabelCadastroVeiculoCapacidadeTanque = new javax.swing.JLabel();
        jLabelCadastroVeiculoSituacaoVeiculo = new javax.swing.JLabel();
        jTextFieldCadastroVeiculoCapacidadeTanque = new javax.swing.JTextField();
        jTextFieldCadastroVeiculoKmAtual = new javax.swing.JTextField();
        jTextFieldCadastroVeiculoMarcaVeiculo = new javax.swing.JTextField();
        jTextFieldCadastroVeiculoPlacaVeiculo = new javax.swing.JTextField();
        jTextFieldCadastroVeiculoModeloVeiculo = new javax.swing.JTextField();
        jButtonCadastroVeiculoSalvar = new javax.swing.JButton();
        jButtonCadastroVeiculoLimpar = new javax.swing.JButton();
        jButtonCadastroVeiculoAlterar = new javax.swing.JButton();
        jLabelCadastroVeiculoCamposObrigatorios = new javax.swing.JLabel();
        jLabelCadastroVeiculoPesquisarID = new javax.swing.JLabel();
        jTextFieldCadastroVeiculoPesquisarID = new javax.swing.JTextField();
        jComboBoxCadastroVeiculoSituacaoVeiculo = new javax.swing.JComboBox<>();
        jButtonCadastroVeiculoIconePesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veículo");

        jLabelCadastroVeiculoModeloVeiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCadastroVeiculoModeloVeiculo.setText("*Modelo do Veículo :");

        jLabelCadastroVeiculoPlacaVeiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCadastroVeiculoPlacaVeiculo.setText("*Placa do Veículo:");

        jLabelCadastroVeiculoMarcaVeiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCadastroVeiculoMarcaVeiculo.setText("*Marca do Veículo:");

        jLabelCadastroVeiculoKmAtual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCadastroVeiculoKmAtual.setText("*Km atual:");

        jLabelCadastroVeiculoCapacidadeTanque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCadastroVeiculoCapacidadeTanque.setText("*Capacidade do tanque:");

        jLabelCadastroVeiculoSituacaoVeiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCadastroVeiculoSituacaoVeiculo.setText("*Situação do Veículo:");

        jTextFieldCadastroVeiculoMarcaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastroVeiculoMarcaVeiculoActionPerformed(evt);
            }
        });

        jButtonCadastroVeiculoSalvar.setText("Salvar");
        jButtonCadastroVeiculoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroVeiculoSalvarActionPerformed(evt);
            }
        });

        jButtonCadastroVeiculoLimpar.setText("Limpar");
        jButtonCadastroVeiculoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroVeiculoLimparActionPerformed(evt);
            }
        });

        jButtonCadastroVeiculoAlterar.setText("Alterar");

        jLabelCadastroVeiculoCamposObrigatorios.setText("* Campos obrigatórios.");

        jLabelCadastroVeiculoPesquisarID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCadastroVeiculoPesquisarID.setText("Pesquisar ID:");

        jTextFieldCadastroVeiculoPesquisarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastroVeiculoPesquisarIDActionPerformed(evt);
            }
        });

        jComboBoxCadastroVeiculoSituacaoVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        jButtonCadastroVeiculoIconePesquisar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastroVeiculoIconePesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastroVeiculoIconePesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/frotaveiculos/icones/pesquisar 20x20.png"))); // NOI18N
        jButtonCadastroVeiculoIconePesquisar.setToolTipText("Pesquisar");
        jButtonCadastroVeiculoIconePesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastroVeiculoIconePesquisar.setMaximumSize(new java.awt.Dimension(54, 30));
        jButtonCadastroVeiculoIconePesquisar.setMinimumSize(new java.awt.Dimension(54, 30));
        jButtonCadastroVeiculoIconePesquisar.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonCadastroVeiculoIconePesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroVeiculoIconePesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadastroVeiculoCapacidadeTanque)
                    .addComponent(jLabelCadastroVeiculoModeloVeiculo)
                    .addComponent(jLabelCadastroVeiculoPlacaVeiculo)
                    .addComponent(jLabelCadastroVeiculoMarcaVeiculo)
                    .addComponent(jLabelCadastroVeiculoKmAtual)
                    .addComponent(jLabelCadastroVeiculoSituacaoVeiculo)
                    .addComponent(jLabelCadastroVeiculoPesquisarID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldCadastroVeiculoCapacidadeTanque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addComponent(jTextFieldCadastroVeiculoKmAtual, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldCadastroVeiculoMarcaVeiculo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldCadastroVeiculoPlacaVeiculo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jButtonCadastroVeiculoSalvar)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonCadastroVeiculoLimpar)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonCadastroVeiculoAlterar))
                        .addComponent(jTextFieldCadastroVeiculoModeloVeiculo, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldCadastroVeiculoPesquisarID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCadastroVeiculoIconePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxCadastroVeiculoSituacaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCadastroVeiculoCamposObrigatorios)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastroVeiculoIconePesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCadastroVeiculoPesquisarID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCadastroVeiculoPesquisarID)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroVeiculoModeloVeiculo)
                    .addComponent(jTextFieldCadastroVeiculoModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroVeiculoPlacaVeiculo)
                    .addComponent(jTextFieldCadastroVeiculoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroVeiculoMarcaVeiculo)
                    .addComponent(jTextFieldCadastroVeiculoMarcaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroVeiculoKmAtual)
                    .addComponent(jTextFieldCadastroVeiculoKmAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroVeiculoCapacidadeTanque)
                    .addComponent(jTextFieldCadastroVeiculoCapacidadeTanque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroVeiculoSituacaoVeiculo)
                    .addComponent(jComboBoxCadastroVeiculoSituacaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastroVeiculoSalvar)
                    .addComponent(jButtonCadastroVeiculoLimpar)
                    .addComponent(jButtonCadastroVeiculoAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabelCadastroVeiculoCamposObrigatorios)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCadastroVeiculoMarcaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastroVeiculoMarcaVeiculoActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastroVeiculoMarcaVeiculoActionPerformed

    private void jButtonCadastroVeiculoIconePesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroVeiculoIconePesquisarActionPerformed
	//chamar método consultar da Tela Cadastro de veiculo
	consultar();
    }//GEN-LAST:event_jButtonCadastroVeiculoIconePesquisarActionPerformed

    private void jTextFieldCadastroVeiculoPesquisarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastroVeiculoPesquisarIDActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastroVeiculoPesquisarIDActionPerformed

    private void jButtonCadastroVeiculoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroVeiculoLimparActionPerformed
	//chamando o método limpar
	limpar();
    }//GEN-LAST:event_jButtonCadastroVeiculoLimparActionPerformed

    private void jButtonCadastroVeiculoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroVeiculoSalvarActionPerformed
	//chmando o método salvar
	salvar();
    }//GEN-LAST:event_jButtonCadastroVeiculoSalvarActionPerformed

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
	    java.util.logging.Logger.getLogger(GTelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(GTelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(GTelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(GTelaCadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new GTelaCadastroVeiculo().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroVeiculoAlterar;
    private javax.swing.JButton jButtonCadastroVeiculoIconePesquisar;
    private javax.swing.JButton jButtonCadastroVeiculoLimpar;
    private javax.swing.JButton jButtonCadastroVeiculoSalvar;
    private javax.swing.JComboBox<String> jComboBoxCadastroVeiculoSituacaoVeiculo;
    private javax.swing.JLabel jLabelCadastroVeiculoCamposObrigatorios;
    private javax.swing.JLabel jLabelCadastroVeiculoCapacidadeTanque;
    private javax.swing.JLabel jLabelCadastroVeiculoKmAtual;
    private javax.swing.JLabel jLabelCadastroVeiculoMarcaVeiculo;
    private javax.swing.JLabel jLabelCadastroVeiculoModeloVeiculo;
    private javax.swing.JLabel jLabelCadastroVeiculoPesquisarID;
    private javax.swing.JLabel jLabelCadastroVeiculoPlacaVeiculo;
    private javax.swing.JLabel jLabelCadastroVeiculoSituacaoVeiculo;
    private javax.swing.JTextField jTextFieldCadastroVeiculoCapacidadeTanque;
    private javax.swing.JTextField jTextFieldCadastroVeiculoKmAtual;
    private javax.swing.JTextField jTextFieldCadastroVeiculoMarcaVeiculo;
    private javax.swing.JTextField jTextFieldCadastroVeiculoModeloVeiculo;
    private javax.swing.JTextField jTextFieldCadastroVeiculoPesquisarID;
    private javax.swing.JTextField jTextFieldCadastroVeiculoPlacaVeiculo;
    // End of variables declaration//GEN-END:variables
}

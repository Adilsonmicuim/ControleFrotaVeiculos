/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frotaveiculos.telas;

import javax.swing.JOptionPane;

/**
 *
 * @author Adilson
 */
public class GTelaAbastecimento extends javax.swing.JFrame {

    /**
     * Creates new form GTelaAbastecimento
     */
    public GTelaAbastecimento() {
        initComponents();
        setBounds(300, 50, 700, 650);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTanqueCheio = new javax.swing.ButtonGroup();
        jComboBoxAbastecimentoPlacaVeiculo = new javax.swing.JComboBox<>();
        jComboBoxAbastecimentoMotorista = new javax.swing.JComboBox<>();
        jComboBoxAbastecimentoSetor = new javax.swing.JComboBox<>();
        jLabelAbastecimentoPlacaVeiculo = new javax.swing.JLabel();
        jLabelAbastecimentoMotorista = new javax.swing.JLabel();
        jLabelAbastecimentoSetor = new javax.swing.JLabel();
        jLabelAbastecimentoIDVeiculo = new javax.swing.JLabel();
        jLabelAbastecimentoIDMotorista = new javax.swing.JLabel();
        jLabelAbastecimentoIDSetor = new javax.swing.JLabel();
        jLabelAbastecimentoOdometro = new javax.swing.JLabel();
        jLabelAbastecimentoData = new javax.swing.JLabel();
        jLabelAbastecimentoNomePosto = new javax.swing.JLabel();
        jLabelAbastecimentoCusto = new javax.swing.JLabel();
        jLabelAbastecimentoTipoCombustivel = new javax.swing.JLabel();
        jLabelAbastecimentoTanqueCheio = new javax.swing.JLabel();
        jLabelAbastecimentoLitrosCombustivel = new javax.swing.JLabel();
        jLabelAbastecimentoReciboTipo = new javax.swing.JLabel();
        jLabelAbastecimentoCidade = new javax.swing.JLabel();
        jLabelAbastecimentoEstado = new javax.swing.JLabel();
        jLabelAbastecimentoReciboNumero = new javax.swing.JLabel();
        jTextFieldAbastecimentoOdometro = new javax.swing.JTextField();
        jTextFieldAbastecimentoNomePosto = new javax.swing.JTextField();
        jTextFieldAbastecimentoCusto = new javax.swing.JTextField();
        jComboBoxAbastecimentoTipoCombustivel = new javax.swing.JComboBox<>();
        jRadioButtonAbastecimentoSim = new javax.swing.JRadioButton();
        jRadioButtonAbastecimentoNao = new javax.swing.JRadioButton();
        jComboBoxAbastecimentoReciboTipo = new javax.swing.JComboBox<>();
        jTextFieldAbastecimentoCidade = new javax.swing.JTextField();
        jComboBoxAbastecimentoEstado = new javax.swing.JComboBox<>();
        jTextFieldAbastecimentoReciboNumero = new javax.swing.JTextField();
        jLabelAbastecimentoComentarios = new javax.swing.JLabel();
        jLabelAbastecimentoCamposObrigatorios = new javax.swing.JLabel();
        jTextFieldAbastecimentoData = new javax.swing.JTextField();
        jTextFieldAbastecimentoLitrosCombustivel = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAbastecimentoComentarios = new javax.swing.JTextArea();
        jButtonAbastecimentoSalvar = new javax.swing.JButton();
        jButtonAbastecimentoLimpar = new javax.swing.JButton();
        jButtonAbastecimentoAlterar = new javax.swing.JButton();
        jButtonAbastecimentoExcluir = new javax.swing.JButton();
        jLabelAbastecimentoFoto = new javax.swing.JLabel();
        jLabelAbastecimentoPesquisarID = new javax.swing.JLabel();
        jTextFieldAbastecimentoPesquisarID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Abastecimento");

        jComboBoxAbastecimentoPlacaVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABC 3030", "ABC 4444" }));

        jComboBoxAbastecimentoMotorista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adilson", "Juca Bala", "Zé Bolha" }));

        jComboBoxAbastecimentoSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setor A", "Setor B", "Setor C" }));

        jLabelAbastecimentoPlacaVeiculo.setText("*Placa Veiculo:");

        jLabelAbastecimentoMotorista.setText("*Motorista:");

        jLabelAbastecimentoSetor.setText("*Setor:");

        jLabelAbastecimentoIDVeiculo.setText("IDVeiculo");

        jLabelAbastecimentoIDMotorista.setText("IDMotorista");

        jLabelAbastecimentoIDSetor.setText("IDSetor");

        jLabelAbastecimentoOdometro.setText("*Odômetro:");

        jLabelAbastecimentoData.setText("*Data:");

        jLabelAbastecimentoNomePosto.setText("*Nome Posto:");

        jLabelAbastecimentoCusto.setText("*Custo R$:");

        jLabelAbastecimentoTipoCombustivel.setText("*Tipo Comb.:");

        jLabelAbastecimentoTanqueCheio.setText("*Tanque Cheio:");

        jLabelAbastecimentoLitrosCombustivel.setText("*Litros Comb.:");

        jLabelAbastecimentoReciboTipo.setText("Recibo Tipo:");

        jLabelAbastecimentoCidade.setText("Cidade:");

        jLabelAbastecimentoEstado.setText("Estado:");

        jLabelAbastecimentoReciboNumero.setText("Recibo Num.:");

        jComboBoxAbastecimentoTipoCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Óleo diesel", "Etanol" }));

        buttonGroupTanqueCheio.add(jRadioButtonAbastecimentoSim);
        jRadioButtonAbastecimentoSim.setText("Sim");

        buttonGroupTanqueCheio.add(jRadioButtonAbastecimentoNao);
        jRadioButtonAbastecimentoNao.setText("Não");

        jComboBoxAbastecimentoReciboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cupom Fiscal", "Nota Fiscal", "Recibo" }));

        jComboBoxAbastecimentoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabelAbastecimentoComentarios.setText("Comentários:");

        jLabelAbastecimentoCamposObrigatorios.setText("* Campos Obrigatórios.");

        jTextAreaAbastecimentoComentarios.setColumns(20);
        jTextAreaAbastecimentoComentarios.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAbastecimentoComentarios);

        jButtonAbastecimentoSalvar.setText("Salvar");
        jButtonAbastecimentoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbastecimentoSalvarActionPerformed(evt);
            }
        });

        jButtonAbastecimentoLimpar.setText("Limpar");

        jButtonAbastecimentoAlterar.setText("Alterar");

        jButtonAbastecimentoExcluir.setText("Excluir");

        jLabelAbastecimentoFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/frotaveiculos/icones/1Abastecimento.png"))); // NOI18N

        jLabelAbastecimentoPesquisarID.setText("Pesquisar ID:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/frotaveiculos/icones/pesquisar 20x20.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelAbastecimentoReciboNumero)
                            .addGap(274, 274, 274)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelAbastecimentoTanqueCheio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButtonAbastecimentoSim)
                                    .addGap(25, 25, 25)
                                    .addComponent(jRadioButtonAbastecimentoNao)
                                    .addGap(11, 11, 11))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelAbastecimentoReciboTipo)
                                        .addComponent(jLabelAbastecimentoEstado))
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxAbastecimentoEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxAbastecimentoReciboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelAbastecimentoLitrosCombustivel)
                                        .addComponent(jLabelAbastecimentoCusto))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldAbastecimentoLitrosCombustivel)
                                        .addComponent(jTextFieldAbastecimentoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jLabelAbastecimentoOdometro)
                        .addComponent(jLabelAbastecimentoNomePosto)
                        .addComponent(jLabelAbastecimentoTipoCombustivel)
                        .addComponent(jLabelAbastecimentoCidade)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelAbastecimentoMotorista)
                                .addComponent(jLabelAbastecimentoSetor)
                                .addComponent(jLabelAbastecimentoData)
                                .addComponent(jLabelAbastecimentoComentarios)
                                .addComponent(jLabelAbastecimentoPesquisarID)
                                .addComponent(jLabelAbastecimentoPlacaVeiculo))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonAbastecimentoSalvar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonAbastecimentoLimpar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonAbastecimentoAlterar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonAbastecimentoExcluir))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jTextFieldAbastecimentoData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAbastecimentoOdometro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAbastecimentoNomePosto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxAbastecimentoTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAbastecimentoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAbastecimentoReciboNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBoxAbastecimentoMotorista, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxAbastecimentoPlacaVeiculo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBoxAbastecimentoSetor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldAbastecimentoPesquisarID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelAbastecimentoIDMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelAbastecimentoIDVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelAbastecimentoIDSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabelAbastecimentoFoto))))))
                    .addComponent(jLabelAbastecimentoCamposObrigatorios))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelAbastecimentoFoto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelAbastecimentoPesquisarID)
                                .addComponent(jTextFieldAbastecimentoPesquisarID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelAbastecimentoIDVeiculo)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelAbastecimentoPlacaVeiculo)
                                    .addComponent(jComboBoxAbastecimentoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxAbastecimentoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAbastecimentoMotorista)
                            .addComponent(jLabelAbastecimentoIDMotorista))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxAbastecimentoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelAbastecimentoIDSetor))
                            .addComponent(jLabelAbastecimentoSetor))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAbastecimentoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAbastecimentoData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAbastecimentoOdometro)
                    .addComponent(jTextFieldAbastecimentoOdometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAbastecimentoCusto)
                    .addComponent(jTextFieldAbastecimentoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAbastecimentoNomePosto)
                    .addComponent(jTextFieldAbastecimentoNomePosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAbastecimentoLitrosCombustivel)
                    .addComponent(jTextFieldAbastecimentoLitrosCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAbastecimentoTipoCombustivel)
                    .addComponent(jComboBoxAbastecimentoTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAbastecimentoTanqueCheio)
                    .addComponent(jRadioButtonAbastecimentoSim)
                    .addComponent(jRadioButtonAbastecimentoNao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAbastecimentoCidade)
                    .addComponent(jTextFieldAbastecimentoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAbastecimentoEstado)
                    .addComponent(jComboBoxAbastecimentoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAbastecimentoReciboNumero)
                    .addComponent(jTextFieldAbastecimentoReciboNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAbastecimentoReciboTipo)
                    .addComponent(jComboBoxAbastecimentoReciboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAbastecimentoComentarios)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAbastecimentoSalvar)
                    .addComponent(jButtonAbastecimentoLimpar)
                    .addComponent(jButtonAbastecimentoAlterar)
                    .addComponent(jButtonAbastecimentoExcluir))
                .addGap(18, 18, 18)
                .addComponent(jLabelAbastecimentoCamposObrigatorios)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(671, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAbastecimentoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbastecimentoSalvarActionPerformed

    }//GEN-LAST:event_jButtonAbastecimentoSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(GTelaAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GTelaAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GTelaAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GTelaAbastecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GTelaAbastecimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTanqueCheio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAbastecimentoAlterar;
    private javax.swing.JButton jButtonAbastecimentoExcluir;
    private javax.swing.JButton jButtonAbastecimentoLimpar;
    private javax.swing.JButton jButtonAbastecimentoSalvar;
    private javax.swing.JComboBox<String> jComboBoxAbastecimentoEstado;
    private javax.swing.JComboBox<String> jComboBoxAbastecimentoMotorista;
    private javax.swing.JComboBox<String> jComboBoxAbastecimentoPlacaVeiculo;
    private javax.swing.JComboBox<String> jComboBoxAbastecimentoReciboTipo;
    private javax.swing.JComboBox<String> jComboBoxAbastecimentoSetor;
    private javax.swing.JComboBox<String> jComboBoxAbastecimentoTipoCombustivel;
    private javax.swing.JLabel jLabelAbastecimentoCamposObrigatorios;
    private javax.swing.JLabel jLabelAbastecimentoCidade;
    private javax.swing.JLabel jLabelAbastecimentoComentarios;
    private javax.swing.JLabel jLabelAbastecimentoCusto;
    private javax.swing.JLabel jLabelAbastecimentoData;
    private javax.swing.JLabel jLabelAbastecimentoEstado;
    private javax.swing.JLabel jLabelAbastecimentoFoto;
    private javax.swing.JLabel jLabelAbastecimentoIDMotorista;
    private javax.swing.JLabel jLabelAbastecimentoIDSetor;
    private javax.swing.JLabel jLabelAbastecimentoIDVeiculo;
    private javax.swing.JLabel jLabelAbastecimentoLitrosCombustivel;
    private javax.swing.JLabel jLabelAbastecimentoMotorista;
    private javax.swing.JLabel jLabelAbastecimentoNomePosto;
    private javax.swing.JLabel jLabelAbastecimentoOdometro;
    private javax.swing.JLabel jLabelAbastecimentoPesquisarID;
    private javax.swing.JLabel jLabelAbastecimentoPlacaVeiculo;
    private javax.swing.JLabel jLabelAbastecimentoReciboNumero;
    private javax.swing.JLabel jLabelAbastecimentoReciboTipo;
    private javax.swing.JLabel jLabelAbastecimentoSetor;
    private javax.swing.JLabel jLabelAbastecimentoTanqueCheio;
    private javax.swing.JLabel jLabelAbastecimentoTipoCombustivel;
    private javax.swing.JRadioButton jRadioButtonAbastecimentoNao;
    private javax.swing.JRadioButton jRadioButtonAbastecimentoSim;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaAbastecimentoComentarios;
    private javax.swing.JTextField jTextFieldAbastecimentoCidade;
    private javax.swing.JTextField jTextFieldAbastecimentoCusto;
    private javax.swing.JTextField jTextFieldAbastecimentoData;
    private javax.swing.JTextField jTextFieldAbastecimentoLitrosCombustivel;
    private javax.swing.JTextField jTextFieldAbastecimentoNomePosto;
    private javax.swing.JTextField jTextFieldAbastecimentoOdometro;
    private javax.swing.JTextField jTextFieldAbastecimentoPesquisarID;
    private javax.swing.JTextField jTextFieldAbastecimentoReciboNumero;
    // End of variables declaration//GEN-END:variables
}

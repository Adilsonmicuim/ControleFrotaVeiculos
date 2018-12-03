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
public class GTelaManutencao extends javax.swing.JFrame {

    /**
     * Creates new form GTelaAbastecimento
     */
    public GTelaManutencao() {
	initComponents();
	setBounds(300,50,700,650);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxManutencaoPlacaVeiculo = new javax.swing.JComboBox<>();
        jComboBoxManutencaoMotorista = new javax.swing.JComboBox<>();
        jComboBoxManutencaoSetor = new javax.swing.JComboBox<>();
        jLabelManutencaoPlacaVeiculo = new javax.swing.JLabel();
        jLabelManutencaoMotorista = new javax.swing.JLabel();
        jLabelManutencaoSetor = new javax.swing.JLabel();
        jLabelManutencaoIDVeiculo = new javax.swing.JLabel();
        jLabelManutencaoIDMotorista = new javax.swing.JLabel();
        jLabelManutencaoIDSetor = new javax.swing.JLabel();
        jLabelManutencaoOdometro = new javax.swing.JLabel();
        jLabelManutencaoData = new javax.swing.JLabel();
        jLabelManutencaoLocalServico = new javax.swing.JLabel();
        jLabelManutencaoCusto = new javax.swing.JLabel();
        jLabelManutencaoDetalhes = new javax.swing.JLabel();
        jLabelManutencaoCidade = new javax.swing.JLabel();
        jLabelManutencaoEstado = new javax.swing.JLabel();
        jTextFieldManutencaoOdometro = new javax.swing.JTextField();
        jTextFieldManutencaoLocalServico = new javax.swing.JTextField();
        jTextFieldManutencaoCusto = new javax.swing.JTextField();
        jTextFieldManutencaoCidade = new javax.swing.JTextField();
        jComboBoxManutencaoEstado = new javax.swing.JComboBox<>();
        jTextFieldManutencaoData = new javax.swing.JTextField();
        jTextFieldManutencaoDetalhes = new javax.swing.JTextField();
        jButtonManutencaoSalvar = new javax.swing.JButton();
        jButtonManutencaoLimpar = new javax.swing.JButton();
        jButtonManutencaoAlterar = new javax.swing.JButton();
        jButtonManutencaoExcluir = new javax.swing.JButton();
        jLabelManutencaoFoto = new javax.swing.JLabel();
        jLabelManutencaoTipoServico = new javax.swing.JLabel();
        jComboBoxManutencaoTipoServico = new javax.swing.JComboBox<>();
        jLabelManutencaoPesquisarID = new javax.swing.JLabel();
        jTextFieldManutencaoPesquisarID = new javax.swing.JTextField();
        jLabelManutencaoCamposObrigatorios = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção");

        jComboBoxManutencaoPlacaVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABC 3030", "ABC 4444" }));

        jComboBoxManutencaoMotorista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adilson", "Juca Bala", "Zé Bolha" }));

        jComboBoxManutencaoSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setor A", "Setor B", "Setor C" }));

        jLabelManutencaoPlacaVeiculo.setText("*Placa Veiculo:");

        jLabelManutencaoMotorista.setText("*Motorista:");

        jLabelManutencaoSetor.setText("*Setor:");

        jLabelManutencaoIDVeiculo.setText("IDVeiculo");

        jLabelManutencaoIDMotorista.setText("IDMotorista");

        jLabelManutencaoIDSetor.setText("IDSetor");

        jLabelManutencaoOdometro.setText("Odômetro:");

        jLabelManutencaoData.setText("*Data:");

        jLabelManutencaoLocalServico.setText("Local Serviço:");

        jLabelManutencaoCusto.setText("*Custo R$:");

        jLabelManutencaoDetalhes.setText("Detalhes:");

        jLabelManutencaoCidade.setText("Cidade:");

        jLabelManutencaoEstado.setText("Estado:");

        jComboBoxManutencaoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jButtonManutencaoSalvar.setText("Salvar");

        jButtonManutencaoLimpar.setText("Limpar");

        jButtonManutencaoAlterar.setText("Alterar");

        jButtonManutencaoExcluir.setText("Excluir");

        jLabelManutencaoFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/frotaveiculos/icones/3Manutencao.png"))); // NOI18N

        jLabelManutencaoTipoServico.setText("*Tipo Serviço:");

        jComboBoxManutencaoTipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelManutencaoPesquisarID.setText("Pesquisar ID:");

        jLabelManutencaoCamposObrigatorios.setText("* Campos Obrigatórios");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/frotaveiculos/icones/pesquisar 20x20.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelManutencaoPlacaVeiculo)
                            .addComponent(jLabelManutencaoMotorista)
                            .addComponent(jLabelManutencaoSetor)
                            .addComponent(jLabelManutencaoData))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldManutencaoData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxManutencaoMotorista, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jComboBoxManutencaoPlacaVeiculo, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jComboBoxManutencaoSetor, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jTextFieldManutencaoPesquisarID))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelManutencaoIDMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelManutencaoIDVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabelManutencaoIDSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabelManutencaoCusto)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldManutencaoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelManutencaoOdometro)
                    .addComponent(jLabelManutencaoTipoServico)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelManutencaoCamposObrigatorios)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(jLabelManutencaoEstado)
                                .addGap(31, 31, 31)
                                .addComponent(jComboBoxManutencaoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelManutencaoLocalServico)
                            .addComponent(jLabelManutencaoCidade)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelManutencaoDetalhes)
                                    .addComponent(jLabelManutencaoPesquisarID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonManutencaoSalvar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonManutencaoLimpar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonManutencaoAlterar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonManutencaoExcluir))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelManutencaoFoto)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldManutencaoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldManutencaoDetalhes)
                                            .addComponent(jTextFieldManutencaoLocalServico)
                                            .addComponent(jTextFieldManutencaoOdometro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxManutencaoTipoServico, 0, 482, Short.MAX_VALUE))))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelManutencaoFoto)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelManutencaoPesquisarID)
                                .addComponent(jTextFieldManutencaoPesquisarID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxManutencaoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelManutencaoPlacaVeiculo)
                            .addComponent(jLabelManutencaoIDVeiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxManutencaoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelManutencaoMotorista)
                            .addComponent(jLabelManutencaoIDMotorista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxManutencaoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelManutencaoSetor)
                                .addComponent(jLabelManutencaoIDSetor)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelManutencaoData)
                            .addComponent(jTextFieldManutencaoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelManutencaoTipoServico)
                    .addComponent(jComboBoxManutencaoTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelManutencaoOdometro)
                    .addComponent(jTextFieldManutencaoOdometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelManutencaoCusto)
                    .addComponent(jTextFieldManutencaoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelManutencaoLocalServico)
                    .addComponent(jTextFieldManutencaoLocalServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelManutencaoDetalhes)
                    .addComponent(jTextFieldManutencaoDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelManutencaoCidade)
                    .addComponent(jTextFieldManutencaoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelManutencaoEstado)
                    .addComponent(jComboBoxManutencaoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonManutencaoSalvar)
                    .addComponent(jButtonManutencaoLimpar)
                    .addComponent(jButtonManutencaoAlterar)
                    .addComponent(jButtonManutencaoExcluir))
                .addGap(55, 55, 55)
                .addComponent(jLabelManutencaoCamposObrigatorios)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
	    java.util.logging.Logger.getLogger(GTelaManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(GTelaManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(GTelaManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(GTelaManutencao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new GTelaManutencao().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonManutencaoAlterar;
    private javax.swing.JButton jButtonManutencaoExcluir;
    private javax.swing.JButton jButtonManutencaoLimpar;
    private javax.swing.JButton jButtonManutencaoSalvar;
    private javax.swing.JComboBox<String> jComboBoxManutencaoEstado;
    private javax.swing.JComboBox<String> jComboBoxManutencaoMotorista;
    private javax.swing.JComboBox<String> jComboBoxManutencaoPlacaVeiculo;
    private javax.swing.JComboBox<String> jComboBoxManutencaoSetor;
    private javax.swing.JComboBox<String> jComboBoxManutencaoTipoServico;
    private javax.swing.JLabel jLabelManutencaoCamposObrigatorios;
    private javax.swing.JLabel jLabelManutencaoCidade;
    private javax.swing.JLabel jLabelManutencaoCusto;
    private javax.swing.JLabel jLabelManutencaoData;
    private javax.swing.JLabel jLabelManutencaoDetalhes;
    private javax.swing.JLabel jLabelManutencaoEstado;
    private javax.swing.JLabel jLabelManutencaoFoto;
    private javax.swing.JLabel jLabelManutencaoIDMotorista;
    private javax.swing.JLabel jLabelManutencaoIDSetor;
    private javax.swing.JLabel jLabelManutencaoIDVeiculo;
    private javax.swing.JLabel jLabelManutencaoLocalServico;
    private javax.swing.JLabel jLabelManutencaoMotorista;
    private javax.swing.JLabel jLabelManutencaoOdometro;
    private javax.swing.JLabel jLabelManutencaoPesquisarID;
    private javax.swing.JLabel jLabelManutencaoPlacaVeiculo;
    private javax.swing.JLabel jLabelManutencaoSetor;
    private javax.swing.JLabel jLabelManutencaoTipoServico;
    private javax.swing.JTextField jTextFieldManutencaoCidade;
    private javax.swing.JTextField jTextFieldManutencaoCusto;
    private javax.swing.JTextField jTextFieldManutencaoData;
    private javax.swing.JTextField jTextFieldManutencaoDetalhes;
    private javax.swing.JTextField jTextFieldManutencaoLocalServico;
    private javax.swing.JTextField jTextFieldManutencaoOdometro;
    private javax.swing.JTextField jTextFieldManutencaoPesquisarID;
    // End of variables declaration//GEN-END:variables
}

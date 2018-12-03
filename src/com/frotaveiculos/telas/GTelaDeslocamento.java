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
public class GTelaDeslocamento extends javax.swing.JFrame {

    /**
     * Creates new form GTelaAbastecimento
     */
    public GTelaDeslocamento() {
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

        buttonFinalizarTelaDeslocamento = new javax.swing.ButtonGroup();
        jComboBoxDeslocamentoPlacaVeiculo = new javax.swing.JComboBox<>();
        jComboBoxDeslocamentoMotorista = new javax.swing.JComboBox<>();
        jComboBoxDeslocamentoSetor = new javax.swing.JComboBox<>();
        jLabelDeslocamentoPlacaVeiculo = new javax.swing.JLabel();
        jLabelDeslocamentoMotorista = new javax.swing.JLabel();
        jLabelDeslocamentoSetor = new javax.swing.JLabel();
        jLabelDeslocamentoIDVeiculo = new javax.swing.JLabel();
        jLabelDeslocamentoIDMotorista = new javax.swing.JLabel();
        jLabelDeslocamentoIDSetor = new javax.swing.JLabel();
        jLabelDeslocamentoOdometroSaida = new javax.swing.JLabel();
        jLabelDeslocamentoDataSaida = new javax.swing.JLabel();
        jLabelDeslocamentoDescricao = new javax.swing.JLabel();
        jLabelDeslocamentoCamposObrigatorios = new javax.swing.JLabel();
        jButtonDeslocamentoSalvar = new javax.swing.JButton();
        jButtonDeslocamentoLimpar = new javax.swing.JButton();
        jButtonDeslocamentoExcluir = new javax.swing.JButton();
        jButtonDeslocamentoAlterar = new javax.swing.JButton();
        jLabelDeslocamentoFoto = new javax.swing.JLabel();
        jTextFieldDeslocamentoDataSaida = new javax.swing.JTextField();
        jLabelDeslocamentoDataChegada = new javax.swing.JLabel();
        jTextFieldDeslocamentoDataChegada = new javax.swing.JTextField();
        jLabelDeslocamentoOdometroChegada = new javax.swing.JLabel();
        jLabelDeslocamentoFinalizar = new javax.swing.JLabel();
        jRadioButtonDeslocamentoSim = new javax.swing.JRadioButton();
        jRadioButtonDeslocamentoNao = new javax.swing.JRadioButton();
        jLabelDeslocamentoKmRodado = new javax.swing.JLabel();
        jLabelDeslocamentoImprimirKmRodado = new javax.swing.JLabel();
        jTextFieldDeslocamentoDescricao = new javax.swing.JTextField();
        jTextFieldDeslocamentoOdometroSaida = new javax.swing.JTextField();
        jTextFieldDeslocamentoOdometroChegada = new javax.swing.JTextField();
        jLabelDeslocamentoPesquisarID = new javax.swing.JLabel();
        jTextFieldDeslocamentoPesquisarID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deslocamento");

        jComboBoxDeslocamentoPlacaVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABC 3030", "ABC 4444" }));

        jComboBoxDeslocamentoMotorista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adilson", "Juca Bala", "Zé Bolha" }));

        jComboBoxDeslocamentoSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setor A", "Setor B", "Setor C" }));

        jLabelDeslocamentoPlacaVeiculo.setText("*Placa Veiculo:");

        jLabelDeslocamentoMotorista.setText("*Motorista:");

        jLabelDeslocamentoSetor.setText("*Setor:");

        jLabelDeslocamentoIDVeiculo.setText("IDVeiculo");

        jLabelDeslocamentoIDMotorista.setText("IDMotorista");

        jLabelDeslocamentoIDSetor.setText("IDSetor");

        jLabelDeslocamentoOdometroSaida.setText("*Odômetro:");

        jLabelDeslocamentoDataSaida.setText("*Data Saída:");

        jLabelDeslocamentoDescricao.setText("Descrição:");

        jLabelDeslocamentoCamposObrigatorios.setText("* Campos Obrigatórios.");

        jButtonDeslocamentoSalvar.setText("Salvar");

        jButtonDeslocamentoLimpar.setText("Limpar");

        jButtonDeslocamentoExcluir.setText("Exluir");

        jButtonDeslocamentoAlterar.setText("Alterar");

        jLabelDeslocamentoFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/frotaveiculos/icones/2Deslocamento.png"))); // NOI18N

        jLabelDeslocamentoDataChegada.setText("Data Chegada:");

        jLabelDeslocamentoOdometroChegada.setText("Odômetro:");

        jLabelDeslocamentoFinalizar.setText("Finalizar:");

        buttonFinalizarTelaDeslocamento.add(jRadioButtonDeslocamentoSim);
        jRadioButtonDeslocamentoSim.setText("Sim");

        buttonFinalizarTelaDeslocamento.add(jRadioButtonDeslocamentoNao);
        jRadioButtonDeslocamentoNao.setText("Não");

        jLabelDeslocamentoKmRodado.setText("Km Rodado:");

        jLabelDeslocamentoImprimirKmRodado.setText("Ao finalizar imprimir aqui a quantidade de km rodado.");

        jLabelDeslocamentoPesquisarID.setText("Pesquisar ID:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/frotaveiculos/icones/pesquisar 20x20.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelDeslocamentoCamposObrigatorios))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDeslocamentoDescricao)
                            .addComponent(jLabelDeslocamentoDataChegada)
                            .addComponent(jLabelDeslocamentoKmRodado)
                            .addComponent(jLabelDeslocamentoFinalizar)
                            .addComponent(jLabelDeslocamentoDataSaida)
                            .addComponent(jLabelDeslocamentoMotorista)
                            .addComponent(jLabelDeslocamentoSetor)
                            .addComponent(jLabelDeslocamentoPlacaVeiculo)
                            .addComponent(jLabelDeslocamentoPesquisarID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldDeslocamentoDataSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDeslocamentoDataChegada, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDeslocamentoSetor, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDeslocamentoMotorista, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDeslocamentoPlacaVeiculo, 0, 150, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDeslocamentoPesquisarID))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelDeslocamentoOdometroChegada)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelDeslocamentoOdometroSaida)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldDeslocamentoOdometroSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabelDeslocamentoIDMotorista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                                .addComponent(jLabelDeslocamentoIDVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelDeslocamentoIDSetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelDeslocamentoFoto))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldDeslocamentoOdometroChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDeslocamentoImprimirKmRodado)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jRadioButtonDeslocamentoSim)
                                            .addGap(26, 26, 26)
                                            .addComponent(jRadioButtonDeslocamentoNao))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonDeslocamentoSalvar)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonDeslocamentoLimpar)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonDeslocamentoAlterar)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButtonDeslocamentoExcluir))
                                        .addComponent(jTextFieldDeslocamentoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 25, Short.MAX_VALUE)))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelDeslocamentoPesquisarID)
                                    .addComponent(jTextFieldDeslocamentoPesquisarID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDeslocamentoPlacaVeiculo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxDeslocamentoPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelDeslocamentoIDVeiculo)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxDeslocamentoMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDeslocamentoMotorista)
                            .addComponent(jLabelDeslocamentoIDMotorista)))
                    .addComponent(jLabelDeslocamentoFoto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDeslocamentoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDeslocamentoIDSetor)
                    .addComponent(jLabelDeslocamentoSetor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDeslocamentoDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDeslocamentoDataSaida))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDeslocamentoDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelDeslocamentoDataChegada)
                                .addComponent(jLabelDeslocamentoOdometroChegada)
                                .addComponent(jTextFieldDeslocamentoOdometroChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDeslocamentoOdometroSaida)
                        .addComponent(jTextFieldDeslocamentoOdometroSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDeslocamentoDescricao)
                    .addComponent(jTextFieldDeslocamentoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeslocamentoFinalizar)
                    .addComponent(jRadioButtonDeslocamentoSim)
                    .addComponent(jRadioButtonDeslocamentoNao))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDeslocamentoKmRodado)
                    .addComponent(jLabelDeslocamentoImprimirKmRodado))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeslocamentoSalvar)
                    .addComponent(jButtonDeslocamentoLimpar)
                    .addComponent(jButtonDeslocamentoExcluir)
                    .addComponent(jButtonDeslocamentoAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabelDeslocamentoCamposObrigatorios)
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
	    java.util.logging.Logger.getLogger(GTelaDeslocamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(GTelaDeslocamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(GTelaDeslocamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(GTelaDeslocamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new GTelaDeslocamento().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonFinalizarTelaDeslocamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDeslocamentoAlterar;
    private javax.swing.JButton jButtonDeslocamentoExcluir;
    private javax.swing.JButton jButtonDeslocamentoLimpar;
    private javax.swing.JButton jButtonDeslocamentoSalvar;
    private javax.swing.JComboBox<String> jComboBoxDeslocamentoMotorista;
    private javax.swing.JComboBox<String> jComboBoxDeslocamentoPlacaVeiculo;
    private javax.swing.JComboBox<String> jComboBoxDeslocamentoSetor;
    private javax.swing.JLabel jLabelDeslocamentoCamposObrigatorios;
    private javax.swing.JLabel jLabelDeslocamentoDataChegada;
    private javax.swing.JLabel jLabelDeslocamentoDataSaida;
    private javax.swing.JLabel jLabelDeslocamentoDescricao;
    private javax.swing.JLabel jLabelDeslocamentoFinalizar;
    private javax.swing.JLabel jLabelDeslocamentoFoto;
    private javax.swing.JLabel jLabelDeslocamentoIDMotorista;
    private javax.swing.JLabel jLabelDeslocamentoIDSetor;
    private javax.swing.JLabel jLabelDeslocamentoIDVeiculo;
    private javax.swing.JLabel jLabelDeslocamentoImprimirKmRodado;
    private javax.swing.JLabel jLabelDeslocamentoKmRodado;
    private javax.swing.JLabel jLabelDeslocamentoMotorista;
    private javax.swing.JLabel jLabelDeslocamentoOdometroChegada;
    private javax.swing.JLabel jLabelDeslocamentoOdometroSaida;
    private javax.swing.JLabel jLabelDeslocamentoPesquisarID;
    private javax.swing.JLabel jLabelDeslocamentoPlacaVeiculo;
    private javax.swing.JLabel jLabelDeslocamentoSetor;
    private javax.swing.JRadioButton jRadioButtonDeslocamentoNao;
    private javax.swing.JRadioButton jRadioButtonDeslocamentoSim;
    private javax.swing.JTextField jTextFieldDeslocamentoDataChegada;
    private javax.swing.JTextField jTextFieldDeslocamentoDataSaida;
    private javax.swing.JTextField jTextFieldDeslocamentoDescricao;
    private javax.swing.JTextField jTextFieldDeslocamentoOdometroChegada;
    private javax.swing.JTextField jTextFieldDeslocamentoOdometroSaida;
    private javax.swing.JTextField jTextFieldDeslocamentoPesquisarID;
    // End of variables declaration//GEN-END:variables
}
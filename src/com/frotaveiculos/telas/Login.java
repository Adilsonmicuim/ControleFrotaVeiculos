package com.frotaveiculos.telas;

import java.sql.*;
import com.frotaveiculos.dal.ModuloConexao;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    //atributos
    Connection conexao = null;
    PreparedStatement pst = null;//PreparedStatement: conjunto de bibliotecas - Variavel pst
    ResultSet rs = null; //exibir o resultado das instruções slq

    public void logar() {

	String sql = "select * from TB_login where login =? and senha_acesso = ?";
	try {
	    // as linhas abaixo preparam a consulta ao banco em função do 
	    // que foi digitado em usuário e senha. O ? é substituido pelo conteudo das variáveis
	    pst = conexao.prepareStatement(sql); // prepara o sql - continua na linha abaixo
	    pst.setString(1, txtUsuario.getText());//Parametro 01 // substitui os ? por palavras digitadas.
	    pst.setString(2, txtSenha.getText());//parametro 02
	    // a linha abaixo executa a query: consulta no banco de dados
	    rs = pst.executeQuery();
	    //se existir usuário e senha correspondente
	    if (rs.next()) {
		/*-------------------------*/
		//a linha abaixo obtem o conteúdo do campo perfil da tabela tb_usuarios
		String perfil = rs.getString(6);//Procurar na coluna 6 (perfil)
		System.out.println(perfil);// antes de logar imprimir o conteudo da variável. Apenas para facilitar o deselvolvedor.
		// A estrutura abaixo faz o tratamento do perfil do usuário.
		if (perfil.equals("admin")) {// se perfil igual adimin
		    //chama a tela principal - instanciar
		    TelaPrincipal principal = new TelaPrincipal();
		    principal.setVisible(true);// assim que logar tela principal fica disponivel
		    TelaPrincipal.MenuRelatorio.setEnabled(true);
		    TelaPrincipal.MenuCadastro.setEnabled(true);

		    TelaPrincipal.jLabelNomeTela.setText(rs.getString(2));//mostra na tela principal nome do usuário
		    TelaPrincipal.jLabelNomeTela.setForeground(Color.red);

		    this.dispose();//após logar fechar tela de login
		    conexao.close();//fechando conecxão com DB

		} else {
		    TelaPrincipal principal = new TelaPrincipal();
		    principal.setVisible(true);// assim que logar tela principal fica disponivel 

		    TelaPrincipal.jLabelNomeTela.setText(rs.getString(2));//mostra na tela principal nome do usuário
		    TelaPrincipal.jLabelNomeTela.setForeground(Color.blue);
		    
		    this.dispose();//após logar fechar tela de login
		    conexao.close();//fechando conecxão com DB
		}
	    } else {
		JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido");
	    }
	} catch (HeadlessException | SQLException e) {//caso ocorra alguma excessão exibir mensagem
	    JOptionPane.showMessageDialog(null, e);
	}
    }

    public Login() throws ClassNotFoundException {
	initComponents();
	conexao = ModuloConexao.conector();
	//A linha abaixo serve de apoio ao status da conexão
	System.out.println(conexao);

	if (conexao != null) {
	    lblStatus.setText("DB Conectado"); //Escreva na variavel status 
	    lblStatus.setForeground(Color.blue);
	    lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/frotaveiculos/icones/dbok.png")));
	} else {
	    lblStatus.setText("DB Não Conctado");
	    lblStatus.setForeground(Color.red);
	    lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/frotaveiculos/icones/dberror.png")));
	}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsuarioTelaLogin = new javax.swing.JLabel();
        SenhaTelaLogin = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System Login");
        setResizable(false);

        UsuarioTelaLogin.setText("Usuário");

        SenhaTelaLogin.setText("Senha");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblStatus.setText("status");

        jLabel1.setText("Usuário Admin: adilson  senha:12345");

        jLabel2.setText("Usuário comum: juca   senha:54321");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsuarioTelaLogin)
                    .addComponent(SenhaTelaLogin))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblStatus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtSenha)
                        .addComponent(txtUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioTelaLogin)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaTelaLogin)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12))))
        );

        setSize(new java.awt.Dimension(524, 268));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
	// Assim que campos preenchidos, ao clicar eo login ele chama o método logar()
	logar();
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {

	java.awt.EventQueue.invokeLater(() -> {
	    try {
		new Login().setVisible(true);
	    } catch (ClassNotFoundException ex) {
		Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SenhaTelaLogin;
    private javax.swing.JLabel UsuarioTelaLogin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

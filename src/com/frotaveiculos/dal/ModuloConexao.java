package com.frotaveiculos.dal;

import java.sql.*; 
import javax.swing.JOptionPane;

//DAL: Camada de acesso a dados

public class ModuloConexao {
    // Método responsável por estabelecer a conexão com o banco

    public static Connection conector() throws ClassNotFoundException { //Connection é um conjunto de funcionalidades que vem junto import java.sql.*; - conector é o nome do método
        //Quando cria um método sem o "void" é necessário um return
        java.sql.Connection conexao = null; // criamos a variável conexao e atribuimos null - Ou seja ñ existe conexão no momento

        // linha abaixo chama o driver sql
        String driver = "org.postgres.Driver";

        // Armazenando informações referente ao banco
        String url = "jdbc:postgresql://localhost:5432/ControleFrotaVeiculos";
        String user = "root";
        String password = "";

        //JOptionPane.showMessageDialog(null,"Conectado com sucesso ao Banco de Dados");
        // Estabelecendo a conexão com o banco de dados
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
            return DriverManager.getConnection("jdbc:postgresql://localhost/ControleFrotaVeiculos", "postgres", "postgres");
        } catch (SQLException e) {
            System.out.println(e); //msg apoio para esclarecer o erro.
            throw new RuntimeException(e);
        }
    }
}

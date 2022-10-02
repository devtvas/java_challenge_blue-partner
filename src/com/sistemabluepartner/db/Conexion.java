package com.sistemabluepartner.db;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Tarcisio
 */
public class Conexion {

    // Configuração dos parâmetros de conexão
    private static String database = "oracle";
    private static String server = "@localhost";
    private static String port = "1521";               // Porta TCP padrão do Oracle
    private static String module = "XE";
    private static String url = "jdbc" + ":" + database + ":" + "thin:" + server + ":" + port + ":" + module;

    // Configuração dos parâmetros de autenticação
    private static String user = "DEVTVAS";
    private static String passwd = "123456";

    // Configuracao da instancia sql
    private static Connection conn = null;
    private static Statement query;

    //method
    public static Connection getConexion() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, passwd);
            conn. setAutoCommit(false);
            query = conn.createStatement();
            if (conn != null) {
                System.out.println("Conexion Exitosa!!!");
                return conn;
            } else {
                System.out.println("Conexion es erronea!!!");
                return conn;
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "Conexion Erronea [" + e.getMessage() + "]");
            return conn;
        }
    }

    public void getDesconexion() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Erro ao desconectar " + e.getMessage());
        }
    }
}

package com.mycompany.aula1.banco.de.dados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    
    private static String URL = "jdbc:mysql://localhost:3306/universidade?useTimezone=true&server=UTC";
    private static String usuario = "root";
    private static String senha = "usjt";
    
    public static Connection getConnection() {
        try{
            Connection conexao = DriverManeger.get(URL, usuario, senha);
            System.out.println("Conexao estabelecida com sucesso");
            return conexao;
        }catch(SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}

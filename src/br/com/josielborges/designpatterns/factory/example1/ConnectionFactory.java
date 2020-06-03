package br.com.josielborges.designpatterns.factory.example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgres://localhost:2345", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

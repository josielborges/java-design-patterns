package br.com.josielborges.designpatterns.factory.example1;

import java.sql.Connection;

public class FatctoryTest1 {

    public static void main(String[] args) {
        Connection connection = new ConnectionFactory().getConnection();
        // continue implementation
    }

}

package com.primeiroprojweb.sping.web.mvc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionFactory {
    private ConnectionFactory() {
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection() {

        Connection connection = null;
        try {
            InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("conection,properties");

            Properties prop = new Properties();
            prop.load(input);
            String driver = prop.getProperty("jdbc.driver");
            String dataBaseAdress = prop.getProperty("db.adress");
            String dataBaseName = prop.getProperty("db.name");
            String user = prop.getProperty("db.user.login");
            String password = prop.getProperty("db.user.password");

            StringBuilder sb = new StringBuilder("jdbc:")
                    .append(driver).append("://")
                    .append(dataBaseAdress).append("/")
                    .append(dataBaseName).append("?characterEncoding=utf8");

            String connectionUrl = sb.toString();
            try {
                connection = DriverManager.getConnection(connectionUrl, user, password);
            } catch (SQLException e) {
                System.out.println("Erro");
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

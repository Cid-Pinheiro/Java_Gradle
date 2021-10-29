package com.primeiroprojweb.sping.web.mvc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args)  {
        String urlConnection = "jdbc:mysql://localhost:3306/jedi?characterEncoding=utf8";
        try {Connection conn = DriverManager.getConnection(urlConnection, "root", "G210674c!");
            System.out.println("Sucesso");

        } catch (Exception e) {
            System.out.println("Falha");
            //e.printStackTrace();
        }
        }
        }
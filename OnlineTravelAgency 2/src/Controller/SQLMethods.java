/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sonipriyapaul
 */
public class SQLMethods implements SQLConnection{
    
    private Statement smt;
    private Connection conn = null;

    protected SQLMethods() {
        try {
            //load mysql driver
            Class.forName(DRIVER);
            //connect to mysql database with username and password
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            smt = conn.createStatement();
            //createDataBase(); // create database
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver Not Found"); // show error if ar not added to project
            System.exit(0);
        } catch (SQLException ex) { // if database exist
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }
    
}

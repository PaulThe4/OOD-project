/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author sonipriyapaul
 */
public interface SQLConnection {
    
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "Education@2021";
    
   public static final String URL = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
    //public static final String DB_NAME = "carpoolingdb";
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    
}

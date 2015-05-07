/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.util;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class DbUtil {
    private Connection connection = null;
    
    public Connection getConnection(){
        if(connection != null){
            return connection;
        }else{
            try{
                String driver="com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/userdb";
                Class.forName(driver);
                connection = (Connection) DriverManager.getConnection(url,"root","root");
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }catch(SQLException e){
                e.printStackTrace();
            }
            return connection;
        }
    }
    
    public boolean disconnect(){
        try{
            connection.close();
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
}

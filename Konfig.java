/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UASGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author WINDOWS 10
 */
public class Konfig {
    
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException {
        try{
            String url = "jdbc:mysql://localhost:3306/uas";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Koneksi Gagal" + e.getMessage());
        }
        return MySQLConfig;
    }

    Konfig() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    Konfig() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}

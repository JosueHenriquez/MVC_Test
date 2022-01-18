/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    public static Connection getConnection(){
        Connection con;
        try{
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "database = bdcrudprueba;"
                    + "user = sa;"
                    + "password = josue123;"
                    + "loginTimeout = 30";
            con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
    }
}

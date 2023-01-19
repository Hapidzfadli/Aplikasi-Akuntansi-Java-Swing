/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eca.acounting.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Zenbook Duo
 */
public class Koneksi {
    public static Connection konek(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection konekDB= DriverManager.getConnection("jdbc:mysql://localhost/accounting", "root", "");
            return konekDB;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showInternalMessageDialog(null, e);
            return null;
        }
    }
}

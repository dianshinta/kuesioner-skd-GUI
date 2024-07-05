/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */

public class Connector {
    String DBurl = "jdbc:mysql://localhost:3306/kuesionerskd";
    String DBusername = "root";
    String DBpassword = "";
    
    public Connection koneksi;
    public Statement statement;
    public PreparedStatement pstmt;

    /**
     *
     */
    public Connector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception e){
            System.out.println("Koneksi Gagal");
        }
    }
    
    public Connection getConnection() {
        return koneksi;
    }

    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Connection Closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PreparedStatement getPreparedStatement(String sql) throws SQLException {
        return koneksi.prepareStatement(sql);
    }
}

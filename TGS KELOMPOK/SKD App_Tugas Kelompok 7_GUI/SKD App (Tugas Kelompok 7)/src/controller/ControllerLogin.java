/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Login;
import model.Connector;
import view.MenuView;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author ASUS
 */

public class ControllerLogin {
    Login loginView;
    
    public ControllerLogin(Login loginView) {
        this.loginView = loginView;
    } 
    
    public void cek(){
        String email = loginView.getLoginEmail().getText();
        String password = loginView.getLoginPassword();
        String cek_user = null;
        String cek_pass = null;
        String cek_nama = null;
        
        try {
            Connector connector = new Connector();
            Statement statement = connector.koneksi.createStatement();
            String query = "SELECT * FROM users WHERE email = '" + email + "' AND password = '" + password +"'";
            ResultSet result = statement.executeQuery(query);
            
            while (result.next()) {
                cek_user = result.getString("email");
                cek_pass = result.getString("password");
                cek_nama = result.getString("nama");
            }
            
            result.close();
            statement.close();
        } catch (SQLException e) {
        }
        
        if (cek_user == null && cek_pass == null) {
            String message = "Email Atau Password Salah";
            JOptionPane.showMessageDialog(null,message,"Message",JOptionPane.INFORMATION_MESSAGE);
        }else {
            String message1 = "Login Berhasil";
            JOptionPane.showMessageDialog(null,message1,"Message",JOptionPane.INFORMATION_MESSAGE);
                       
            MenuView menuView = new MenuView();
            menuView.setVisible(true);
            loginView.dispose();

        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Connector;

/**
 *
 * @author shinta
 */
public class ControllerExportData {
    public ControllerExportData() {
        
    }   
    
    public void exportCsvData(String nomorResponden) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save as CSV");
        fileChooser.setSelectedFile(new File("DATA_RESPONDEN_SKD.csv"));

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            if (!filePath.endsWith(".csv")) {
                filePath += ".csv";
            }

            // Connect to the database and fetch data
            Connector connector = new Connector();
            String query = "SELECT * FROM keterangan_responden WHERE no_responden = ?";

            try (Connection conn = connector.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {

                pstmt.setString(1, nomorResponden); 
                try (ResultSet rs = pstmt.executeQuery();
                     FileWriter writer = new FileWriter(filePath)) {

                    // Write the header row
                    writer.write("No,Nama,Tahun Lahir,Email,No HP,Jenis Kelamin,Pendidikan Tertinggi,Pekerjaan Utama,Instansi/Institusi,Kategori Instansi/Institusi,Pemanfaatan Utama,Jenis Layanan,Fasilitas,Rujukan Utama,Pengaduan\n");

                    // Write data rows
                    int no = 1;
                    while (rs.next()) {
                        String nama = rs.getString("nama");
                        String tahunLahir = rs.getString("tahun_lahir");
                        String email = rs.getString("email");
                        String noHp = rs.getString("no_hp");
                        String jenisKelamin = rs.getString("jenis_kelamin");
                        String pendidikanTertinggi = rs.getString("pendidikan_tertinggi");
                        String pekerjaan = rs.getString("pekerjaan");
                        String instansi = rs.getString("instansi");
                        String katInstansi = rs.getString("kat_instansi");
                        String pemanfaatan = rs.getString("pemanfaatan");
                        String jenisLayanan = rs.getString("jenis_layanan");
                        String fasilitas = rs.getString("fasilitas");
                        String rujukanUtama = rs.getString("rujukan_utama");
                        String pengaduan = rs.getString("pengaduan");

                        writer.write(no++ + "," + nama + "," + tahunLahir + "," + email + "," +
                                noHp + "," + jenisKelamin + "," + pendidikanTertinggi + "," +
                                pekerjaan + "," + instansi + "," + katInstansi + "," + pemanfaatan + "," +
                                jenisLayanan + "," + fasilitas + "," + rujukanUtama + "," + pengaduan + "\n");
                    }

                    JOptionPane.showMessageDialog(null, "Data exported successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error exporting data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error exporting data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
}

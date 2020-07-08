/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbajuan;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksiProgram {
    public Connection kopro;
    
    
    public Connection openconn() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            kopro=DriverManager.getConnection("jdbc:mysql://localhost/toko_baju","root","");
            System.out.println("Koneksi Berjalan");
            return kopro;
            
        } catch(SQLException | ClassNotFoundException se){
            JOptionPane.showMessageDialog(null,"Koneksi Terputus \n Informasi : "+se);
            return null;
        }
    }
    
    public void closekoneksi() throws SQLException{
        try{
            if(kopro != null){
                System.out.print("Tutup Koneksi\n");
            }
        }catch(Exception ex){
        }
    }
}
